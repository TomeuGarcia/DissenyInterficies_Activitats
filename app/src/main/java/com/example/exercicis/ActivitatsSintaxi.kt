package com.example.exercicis


fun main()
{
    println("\nActivitat 1")
    helloName("Tomeu")

    println("\nActivitat 2")
    printInts(3, 8)

    println("\nActivitat 3")
    val l1 = listOf(1,2,3)
    val l2 = listOf(4,5,6)
    intercalaA(l1, l2)
    intercalaB(l1, l2)

    println("\nActivitat 4")
    printReverseAnyList(l1)

    println("\nActivitat 5")
    printReverseAnyMatrix(listOf(l1,l2))
}


// 1. Escriu una funció que et saludi fent servir el teu nom.
fun helloName(name: String)
{
    println("Hello " + name)
}

// 2. Escriu una funció que rep dos enters per paràmetre i els escriu separats amb un guionet
//    “-”. Fes ús de $ per concatenar els Strings.
fun printInts(a: Int, b: Int)
{
    println("$a-$b")
}

// 3. La funció intercala() rep dues llistes i imprimeix els seus elements de manera
//    intercalada
// a. Escriu la funció intercala() fent ús del for
fun intercalaA(l1: List<Int>, l2: List<Int>)
{
    val count = if (l1.size < l2.size) l1.size-1
                else l2.size-1

    for (i in 0..count-1) {
        print("${l1[i]}, ")
        print("${l2[i]}, ")
    }
    print("${l1[count]}, ")
    print("${l2[count]}\n")
}

// b. Escriu la funció intercala() sense fer ús del for.
fun intercalaB(l1: List<Int>, l2: List<Int>)
{
    val count = if (l1.size < l2.size) l1.size-1
                else l2.size-1

    var i = 0
    while (i < count) {
        print("${l1[i]}, ")
        print("${l2[i]}, ")
        ++i
    }
    print("${l1[count]}, ")
    print("${l2[count]}\n")
}

// 4. Escriu una funció que rep una llista que pot contenir qualsevol tipus d’elements i la
//    mostra per pantalla del revés.
fun printReverseAnyList(l: List<Any>)
{
    for (i in l.size-1 downTo 1) {
        print("${l[i]}, ")
    }
    print("${l.first()}\n")
}

// 5. Escriu una funció que rep una matriu que pot contenir qualsevol tipus d’elements i la
//    mostra per pantalla del revés.
fun printReverseAnyMatrix(m: List<List<Any>>)
{
    for (i in m.size-1 downTo 0) {
        printReverseAnyList(m[i])
    }
}
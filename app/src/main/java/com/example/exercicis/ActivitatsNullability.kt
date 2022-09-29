package com.example.exercicis


fun main()
{
    println("\nActivitat 1")
    variableTypes()

    println("\nActivitat 2")
    val a = listOf(1, 4, null)
    println("${a[0]} + ${a[1]} = ${nullSafetySum(a[0], a[1])}")
    println("${a[0]} + ${a[2]} = ${nullSafetySum(a[0], a[2])}")
    println("${a[2]} + ${a[1]} = ${nullSafetySum(a[2], a[1])}")
    println("${a[2]} + ${a[2]} = ${nullSafetySum(a[2], a[2])}")

    println("\nActivitat 3")
    println("$a -> ${nullSafetyAverage(a)}")

    println("\nActivitat 4")
    val b = listOf(1, 4, 8)
    val c: List<Int?>? = null
    println("$a -> ${nullControlAverage(a)}")
    println("$b -> ${nullControlAverage(b)}")
    println("$c -> ${nullControlAverage(c)}")
    println("null -> ${nullControlAverage(null)}")
    println("empty list -> ${nullControlAverage(listOf())}")

    println("\nActivitat 5")
    val d = listOf(1, 4, null, 2, 17, 12, null, -3)
    print("$d -> ")
    printOnlyOdds(d)
    print('\n')

    println("\nActivitat 6")
    val e = listOf(listOf(null, 3, null), listOf(5, 2, null))
    println("$e -> ${replaceNulls(e)}")
}


// 1. Donades les següents variables
fun variableTypes()
{
    // a. Indica’n el tipus i si pot ser o no nul·la
    var n: Int? = null                  // tipus Int?, SI pot ser null
    var s = "21"                        // tipus String, NO pot ser null
    val i = 203                         // tipus Int, NO pot ser null
    var j: Int? = 408                   // tipus Int?, SI pot ser null
    val l1 = listOf(1, null, 2)         // tipus List<Int?>, NO pot ser null
    val l2 = listOf(1, 5, 2)            // tipus List<Int>, NO pot ser null

    // b. Escriu el resultat de les següents instruccions, si aquestes compilen. En cas
    //    contrari, proposa una correcció per tal que s’executin.
    n?.plus(i)      // null
    n ?: 0          // 0
    (n ?: 0) + 3    // 3
    //n + i           // NO COMPILA, n?.plus(i)
    //i + j           // NO COMPILA, i?.plus(j ?: 0)
    s + n           // "21"
    //l1[2] + 3       // NO COMPILA l1[2]?.plus(3)
    l2[2] + 3       // 5
}

// 2. Escriu una funció que donats dos Int?, en retorni la suma. Els parametres nuls valen 0.
fun nullSafetySum(a: Int?, b: Int?) : Int
{
    return a?.plus(b ?: 0) ?: (b ?: 0)
}

// 3. Escriu una funció que rep per paràmetre una llista que pot ser nul·la i pot contenir
//    enters nuls. Aquesta funció ha de retornar la mitjana aritmètica sense tenir en compte
//    els valors nuls. Si la llista és nul·la, el resultat ha de ser zero.
fun nullSafetyAverage(list: List<Int?>?): Double
{
    if (list == null) return 0.0

    var sum = 0
    var size = 0

    for (e in list) {
        if (e != null) {
            sum += e
            ++size
        }
    }

    if (size == 0) return 0.0

    return sum.toDouble() / size
}

// 4. Escriu una funció que rep per paràmetre una llista que pot ser nul·la i pot contenir
//    enters nuls. Si la llista o qualsevol dels elements és nul, el resultat ha de ser nul,
//    altrament ha de retornar la mitjana aritmètica dels seus valors.
fun nullControlAverage(list: List<Int?>?): Double?
{
    if (list == null) return null

    var sum = 0
    var size = 0

    for (e in list) {
        if (e == null) return null

        sum += e
        ++size
    }

    if (size == 0) return 0.0

    return sum.toDouble() / size
}

// 5. Escriu una funció que rep una llista que pot contenir enters nuls i imprimeix per
//    pantalla només els nombres senars.
fun printOnlyOdds(list: List<Int?>)
{
    for (e in list) {
        if (e?.mod(2) == 1) print("$e, ")
    }
}

// 6. Escriu una funció que substitueix els valors nuls per valors aleatoris d’una matriu (llista
//    de llistes)
fun replaceNulls(matrix: List<List<Int?>>): List<List<Int>>
{
    val randomizedMatrix: List<MutableList<Int>> = List(matrix.size) { MutableList(matrix[0].size) {0} }

    for (i in 0..matrix.size-1) {
        for (j in 0 .. matrix[i].size-1) {
            randomizedMatrix[i][j] = matrix[i][j] ?: (-10..10).random()
        }
    }

    return randomizedMatrix
}
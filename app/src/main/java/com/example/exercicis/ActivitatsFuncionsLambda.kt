package com.example.exercicis

import kotlin.math.pow

fun main()
{
    println("\nActivitat 1");
    println(powers(listOf(1.0,2.0,3.0,4.0), 3));

    println("\nActivitat 2");
    println(productOfPairs(listOf(2,2,3,4)));

    println("\nActivitat 3");
    println(powersOf2(127.0))

    println("\nActivitat 4");
    val l = listOf(1,2,3,6)
    println(findInsert(l, 0))
    println(findInsert(l, 1))
    println(findInsert(l, 4))
    println(findInsert(l, 7))

    println("\nActivitat 5");
    println(equals(listOf(2,2,3,4),listOf(2,2,3,4)));
    println(equals(listOf('a','b','c','d'),listOf('a','b','d','d')));

    println("\nActivitat 6");
    println(similar(listOf(1,2,3,4),listOf(2,1,4,3)));
    println(similar(listOf(1,2,3,3),listOf(1,2,3,4)));

    println("\nActivitat 7");
    println(sumLists(listOf(1,1,2,2), listOf(10,11,12,13)));

    println("\nActivitat 8");
    println(anonymousMathOperation(3, 4, { a, b -> (a+b).toDouble()} ))
    println(anonymousMathOperation(3, 4, { a, b -> (a*b).toDouble()} ))
    println(anonymousMathOperation(3, 4, { a, b -> (a.toDouble().pow(b))} ))
}


// 1. Escriu una funció que calculi les potències d’una llista de Doubles
fun powers(list: List<Double>, power: Int): List<Double>
{
    return list.map{
        it.pow(power)
    }
}

// 2. Escriu una funció que calculi el producte dels nombres parells d’una llista
fun productOfPairs(list: List<Int>): Double
{
    var p = 1.0;
    list.forEach {
        if (it % 2 == 0) p *= it
    }
    return p
}

// 3. Escriu una funció que calculi les potències de 2 fins el nombre indicat
fun powersOf2(limit: Double): List<Double>
{
    val list = ArrayList<Double>()
    val max = kotlin.math.log2(limit).toInt() +1

    repeat(max){
        list.add(2.0.pow(it))
    }

    return list
}

//4. Implementa la següent funció que donada llista d’enters ordenada, indiqui la posició on
//   cal inserir un nou element
fun findInsert(orderedList: List<Int>, newNumber: Int): Int
{
    orderedList.forEachIndexed { i, element ->
        if (newNumber <= element) return i
    }
    return orderedList.size
}

// 5. Implementa una funció que indiqui si dues llistes són iguals (tenen exactament els
//    mateixos elements en la mateixa posició). Podeu fer servir la capçelera que preferiu.
fun <E> equals(l1: List<E>, l2: List<E>): Boolean
{
    if (l1.size != l2.size) return false

    l1.zip(l2){ element1, element2 ->
        if (element1 != element2) return false
    }
    return true
}

// 6. Implementa una funció que indiqui si dues llistes contenen els mateixos elements
//    (tenen els mateixos elements, tot i que no importa si estan en el mateix ordre ni
//    repetits). Podeu fer servir la capçelera que preferiu.
fun <E> similar(l1: List<E>, l2: List<E>): Boolean
{
    l1.forEach { element1 ->
        if (!l2.any{it == element1}) return false
    }

    l2.forEach { element2 ->
        if (!l1.any{it == element2}) return false
    }

    return true
}

// 7. Fes una funció que sumi element a element dues llistes d’enters
fun sumLists(l1: List<Int>, l2: List<Int>): List<Int>
{
    return l1.zip(l2) { element1, element2 ->
        element1 + element2
    }
}

// 8. Una una funció rep dos nombres i una funció lambda amb la següent capçalera:
//    a. Fes que la funció retorni el resultat d’aplicar la funció lambda sobre aquests dos
//       nombres.
//    b. Proposa 3 exemples de crides a aquesta funció.
fun anonymousMathOperation(a: Int, b: Int, operation: (Int, Int) -> Double): Double
{
    return operation(a, b)
}

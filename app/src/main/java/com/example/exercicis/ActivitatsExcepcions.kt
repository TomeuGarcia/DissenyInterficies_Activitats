package com.example.exercicis

fun main()
{
    println("\nExercicis Excepcions")
    println("\nExercici 1")
    println(catchExceptionDangerousCalcA())

    println("\nExercici 2")
    catchExceptionDangerousCalcB()

    println("\nExercici 3")
    println(filterByIndex(listOf("a","b", "c", "d"), listOf(1, null, 5, 3)))

    println("\nExercici 4")
    println(cut(listOf("a", "b", "c", "d"), 1, 3))
    println(cut(listOf("a", "b", "c", "d"), end = 3))
    println(cut(listOf("a", "b", "c", "d"), ini = 3))
    println(cut(listOf("a", "b", "c", "d"), -1, 10))
    println(cut(listOf("a", "b", "c", "d"), -4, -2))
    println(cut(listOf("a", "b", "c", "d"), 10, 20))
    println(cut(listOf("a", "b", "c", "d"), 1, 0))
}



fun makeSomeDangerousCalc(): Int {
    val randomNumber =(0..100).random()
    return if (randomNumber > 50) randomNumber else throw ArithmeticException()
}


// 1. Copia la següent funció. Aquesta funció té la particularitat que de vegades retorna un
//    enter, però d’altres peta i llança una excepció del tipus ArithmeticException.

// a. Fes una altra funció que s’encarregui de cridar aquesta i, en cas d’error, retorni -1.
fun catchExceptionDangerousCalcA() : Int {
    return try {
        makeSomeDangerousCalc()
    } catch(e: java.lang.ArithmeticException) {
        -1
    }
}

// b. Fes una altra funció que cridi aquesta tantes vegades com faci falta fins que el resultat
//    d’aquesta funció no sigui una Excepció.
fun catchExceptionDangerousCalcB() : Int {
    println("Successful results: ")

    try {
        while (true) {
            println(makeSomeDangerousCalc())
        }
    } catch(e: java.lang.ArithmeticException) {
        return -1
    }
}

// 2. Fes una funció que rep una llista d’elements de qualsevol tipus i una llista d’índexos. Aquesta
//    ha de retornar els elements de la primera llista que es troben en les posicions indicades a la llista
//    d’índexos.

fun filterByIndex(list: List<Any>, indexs: List<Int?>): List<Any>
{
    val elementsByIndex = ArrayList<Any>()

    for (index in indexs) {
        if (index != null && index > -1 && index < list.size)
        {
            elementsByIndex.add(list[index])
        }
    }

    return elementsByIndex
}

// 3. Implementa una funció que donada una llista, un índex inicial i un índex final, retorni la
//    subllista continguda en la primera des del primer índex fins al final. Nota: No es pot fer servir
//    List.sublist()
// ● Si els índexos són incoherents (ini >= end), s’ha de retornar una llista buida.
// ● Si els índexos se surten de la llista, s’ha de retornar només el tros de la llista que és
//    correcte.
// ● Els paràmetres ini i fin han de ser opcionals:
//      ○ ini = 0
//      ○ end = {últim índex de la llista}

fun cut(list: List<Any>, ini: Int = 0, end: Int = list.size-1): List<Any>
{
    val cutList = arrayListOf<Any>()

    if (ini > end) return cutList

    val first = kotlin.math.max(ini, 0)
    val last = kotlin.math.min(end, list.size-1)

    for (i in first..last) {
        cutList.add(list[i])
    }

    return cutList
}
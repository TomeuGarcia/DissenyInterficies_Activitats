package com.example.exercicis

fun main()
{

    println("\nActivitat 1")
    println("plus -> OR")
    println(true+true)
    println(true+false)
    println(false+true)
    println(false+false)

    println("\ntimes -> AND")
    println(true*true)
    println(true*false)
    println(false*true)
    println(false*false)

    println("\nActivitat 2")
    val a = DataClass(3.0, 2f, 1);
    val b = DataClass(5.0, 1f, 5);
    println(a)
    println(a < 5.0)
    println(a > 5.0)
    println(a >= 1.0)
    println(a + b)

    val dataClasses = listOf(DataClass(1.0, 1f, 1),
                             DataClass(2.0, 2f, 2),
                             DataClass(3.0, 3f, 3),
                             DataClass(4.0, 4f, 4))
    val ints = listOf(10, 20, 30, 40)
    println(agrupa(dataClasses, ints))

}


// 1. Fes overload dels operators plus i times per la classe Boolean, per tal que l’operador +
//    implementi l’operador binari OR i l’operador * implementi l’operador binari AND.

operator fun Boolean.plus(other: Boolean) : Boolean
{
    return this || other
}

operator fun Boolean.times(other: Boolean) : Boolean
{
    return this && other
}


// 2. Implementa una data class que emmagatzemi com a mínim 3 dades, una de les quals
//    ha de ser un Double.

class DataClass(var data1: Double,
                var data2: Float,
                var data3: Int)
{
    // a. Comprova que el print() imprimeix diferent que si no fos una data class.
//    operator fun print(): String
//    {
//        return data1.toString()
//    }

    // b. Fes overload de l’operator compareTo() , que compari el una variable numerica
    //    pertanyent a la classe.
    operator fun compareTo(value: Double): Int
    {
        if (data1 < value) return -1
        if (data1 > value) return 1
        return 0
    }

    // c. Fes overload de l’operator plus(), per tal que aplicat a dos objectes d’aquesta
    //    classe, retorni un nou objecte random.
    operator fun plus(other: DataClass) : DataClass
    {
        return DataClass((0..1).random().toDouble(),
                         (0..1).random().toFloat(),
                         (0..1).random())
    }

    operator fun plus(otherInt: Int) : Pair<DataClass, Int>
    {
        return Pair(this, otherInt)
    }

}

// d. Implementa una funció que donada una llista d’elements d’aquesta classe i una
//    llista d’enters, els agrupi en Pair<T, Int>
fun agrupa(obj: List<DataClass>, count: List<Int>): List<Pair<DataClass, Int>>
{
    val grouped = ArrayList<Pair<DataClass, Int>>()
    obj.zip(count) { element1, element2 ->
        grouped.add(element1 + element2)
    }
    return grouped
}

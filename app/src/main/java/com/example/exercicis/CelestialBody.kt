package com.example.exercicis

class Vector3(var x: Float, var y: Float, var z: Float)
{}


const val K_GRAVITATION: Double = 0.0000000000667
const val LIGHT_SPEED: Double = 300000000.0


open class CelestialBody(protected val name: String,
                    var distanceToEarth: Double,
                    val isVisibleToNakedEye: Boolean)
{
    var positionInSky: Vector3

    init
    {
        positionInSky = Vector3(0.0f, 0.0f, 0.0f)
    }


    open fun printName()
    {
        print(name)
    }

}
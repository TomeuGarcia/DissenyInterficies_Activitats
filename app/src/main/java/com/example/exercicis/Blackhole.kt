package com.example.exercicis

class Blackhole(name: String,
                distanceToEarth: Double,
                isVisibleToNakedEye: Boolean,
                val rotationVelocity: Double,
                val mass: Double)

    : CelestialBody(name,
                    distanceToEarth,
                    isVisibleToNakedEye)
{

    fun calculateSchwarzschildRadius() : Double?
    {
        if (rotationVelocity != 0.0) return null
        return (2 * K_GRAVITATION * mass) / (LIGHT_SPEED * LIGHT_SPEED)
    }

}
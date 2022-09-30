package com.example.exercicis

class Blackhole(name: String,
                distanceToEarth: Double,
                isVisibleToNakedEye: Boolean,
                positionInSky: Vector3,
                var rotationVelocity: Double,
                val mass: Double)

    : CelestialBody(name,
                    distanceToEarth,
                    isVisibleToNakedEye,
                    positionInSky)
{

    public fun calculateSchwarzschildRadius() : Double?
    {
        if (rotationVelocity != 0.0) return null
        return (2 * K_GRAVITATION * mass) / (LIGHT_SPEED * LIGHT_SPEED)
    }

}
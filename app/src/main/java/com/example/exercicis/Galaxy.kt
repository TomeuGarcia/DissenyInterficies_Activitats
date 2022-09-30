package com.example.exercicis

class Galaxy(name: String,
             distanceToEarth: Double,
             isVisibleToNakedEye: Boolean,
             positionInSky: Vector3,
             val numberOfStars: Int,
             val currentLuminosity: Double)
    : CelestialBody(name,
                    distanceToEarth,
                    isVisibleToNakedEye,
                    positionInSky)
{

}
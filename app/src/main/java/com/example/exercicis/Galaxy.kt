package com.example.exercicis

class Galaxy(name: String,
             distanceToEarth: Double,
             isVisibleToNakedEye: Boolean,
             val numberOfStars: Int,
             var currentLuminosity: Double)
    : CelestialBody(name,
                    distanceToEarth,
                    isVisibleToNakedEye)
{

}
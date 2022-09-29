package com.example.exercicis

class Star(name: String,
           distanceToEarth: Double,
           isVisibleToNakedEye: Boolean,
           var todaySurfaceTemperature: Double,
           val coreTemperature: Double,
           val belongsTo: Galaxy?)
    : CelestialBody(name,
                    distanceToEarth,
                    isVisibleToNakedEye)
{
    val orbitingPlanets: ArrayList<CelestialBody>

    init
    {
        orbitingPlanets = arrayListOf<CelestialBody>()
    }


    override fun printName()
    {
        print("Star name: ")
        super.printName()
    }

    fun countNumberOfPlanetsOnOrbit() : Int
    {
        return orbitingPlanets.size
    }

    fun addPlanetToOrbit(planet: CelestialBody)
    {
        orbitingPlanets.add(planet)
    }

}
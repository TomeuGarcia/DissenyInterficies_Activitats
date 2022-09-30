package com.example.exercicis

class Star(name: String,
           distanceToEarth: Double,
           isVisibleToNakedEye: Boolean,
           positionInSky: Vector3,
           var todaySurfaceTemperature: Double,
           var coreTemperature: Double,
           val belongsTo: Galaxy?)
    : CelestialBody(name,
                    distanceToEarth,
                    isVisibleToNakedEye,
                    positionInSky)
{
    val orbitingPlanets: ArrayList<CelestialBody>

    init
    {
        orbitingPlanets = arrayListOf<CelestialBody>()
    }


    public override fun printName()
    {
        print("Star name: ")
        super.printName()
    }

    public fun countNumberOfPlanetsOnOrbit() : Int
    {
        return orbitingPlanets.size
    }

    public fun addPlanetToOrbit(planet: CelestialBody)
    {
        orbitingPlanets.add(planet)
    }

}
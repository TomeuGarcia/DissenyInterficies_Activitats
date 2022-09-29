package com.example.exercicis


fun main() {
    val blackhole1: Blackhole = Blackhole(
        "blackhole_1", 10000.0, false,
        234.0, 8888888888.0
    )
    val galaxy1: Galaxy = Galaxy(
        "galaxy_1", 8000.0, false,
        666, 13.0
    )
    val galaxy2: Galaxy = Galaxy(
        "galaxy_2", 3456.0, true,
        222, 28.0
    )
    val star1: Star = Star(
        "star_1", 34500.0, true,
        578495.0, 99999999.0, galaxy1
    )
    val star2: Star = Star(
        "star_2", 2000.0, true,
        123545.0, 99999999.0, galaxy2
    )
    val star3: Star = Star(
        "star_3", 5000000.0, false,
        895467.0, 99999999.0, galaxy2
    )

    val bodies = listOf<CelestialBody>(blackhole1, galaxy1, star1, star2, star3)


    println("\nExercicis Classes i Herencia")

    println("\nFarthest Celestial Body:")
    findTheFarthest(bodies)?.printName()
    println()

    print("\nStars in galaxy: ")
    galaxy2.printName()
    println()
    val filteredStars = filterByGalaxy(listOf(star1, null, star2, star3), galaxy2)
    for (star in filteredStars){
        star.printName()
        println()
    }
}

fun findTheFarthest(celestialBodies: List<CelestialBody>): CelestialBody?
{
    var furthestDistance: Double = 0.0
    var furthestCelestialBody: CelestialBody? = null

    for (celestialBody in celestialBodies){
        if (furthestDistance < celestialBody.distanceToEarth) {
            furthestDistance = celestialBody.distanceToEarth
            furthestCelestialBody = celestialBody
        }
    }

    return furthestCelestialBody
}


fun filterByGalaxy(stars: List<Star?>, galaxy: Galaxy) : List<Star>
{
    val galaxyStars: ArrayList<Star> = arrayListOf<Star>()

    for (star in stars)
    {
        if (star?.belongsTo != null && star.belongsTo == galaxy){
            galaxyStars.add(star)
        }
    }

    return galaxyStars
}
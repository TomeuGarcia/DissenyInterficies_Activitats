package com.example.exercicis

import android.graphics.Color

data class ParticleData(val name: String, val family: ParticleFamilies)
{
    enum class ParticleFamilies
    {
        FAMILY_1, FAMILY_2, FAMILY_3, FAMILY_4
    }

    companion object
    {
        val familyToColor = mapOf<ParticleFamilies, Int>(
            ParticleFamilies.FAMILY_1 to Color.MAGENTA,
            ParticleFamilies.FAMILY_2 to Color.GREEN,
            ParticleFamilies.FAMILY_3 to Color.YELLOW,
            ParticleFamilies.FAMILY_4 to Color.RED)
    }
}
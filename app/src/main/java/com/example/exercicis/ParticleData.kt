package com.example.exercicis

import android.graphics.Color

data class ParticleData(val name: String, val family: ParticleFamilies)
{
    enum class ParticleFamilies
    {
        QUARKS, LEPTONS, GAUGE_BOSONS, SCALAR_BOSONS
    }

    companion object
    {
        val familyToColor = mapOf<ParticleFamilies, Int>(
            ParticleFamilies.QUARKS to Color.MAGENTA,
            ParticleFamilies.LEPTONS to Color.GREEN,
            ParticleFamilies.GAUGE_BOSONS to Color.RED,
            ParticleFamilies.SCALAR_BOSONS to Color.YELLOW)
    }
}
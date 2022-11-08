package com.example.exercicis.particles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicis.databinding.ActivityParticlesBinding

class ParticlesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityParticlesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityParticlesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initParticles();
    }

    private fun initParticles()
    {
        val particles = listOf<ParticleData>(
            ParticleData("Quark Up", ParticleData.ParticleFamilies.QUARKS),
            ParticleData("Quark Charm", ParticleData.ParticleFamilies.QUARKS),
            ParticleData("Quark Top", ParticleData.ParticleFamilies.QUARKS),
            ParticleData("Quark Down", ParticleData.ParticleFamilies.QUARKS),
            ParticleData("Quark Strange", ParticleData.ParticleFamilies.QUARKS),
            ParticleData("Quark Bottom", ParticleData.ParticleFamilies.QUARKS),
            ParticleData("Electron", ParticleData.ParticleFamilies.LEPTONS),
            ParticleData("Muon", ParticleData.ParticleFamilies.LEPTONS),
            ParticleData("Tau", ParticleData.ParticleFamilies.LEPTONS),
            ParticleData("Electron neutrino", ParticleData.ParticleFamilies.LEPTONS),
            ParticleData("Tau neutrino", ParticleData.ParticleFamilies.LEPTONS),
            ParticleData("Gluon", ParticleData.ParticleFamilies.GAUGE_BOSONS),
            ParticleData("Photon", ParticleData.ParticleFamilies.GAUGE_BOSONS),
            ParticleData("Z boson", ParticleData.ParticleFamilies.GAUGE_BOSONS),
            ParticleData("W boson", ParticleData.ParticleFamilies.GAUGE_BOSONS),
            ParticleData("Higgs", ParticleData.ParticleFamilies.SCALAR_BOSONS)
        )

        binding.particlesRecycleView.adapter = ParticlesAdapter(particles)
    }


}
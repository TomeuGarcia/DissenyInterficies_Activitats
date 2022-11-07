package com.example.exercicis

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
            ParticleData("Quark Up", ParticleData.ParticleFamilies.FAMILY_1),
            ParticleData("Quark Charm", ParticleData.ParticleFamilies.FAMILY_1),
            ParticleData("Quark Top", ParticleData.ParticleFamilies.FAMILY_1),
            ParticleData("Quark Down", ParticleData.ParticleFamilies.FAMILY_1),
            ParticleData("Quark Strange", ParticleData.ParticleFamilies.FAMILY_1),
            ParticleData("Quark Bottom", ParticleData.ParticleFamilies.FAMILY_1),
            ParticleData("Electron", ParticleData.ParticleFamilies.FAMILY_2),
            ParticleData("Muon", ParticleData.ParticleFamilies.FAMILY_2),
            ParticleData("Tau", ParticleData.ParticleFamilies.FAMILY_2),
            ParticleData("Electron neutrino", ParticleData.ParticleFamilies.FAMILY_2),
            ParticleData("Tau neutrino", ParticleData.ParticleFamilies.FAMILY_2),
            ParticleData("Gluon", ParticleData.ParticleFamilies.FAMILY_3),
            ParticleData("Photon", ParticleData.ParticleFamilies.FAMILY_3),
            ParticleData("Z boson", ParticleData.ParticleFamilies.FAMILY_3),
            ParticleData("W boson", ParticleData.ParticleFamilies.FAMILY_3),
            ParticleData("Higgs", ParticleData.ParticleFamilies.FAMILY_4)
        )

        binding.particlesRecycleView.adapter = ParticlesAdapter(particles)
    }


}
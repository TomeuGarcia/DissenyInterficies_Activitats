package com.example.exercicis.particles

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicis.databinding.ItemParticleBinding

class ParticlesAdapter(private val particles: List<ParticleData>)
    : RecyclerView.Adapter<ParticlesAdapter.ParticlesViewHolder>()
{
    inner class ParticlesViewHolder(binding: ItemParticleBinding)
        : RecyclerView.ViewHolder(binding.root)
    {
        val name = binding.particleName
        val image = binding.particleImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticlesViewHolder
    {
        var layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemParticleBinding.inflate(layoutInflater)

        return ParticlesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParticlesViewHolder, position: Int) {
        val particle = particles[position]

        holder.name.text = particle.name;
        holder.image.setColorFilter(ParticleData.familyToColor[particle.family] ?: Color.BLACK)
    }

    override fun getItemCount(): Int = particles.size
}
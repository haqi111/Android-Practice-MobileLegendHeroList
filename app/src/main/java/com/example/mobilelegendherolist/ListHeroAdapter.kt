package com.example.mobilelegendherolist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false))

    }
    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo,lore,skillA,skillB,skillC) = listHero[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailHeroActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("description", description)
            intent.putExtra("photo", photo)
            intent.putExtra("lore", lore)
            intent.putExtra("skillA", skillA)
            intent.putExtra("skillB", skillB)
            intent.putExtra("skillC", skillC)
            holder.itemView.context.startActivities(arrayOf(intent))
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_hero)
        val tvName: TextView = itemView.findViewById(R.id.tv_hero_names)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_hero_description)
    }
}
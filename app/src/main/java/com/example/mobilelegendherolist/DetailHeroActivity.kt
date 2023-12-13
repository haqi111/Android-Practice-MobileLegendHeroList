package com.example.mobilelegendherolist

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailHeroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)

        supportActionBar?.apply {
            title = getString(R.string.heroes_name)
        }

        val photo= findViewById<ImageView>(R.id.img_hero)
        val name = findViewById<TextView>(R.id.tv_hero_names)
        val description= findViewById<TextView>(R.id.tv_hero_description)
        val lore= findViewById<TextView>(R.id.tv_hero_detail)
        val skillA = findViewById<TextView>(R.id.tv_skillA)
        val skillB = findViewById<TextView>(R.id.tv_skillB)
        val skillC = findViewById<TextView>(R.id.tv_skillC)

        val intentData: Intent = intent


        photo.setImageResource(intentData.getIntExtra("photo", 0))
        name.text = intentData.getStringExtra("name")
        description.text = intentData.getStringExtra("description")
        lore.text = intentData.getStringExtra("lore")
        skillA.text = intentData.getStringExtra("skillA")
        skillB.text = intentData.getStringExtra("skillB")
        skillC.text = intentData.getStringExtra("skillC")


    }
}
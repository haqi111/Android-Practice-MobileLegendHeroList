package com.example.mobilelegendherolist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
        val name: String,
        val description: String,
        val photo: Int,
        val lore: String,
        val skillA: String,
        val skillB: String,
        val skillC: String
) : Parcelable


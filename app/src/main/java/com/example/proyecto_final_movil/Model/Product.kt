package com.example.proyecto_final_movil.Model

import com.google.gson.annotations.SerializedName


data class Product(
    @SerializedName("id")val id: Int,
    @SerializedName("name")val nombre: String)

package com.example.proyecto_final_movil.Recyclerviews.Service

import com.example.proyecto_final_movil.Model.Product

import retrofit2.Response
import retrofit2.http.GET

interface ProductApiService {
    @GET("/products/") // Cambia la URL según tu endpoint
    suspend fun getProductos(): List<Product>
}
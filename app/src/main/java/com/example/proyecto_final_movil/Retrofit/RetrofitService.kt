package com.example.proyecto_final_movil.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    private fun getRetroFit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://192.168.20.106:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}
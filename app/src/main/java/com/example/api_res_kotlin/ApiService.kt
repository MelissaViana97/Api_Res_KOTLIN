package com.example.api_res_kotlin


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path



interface ApiService {
    @GET("{raza}/images")
    fun getDogsByBredd(@Path("raza")raza:String?):Call<DogsResponse?>?
}
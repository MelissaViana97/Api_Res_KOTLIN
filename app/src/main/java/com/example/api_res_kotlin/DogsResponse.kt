package com.example.api_res_kotlin

import com.google.gson.annotations.SerializedName
import javax.net.ssl.SSLEngineResult.Status

class DogsResponse {
    @SerializedName("status")
    private var status: String? = null

    @SerializedName("message")
    private var images: List<String>?= null

    fun getStatus():String?{
      return  status
    }

    fun setStatus(status: String){
        this.status=status
    }

    fun getImages():List<String>?{
        return images
    }

    fun setImages(Images:List<String?>?){
        this.images=images
    }
}
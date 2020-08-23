package com.feelsokman.androidtemplate.net.net

import com.feelsokman.androidtemplate.net.net.model.UploadResponse
import retrofit2.Response
import retrofit2.http.GET

interface UploadService {

    @GET("/todos/{id}")
    suspend fun uploadStuff(): Response<UploadResponse>
}

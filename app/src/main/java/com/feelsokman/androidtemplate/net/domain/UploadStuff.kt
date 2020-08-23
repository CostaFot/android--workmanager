package com.feelsokman.androidtemplate.net.domain

import com.feelsokman.androidtemplate.core.coroutine.DispatcherProvider
import com.feelsokman.androidtemplate.net.net.UploadService
import com.feelsokman.androidtemplate.net.net.model.UploadResponse
import kotlinx.coroutines.withContext

class UploadStuff(
    private val uploadService: UploadService,
    private val dispatcherProvider: DispatcherProvider
) {
    suspend fun upload(): UploadResponse? {
        return withContext(dispatcherProvider.io) {
            try {
                // something that will take a while..
                val response = uploadService.uploadStuff()
                if (response.isSuccessful) {
                    response.body()
                } else {
                    null
                }
            } catch (exception: Exception) {
                null
            }
        }
    }
}

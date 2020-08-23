package com.feelsokman.androidtemplate.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.feelsokman.androidtemplate.net.domain.UploadStuff
import com.feelsokman.androidtemplate.net.net.model.UploadResponse

class UploadWorker(
    appContext: Context,
    workerParams: WorkerParameters,
    private val uploadStuff: UploadStuff
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        val response: UploadResponse? = uploadStuff.upload()
        return if (response != null) {
            Result.success()
        } else {
            Result.failure()
        }
    }
}





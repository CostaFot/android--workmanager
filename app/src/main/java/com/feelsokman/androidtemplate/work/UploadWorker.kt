package com.feelsokman.androidtemplate.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.feelsokman.androidtemplate.net.domain.UploadStuffRepository
import com.feelsokman.androidtemplate.net.net.model.UploadResponse

class UploadWorker(
    appContext: Context,
    workerParams: WorkerParameters,
    private val uploadStuffRepository: UploadStuffRepository
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        val response: UploadResponse? = uploadStuffRepository.upload()
        return if (response != null) {
            Result.success()
        } else {
            Result.failure()
        }
    }
}





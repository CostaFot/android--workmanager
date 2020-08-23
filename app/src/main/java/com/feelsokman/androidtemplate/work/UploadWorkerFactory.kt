package com.feelsokman.androidtemplate.work

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import com.feelsokman.androidtemplate.net.domain.UploadStuffRepository

class UploadWorkerFactory(
    private val uploadStuffRepository: UploadStuffRepository
) : WorkerFactory() {

    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker? {

        return when (workerClassName) {
            UploadWorker::class.java.name ->
                UploadWorker(appContext, workerParameters, uploadStuffRepository)
            else ->
                // Return null, so that the base class can delegate to the default WorkerFactory.
                null
        }
    }
}

package com.feelsokman.androidtemplate.work

import androidx.work.DelegatingWorkerFactory
import com.feelsokman.androidtemplate.net.domain.UploadStuffRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WorkerFactory @Inject constructor(
    uploadStuffRepository: UploadStuffRepository
) : DelegatingWorkerFactory() {
    init {
        addFactory(UploadWorkerFactory(uploadStuffRepository))
    }
}

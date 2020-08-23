package com.feelsokman.androidtemplate.work

import androidx.work.DelegatingWorkerFactory
import com.feelsokman.androidtemplate.net.domain.UploadStuff
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TemplateWorkerFactory @Inject constructor(
    uploadStuff: UploadStuff
) : DelegatingWorkerFactory() {
    init {
        addFactory(UploadWorkerFactory(uploadStuff))
    }
}

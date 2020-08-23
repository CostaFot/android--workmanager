package com.feelsokman.androidtemplate.ui.fragments.host.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.feelsokman.androidtemplate.net.domain.UploadStuff
import timber.log.Timber
import javax.inject.Inject

class HostViewModel @Inject constructor(
    private val uploadStuff: UploadStuff
) : ViewModel() {

    val textData = MutableLiveData<String>()

    fun getTodos() {

    }

    override fun onCleared() {
        Timber.tag("NavigationLogger").d("HostViewModel cleared")
        super.onCleared()
    }
}

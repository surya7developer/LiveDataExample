package com.suresh.lifecycleaware.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    private var liveDataObject = MutableLiveData<String>("This is Live Data Example")
    val liveData : LiveData<String> get() = liveDataObject

    fun updateData(){
        liveDataObject.value = "New data arrived"
    }

}
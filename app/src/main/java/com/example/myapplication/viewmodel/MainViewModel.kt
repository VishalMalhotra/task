package com.example.myapplication.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.model.Response
import com.example.myapplication.repository.MainRepository
import java.util.ArrayList

class MainViewModel(
    application: Application
) : AndroidViewModel(application) {
    private val repository: MainRepository = MainRepository(application)

    fun upateUserSettings():MutableLiveData<List<Response>> {
       return repository.update()

    }

}
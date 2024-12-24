package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp2pam.navigation.Screen

class DokterAddViewModel : ViewModel() {
    private val _dokters = MutableLiveData<List<Screen.Dokter>>(mutableListOf())
    val dokters: LiveData<List<Screen.Dokter>> get() = _dokters

    fun addDokter(dokter: Screen.Dokter) {
        val updatedList = _dokters.value?.toMutableList() ?: mutableListOf()
        updatedList.add(dokter)
        _dokters.value = updatedList
    }
}
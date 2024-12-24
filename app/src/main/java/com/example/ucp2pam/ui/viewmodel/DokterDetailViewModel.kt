package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp2pam.navigation.Screen

class DokterDetailViewModel : ViewModel() {
    private val _selectedDokter = MutableLiveData<Screen.Dokter?>()
    val selectedDokter: LiveData<Screen.Dokter?> get() = _selectedDokter

    fun selectDokter(dokter: Screen.Dokter) {
        _selectedDokter.value = dokter
    }
}
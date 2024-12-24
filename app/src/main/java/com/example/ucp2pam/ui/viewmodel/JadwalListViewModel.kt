package com.example.ucp2pam.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp2pam.navigation.Screen
import com.example.ucp2pam.navigation.Screen.Companion.Jadwal

class JadwalListViewModel : ViewModel() {
    private val _jadwals = MutableLiveData<List<Screen.Jadwal>>()
    val jadwals: LiveData<List<Screen.Jadwal>> get() = _jadwals

    fun loadJadwals() {
        _jadwals.value = listOf(
            Jadwal("dr. Farhan Azriel", "2024-12-25", "13:00"),
            Jadwal("dr. Siti Hajar", "2024-12-26", "10:00")
        )
    }
}
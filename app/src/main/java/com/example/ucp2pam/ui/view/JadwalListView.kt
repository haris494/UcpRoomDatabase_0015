package com.example.ucp2pam.ui.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import com.example.ucp2pam.Costumwidget.JadwalCard
import com.example.ucp2pam.navigation.Screen

@Composable
fun JadwalListView(jadwals: List<Screen.Jadwal>, onJadwalClick: (Screen.Jadwal) -> Unit) {
    LazyColumn {
        items(jadwals) { jadwal ->
            JadwalCard(jadwal = jadwal, onClick = { onJadwalClick(jadwal) })
        }
    }
}

fun items(count: List<Screen.Jadwal>, itemContent: @Composable() (LazyItemScope.(index: Int) -> Unit)) {
    TODO("Not yet implemented")
}

fun onJadwalClick(jadwal: Int) {
        TODO("Not yet implemented")
}

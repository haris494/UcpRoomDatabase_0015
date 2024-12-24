package com.example.ucp2pam.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ucp2pam.navigation.Screen

@Composable
fun CombinedDokterAndJadwalView(
    dokters: List<Screen.Dokter>,
    jadwals: List<Screen.Jadwal>,
    onDokterClick: (Screen.Dokter) -> Unit,
    onJadwalClick: (Screen.Jadwal) -> Unit
) {
    Column {
        Text(text = "Daftar Dokter", style = MaterialTheme.typography.headlineLarge, modifier = Modifier.padding(16.dp))
        DokterListView(dokters = dokters, onDokterClick = onDokterClick)
        Text(text = "Daftar Jadwal", style = MaterialTheme.typography.headlineLarge, modifier = Modifier.padding(16.dp))
        JadwalListView(jadwals = jadwals, onJadwalClick = onJadwalClick)
    }
}
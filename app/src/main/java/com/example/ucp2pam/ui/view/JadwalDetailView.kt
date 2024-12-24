package com.example.ucp2pam.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ucp2pam.navigation.Screen

@Composable
fun JadwalDetailView(jadwal: Screen.Jadwal) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Nama Dokter: ${jadwal.namaDokter}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Tanggal: ${jadwal.tanggal}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Waktu: ${jadwal.waktu}", style = MaterialTheme.typography.bodyLarge)
    }
}
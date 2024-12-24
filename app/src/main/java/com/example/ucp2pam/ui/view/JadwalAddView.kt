package com.example.ucp2pam.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ucp2pam.navigation.Screen

@Composable
fun JadwalAddView(onJadwalAdded: (Screen.Jadwal) -> Unit) {
    var namaDokter by remember { mutableStateOf("") }
    var tanggal by remember { mutableStateOf("") }
    var waktu by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(value = namaDokter, onValueChange = { namaDokter = it }, label = { Text(
            "Nama Dokter",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        TextField(value = tanggal, onValueChange = { tanggal = it }, label = { Text(
            "Tanggal",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        TextField(value = waktu, onValueChange = { waktu = it }, label = { Text(
            "Waktu",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        Button(onClick = {
            val jadwal = Screen.Jadwal(namaDokter = namaDokter, tanggal = tanggal, waktu = waktu)
            onJadwalAdded(jadwal)
        }) {
            Text("Tambah Jadwal", Modifier.padding(16.dp), MaterialTheme.typography.h5)
        }
    }
}
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
fun DokterAddView(onDokterAdded: (Screen.Dokter) -> Unit) {
    var nama by remember { mutableStateOf("") }
    var spesialisasi by remember { mutableStateOf("") }
    var lokasi by remember { mutableStateOf("") }
    var jamPraktik by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(value = nama, onValueChange = { nama = it }, label = { Text(
            "Nama",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        TextField(value = spesialisasi, onValueChange = { spesialisasi = it }, label = { Text(
            "Spesialisasi",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        TextField(value = lokasi, onValueChange = { lokasi = it }, label = { Text(
            "Lokasi",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        TextField(value = jamPraktik, onValueChange = { jamPraktik = it }, label = { Text(
            "Jam Praktik",
            Modifier.padding(16.dp),
            MaterialTheme.typography.h5
        ) })
        Button(onClick = {
            val dokter = Screen.Dokter(
                nama = nama,
                spesialisasi = spesialisasi,
                lokasi = lokasi,
                jamPraktik = jamPraktik
            )
            onDokterAdded(dokter)
        }) {
            Text("Tambah Dokter", Modifier.padding(16.dp), MaterialTheme.typography.h5)
        }
    }
}

private fun Screen.Companion.Dokter(
    nama: String,
    spesialisasi: String,
    lokasi: String,
    jamPraktik: String
): Screen.Dokter {
    TODO("Not yet implemented")
}

fun Text(text: String, modifier: Any, style: Any) {

}

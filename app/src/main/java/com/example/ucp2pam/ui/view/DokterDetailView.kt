package com.example.ucp2pam.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.ucp2pam.navigation.Screen

@Composable
fun DokterDetailView(dokter: Screen.Dokter) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = dokter.nama, style = MaterialTheme.typography.headlineLarge)
        Text(text = dokter.spesialisasi, style = MaterialTheme.typography.bodyLarge)
        Text(text = dokter.lokasi, style = MaterialTheme.typography.bodyLarge)
        Text(text = "Jam Praktik: ${dokter.jamPraktik}", style = MaterialTheme.typography.bodyLarge)
    }
}

fun Text(text: Any, style: TextStyle) {
        TODO("Not yet implemented")
}


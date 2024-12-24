package com.example.ucp2pam.Costumwidget

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun JadwalCard(jadwal: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = jadwal.namaDokter, style = MaterialTheme.typography.h6)
            Text(text = jadwal.tanggal, style = MaterialTheme.typography.body2)
            Text(text = jadwal.waktu, style = MaterialTheme.typography.body2)
        }
    }
}

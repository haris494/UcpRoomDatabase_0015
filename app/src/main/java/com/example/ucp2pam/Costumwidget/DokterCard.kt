package com.example.ucp2pam.Costumwidget

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.ucp2pam.data.entity.Dokter

@Composable
fun DokterCard(dokter: Dokter, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = dokter.nama, style = MaterialTheme.typography.headlineLarge)
            Text(text = dokter.spesialisasi, style = MaterialTheme.typography.bodyLarge)
            Text(text = dokter.lokasi, style = MaterialTheme.typography.bodyLarge)
            Text(text = dokter.jamPraktik, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

fun Card(modifier: Modifier, elevation: Dp, content: @Composable() (ColumnScope.() -> Unit)) {
    TODO("Not yet implemented")
}



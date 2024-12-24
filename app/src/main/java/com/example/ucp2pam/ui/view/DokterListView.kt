package com.example.ucp2pam.ui.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.ucp2pam.Costumwidget.DokterCard
import com.example.ucp2pam.navigation.Screen

@Composable
fun DokterListView(dokters: List<Screen.Dokter>, onDokterClick: (Screen.Dokter) -> Unit) {
    LazyColumn {
        items(dokters) { dokter ->
            DokterCard(dokter = dokter, onClick = { onDokterClick(dokter) })
        }
    }
}

fun items(dokters: List<Screen.Dokter>, any: @Composable Any) {
    TODO("Not yet implemented")
}



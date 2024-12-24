package com.example.ucp2pam.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Jadwal(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val namaDokter: String,
    val tanggal: String,
    val waktu: String
)

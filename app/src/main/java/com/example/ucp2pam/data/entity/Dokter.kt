package com.example.ucp2pam.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Dokter(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nama: String,
    val spesialisasi: String,
    val lokasi: String,
    val jamPraktik: String
)

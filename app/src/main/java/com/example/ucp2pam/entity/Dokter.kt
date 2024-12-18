package com.example.ucp2pam.entity

package com.example.ucp2pam.model
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dokter") // Nama tabel dalam database
data class Dokter(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,  // Primary key dan auto-generate
    val nama: String,
    val spesialis: String,
    val klinik: String,
    val noHp: String
)

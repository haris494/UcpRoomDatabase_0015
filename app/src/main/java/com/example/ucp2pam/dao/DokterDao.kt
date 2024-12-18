package com.example.ucp2pam.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.ucp2pam.model.Dokter

@Dao
interface DokterDao {


    @Insert
    suspend fun insertDokter(dokter: Dokter)


    @Query("SELECT * FROM dokter")
    suspend fun getAllDokter(): List<Dokter>


    @Query("SELECT * FROM dokter WHERE id = :dokterId")
    suspend fun getDokterById(dokterId: Int): Dokter?
}

package com.example.ucp2pam.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ucp2pam.data.entity.Dokter


@Dao
interface DokterDao {
    @Query("SELECT * FROM dokter")
    fun getAllDokter(): LiveData<List<Dokter>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(dokter: Dokter)

    @Delete
    suspend fun delete(dokter: Dokter)
}


package com.example.ucp2pam.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ucp2pam.data.entity.Jadwal

@Dao
interface JadwalDao {
    @Query("SELECT * FROM jadwal")
    fun <Jadwal> getAllJadwals(): LiveData<List<Jadwal>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun <Jadwal> insertJadwal(jadwal: Jadwal)

    @Delete
    suspend fun <Jadwal> deleteJadwal(jadwal: Jadwal)
    fun delete(jadwal: Jadwal)
    fun update(jadwal: Jadwal)
    fun getJadwalById(id: Int): Jadwal?
    fun insert(jadwal: Jadwal)
    fun getAllJadwal(): Any
}
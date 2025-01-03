package com.example.ucp2pam.data.repository

import com.example.ucp2pam.data.dao.JadwalDao
import com.example.ucp2pam.data.entity.Jadwal


class JadwalRepository(private val jadwalDao: JadwalDao) {
    val allJadwal = jadwalDao.getAllJadwal()

    suspend fun insert(jadwal: Jadwal) {
        jadwalDao.insert(jadwal)
    }

    suspend fun delete(jadwal: Jadwal) {
        jadwalDao.delete(jadwal)
    }

    suspend fun update(jadwal: Jadwal) {
        jadwalDao.update(jadwal)
    }

    suspend fun getJadwalById(id: Int): Jadwal? {
        return jadwalDao.getJadwalById(id)
    }
}
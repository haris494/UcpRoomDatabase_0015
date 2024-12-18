package com.example.ucp2pam.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ucp2pam.dao.DokterDao
import com.example.ucp2pam.model.Dokter

@Database(entities = [Dokter::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    // Mendeklarasikan DAO untuk akses data
    abstract fun dokterDao(): DokterDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "dokter_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

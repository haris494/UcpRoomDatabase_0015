package com.example.ucp2pam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Screen(val route: String) {
    abstract val waktu: String
    abstract val tanggal: String
    abstract val nama: Any
    abstract val lokasi: Any
    abstract val spesialisasi: Any
    abstract val jamPraktik: String
    abstract val namaDokter: Any

    object Home : Screen("home")
    object Dokter : Screen("dokter")
    object Jadwal : Screen("jadwal")
    companion object {
        fun Jadwal(namaDokter: String, tanggal: String, waktu: String): Jadwal {
            TODO("Not yet implemented")
        }

        fun Dokter(s: String, s1: String, s2: String, s3: String): Dokter {
                TODO("Not yet implemented")
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Dokter.route) { DokterScreen(navController) }
        composable(Screen.Jadwal.route) { JadwalScreen(navController) }
    }
}

@Composable
fun JadwalScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun DokterScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun HomeScreen(navController: Any) {
    TODO("Not yet implemented")
}


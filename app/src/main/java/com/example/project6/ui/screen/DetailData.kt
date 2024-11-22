package com.example.project6.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project6.model.Mahasiswa
import com.example.project6.ui.viewmodel.MahasiswaViewModel
import com.example.project6.ui.viewmodel.RencanaStudyViewModel

@Composable
fun DetailData(
    mahasiswa: Mahasiswa,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    onBackButton: () -> Unit
){
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value
    val krsStateUi = krsViewModel.krsStateUi.collectAsState().value

}

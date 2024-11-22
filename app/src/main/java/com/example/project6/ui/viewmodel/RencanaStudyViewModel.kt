package com.example.project6.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.project6.model.RencanaStudy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RencanaStudyViewModel: ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudy())
    val krsStateUi: StateFlow<RencanaStudy> = _krsState.asStateFlow()
}
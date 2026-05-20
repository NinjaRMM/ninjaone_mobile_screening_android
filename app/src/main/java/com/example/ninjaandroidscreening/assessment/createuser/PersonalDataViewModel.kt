package com.example.ninjaandroidscreening.assessment.createuser

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PersonalDataViewModel : ViewModel() {

    val petList = listOf("Cat", "Dog", "Other", "None")

    private val _selectedPet = MutableStateFlow<String?>(null)
    val selectedPet = _selectedPet.asStateFlow()

    fun updateSelectedPet(pet: String) {
        _selectedPet.value = pet
    }

    private val _onNextButtonClicked = MutableStateFlow(false)
    val onNextButtonClicked = _onNextButtonClicked.asStateFlow()
}

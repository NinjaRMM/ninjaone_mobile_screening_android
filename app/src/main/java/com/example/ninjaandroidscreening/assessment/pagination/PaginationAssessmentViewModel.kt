package com.example.ninjaandroidscreening.assessment.pagination

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class PaginationAssessmentViewModel @Inject constructor(
    private val characterListUseCase: CharacterListUseCase,
) : ViewModel() {

    var list: List<Character>? = listOf()

    init {
        viewModelScope.launch(context = Dispatchers.Main) {
            list = characterListUseCase().results
        }
    }

}

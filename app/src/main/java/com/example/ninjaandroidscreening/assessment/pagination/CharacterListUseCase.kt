package com.example.ninjaandroidscreening.assessment.pagination

class CharacterListUseCase(
    private val characterService: CharacterService,
) {

    suspend operator fun invoke() = characterService.getCharacterList()

}

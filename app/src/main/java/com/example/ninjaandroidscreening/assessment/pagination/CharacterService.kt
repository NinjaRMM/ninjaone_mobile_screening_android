package com.example.ninjaandroidscreening.assessment.pagination

import retrofit2.http.GET

interface CharacterService {

    @GET("character/")
    suspend fun getCharacterList(): ApiResponse

}

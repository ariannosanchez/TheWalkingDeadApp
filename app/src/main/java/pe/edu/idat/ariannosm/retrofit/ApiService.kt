package pe.edu.idat.ariannosm.retrofit

import retrofit2.http.GET

import  pe.edu.idat.ariannosm.model.Character

interface ApiService {
    @GET("/api/characters")
    suspend fun getCharacters(): List<Character>
}
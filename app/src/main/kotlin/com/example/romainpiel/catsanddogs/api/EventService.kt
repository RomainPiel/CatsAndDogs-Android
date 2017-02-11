package com.example.romainpiel.catsanddogs.api

import com.example.romainpiel.catsanddogs.api.model.ApiEventWrapper
import io.reactivex.Observable
import retrofit2.http.GET

interface EventService {
    @GET("/michael-r-may/CatsAndDogsiOS/master/static-json/speakers.json")
    fun getEvent(): Observable<ApiEventWrapper>
}
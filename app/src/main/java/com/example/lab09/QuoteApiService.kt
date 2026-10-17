package com.example.lab09

import retrofit2.http.GET

interface QuoteApiService {
    @GET("quotes")
    suspend fun getQuotes(): QuoteResponse
}

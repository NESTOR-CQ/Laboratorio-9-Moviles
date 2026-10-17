package com.example.lab09

import com.google.gson.annotations.SerializedName

data class QuoteResponse(
    @SerializedName("quotes") val quotes: List<QuoteModel>,
    @SerializedName("total") val total: Int,
    @SerializedName("skip") val skip: Int,
    @SerializedName("limit") val limit: Int
)

data class QuoteModel(
    @SerializedName("id") val id: Int,
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)

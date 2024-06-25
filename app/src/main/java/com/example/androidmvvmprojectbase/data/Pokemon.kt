package com.example.androidmvvmprojectbase.data

import com.google.gson.annotations.SerializedName

data class Pokemon(
    var id: String,
    val name: String,
    val image: String?,
    val description: String?,
    val type: List<String>,
    val height: Double,
    val weight: Double,
    val status: Status
)

data class Status(
    val hp: Int,
    val attack: Int,
    val defense: Int,
    @SerializedName("sp_atk")
    val spAtk: Int,
    @SerializedName("sp_def")
    val spDef: Int,
    val speed: Int
)
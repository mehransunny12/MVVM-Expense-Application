package com.example.mvvmbasicapplication.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "budget_table"
)
data class Budget(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val date: String,
    val bankName: String,
    val amount: Float,
    val purpose: String,
    val creditOrDebit: String
)
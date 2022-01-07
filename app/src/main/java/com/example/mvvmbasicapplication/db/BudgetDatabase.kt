package com.example.mvvmbasicapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmbasicapplication.entities.Budget
import com.example.mvvmbasicapplication.entities.Profile

@Database(
    entities = [Budget::class, Profile::class],
    version = 1
)
abstract class BudgetDatabase : RoomDatabase() {

    abstract fun getBudgetDao(): BudgetDao
    abstract fun getProfileDao(): ProfileDao

}
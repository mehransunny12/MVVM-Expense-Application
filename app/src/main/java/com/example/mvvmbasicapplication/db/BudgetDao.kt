package com.example.mvvmbasicapplication.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmbasicapplication.entities.Budget

@Dao
interface BudgetDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBudget(budget: Budget)

    @Query("Select * from budget_table order by id desc")
    fun getAllData(): LiveData<List<Budget>>
    // why we do not need the suspend function here?

}
package com.example.mvvmbasicapplication.repository

import com.example.mvvmbasicapplication.db.BudgetDao
import javax.inject.Inject

class BudgetRepository @Inject constructor(
    val budgetDao: BudgetDao
) {
}
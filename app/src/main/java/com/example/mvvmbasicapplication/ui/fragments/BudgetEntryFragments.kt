package com.example.mvvmbasicapplication.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvvmbasicapplication.R
import com.example.mvvmbasicapplication.databinding.FragmentBudgetEntryBinding

class BudgetEntryFragments : Fragment(R.layout.fragment_budget_entry){

    lateinit var binding: FragmentBudgetEntryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBudgetEntryBinding.bind(view)
    }

}
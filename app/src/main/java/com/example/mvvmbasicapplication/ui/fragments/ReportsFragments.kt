package com.example.mvvmbasicapplication.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvvmbasicapplication.R
import com.example.mvvmbasicapplication.databinding.FragmentReportsBinding

class ReportsFragments : Fragment(R.layout.fragment_reports){

    lateinit var binding: FragmentReportsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentReportsBinding.bind(view)
    }

}
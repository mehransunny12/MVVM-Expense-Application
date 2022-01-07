package com.example.mvvmbasicapplication.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvvmbasicapplication.R
import com.example.mvvmbasicapplication.databinding.FragmentCalenderViewBinding

class CalendarViewFragments : Fragment(R.layout.fragment_calender_view){

    lateinit var binding: FragmentCalenderViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCalenderViewBinding.bind(view)
    }

}
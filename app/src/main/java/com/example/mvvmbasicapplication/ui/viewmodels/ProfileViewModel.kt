package com.example.mvvmbasicapplication.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmbasicapplication.entities.Profile
import com.example.mvvmbasicapplication.repository.ProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    val profileRepository: ProfileRepository
) : ViewModel() {

    val profileLiveData: LiveData<List<Profile>> = profileRepository.getProfile()

    fun insertProfileData(profile: Profile) = viewModelScope.launch {
        profileRepository.insertProfileData(profile)
    }

}
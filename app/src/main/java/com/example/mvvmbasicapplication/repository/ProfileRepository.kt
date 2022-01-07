package com.example.mvvmbasicapplication.repository

import com.example.mvvmbasicapplication.db.ProfileDao
import com.example.mvvmbasicapplication.entities.Profile
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    val profileDao: ProfileDao
) {

    fun getProfile() = profileDao.getProfileData()

    suspend fun insertProfileData(profile: Profile) = profileDao.insertProfileData(profile)

}
package com.example.mvvmbasicapplication.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmbasicapplication.entities.Profile

@Dao
interface ProfileDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProfileData(profile: Profile)

    @Query("select * from profile_table order by id desc")
    fun getProfileData(): LiveData<List<Profile>>
    // why we do not need the suspend function here?

}
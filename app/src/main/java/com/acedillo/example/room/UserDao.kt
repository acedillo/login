package com.acedillo.example.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.acedillo.example.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user ORDER BY user_name ASC")
    fun getUsers(): List<User>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: User)

    @Query("DELETE FROM user")
    suspend fun deleteAll()

}
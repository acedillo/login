package com.acedillo.example.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (@PrimaryKey @ColumnInfo(name = "user_name") val userName: String)
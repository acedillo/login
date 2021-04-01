package com.acedillo.example.repository

import com.acedillo.example.model.AvailableUser

interface AvailableUserRepository {

    fun getUsers() : List<AvailableUser>
}
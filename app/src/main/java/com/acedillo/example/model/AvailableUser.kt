package com.acedillo.example.model

import com.google.gson.annotations.SerializedName

data class AvailableUser(

    var id: Int,
    @SerializedName("username")
    var userName: String?,
    @SerializedName("profile_picture_url")
    var profilePictureUrl: String?,
    @SerializedName("verified_status")
    var verifiedStatus: String?,
    var url: String?,
    @SerializedName("full_name")
    var fullName: String?
)
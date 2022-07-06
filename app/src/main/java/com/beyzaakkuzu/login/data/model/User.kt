package com.beyzaakkuzu.login.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "user_table")
data class User(
    var name:String,
    var surname:String,
    @PrimaryKey(autoGenerate = true)
    var id:Int
    ):Parcelable

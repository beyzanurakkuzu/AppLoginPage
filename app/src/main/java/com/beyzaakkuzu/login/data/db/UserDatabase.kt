package com.beyzaakkuzu.login.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beyzaakkuzu.login.data.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = true)
abstract class UserDatabase: RoomDatabase() {

}
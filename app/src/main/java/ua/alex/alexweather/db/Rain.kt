package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Rain(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @ColumnInfo(name = "jsonMember3h")
        var jsonMember3h: Double = 0.toDouble()
)

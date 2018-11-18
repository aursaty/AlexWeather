package ua.alex.alexweather.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Rain(

        @PrimaryKey(autoGenerate = true)
        var rain_id: Long,

        @SerializedName("3h")
        @ColumnInfo(name = "jsonMember3h")
        var jsonMember3h: Double = 0.toDouble()
)

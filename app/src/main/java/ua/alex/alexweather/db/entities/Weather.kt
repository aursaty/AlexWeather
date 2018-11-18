package ua.alex.alexweather.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Weather(

        @PrimaryKey
        @ColumnInfo(name = "id")
        var weather_id: Int,

        @ColumnInfo(name = "icon")
        var icon: String?,

        @ColumnInfo(name = "description")
        var description: String?,

        @ColumnInfo(name = "main")
        var main: String?

)
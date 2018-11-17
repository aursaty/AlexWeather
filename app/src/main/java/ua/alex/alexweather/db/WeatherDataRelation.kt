package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import ua.alex.alexweather.models.WeatherItem

@Entity
data class WeatherDataRelation(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @Embedded
        var city: City? = null,

        @ColumnInfo(name = "cnt")
        var cnt: Int = 0

)
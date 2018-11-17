package ua.alex.alexweather.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class WeatherDataRelation(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @Embedded
        var city: City? = null,

        @ColumnInfo(name = "cnt")
        var cnt: Int = 0

)
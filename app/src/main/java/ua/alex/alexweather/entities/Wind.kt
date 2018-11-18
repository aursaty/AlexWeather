package ua.alex.alexweather.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Wind(

        @PrimaryKey(autoGenerate = true)
        var wind_id: Long,

        @ColumnInfo(name = "deg")
        var deg: Double = 0.toDouble(),

        @ColumnInfo(name = "speed")
        var speed: Double = 0.toDouble()

)
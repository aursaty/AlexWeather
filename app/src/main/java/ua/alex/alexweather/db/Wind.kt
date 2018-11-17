package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity

@Entity
data class Wind (

    @ColumnInfo(name = "deg")
    var deg: Double = 0.toDouble(),

    @ColumnInfo(name = "speed")
    var speed: Double = 0.toDouble()

)
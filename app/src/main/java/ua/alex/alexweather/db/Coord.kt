package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Coord(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @ColumnInfo(name = "lon")
        var lon: Double = 0.toDouble(),

        @ColumnInfo(name = "lat")
        var lat: Double = 0.toDouble()

)
package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Weather(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @ColumnInfo(name = "icon")
        var icon: String? = "",

        @ColumnInfo(name = "description")
        var description: String? = "",

        @ColumnInfo(name = "main")
        var main: String? = "",

        @ColumnInfo(name = "id")
        var id: Int = 0

)
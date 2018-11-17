package ua.alex.alexweather.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class WeatherItemRelation(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @ColumnInfo(name = "dt")
        var dt: Int = 0,

        @Embedded
        @ColumnInfo(name = "rain")
        var rain: Rain? = null,

        @ColumnInfo(name = "dt_txt")
        var dtTxt: String? = "",

        @Embedded
        @ColumnInfo(name = "main")
        var main: Main? = null,

        @Embedded
        @ColumnInfo(name = "clouds")
        var clouds: Clouds? = null,

        @Embedded
        @ColumnInfo(name = "wind")
        var wind: Wind? = null

)
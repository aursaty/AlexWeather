package ua.alex.alexweather.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class WeatherItemRelation(

        @PrimaryKey(autoGenerate = true)
        var uid: Long = 0,

        @ColumnInfo(name = "dt")
        var dt: Int,

        @Embedded
//        @ColumnInfo(name = "rain")
        var rain: Rain?,

        @SerializedName("dt_txt")
        @ColumnInfo(name = "dt_txt")
        var dtTxt: String?,

        @Embedded
//        @ColumnInfo(name = "main")
        var main: Main?,

        @Embedded
//        @ColumnInfo(name = "clouds")
        var clouds: Clouds?,

        @Embedded
//        @ColumnInfo(name = "wind")
        var wind: Wind?,

        @Embedded
//        @ColumnInfo(name = "weather")
        var weather: Weather?

)
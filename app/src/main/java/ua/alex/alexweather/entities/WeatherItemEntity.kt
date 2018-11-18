package ua.alex.alexweather.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class WeatherItemEntity(

        @PrimaryKey
        @ColumnInfo(name = "dt")
        var dt: Int,

        @Embedded
        var rain: Rain?,

        @SerializedName("dt_txt")
        @ColumnInfo(name = "dt_txt")
        var dtTxt: String?,

        @Embedded
        var main: Main?,

        @Embedded
        var clouds: Clouds?,

        @Embedded
        var wind: Wind?,

        @Embedded
        var weather: Weather?

)
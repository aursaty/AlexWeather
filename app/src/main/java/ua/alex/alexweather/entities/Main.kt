package ua.alex.alexweather.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Main (

    @PrimaryKey(autoGenerate = true)
    var main_id: Long,

    @ColumnInfo(name = "temp")
    var temp: Double = 0.toDouble(),

    @SerializedName("temp_min")
    @ColumnInfo(name ="temp_min")
    var tempMin: Double = 0.toDouble(),

    @SerializedName("grnd_level")
    @ColumnInfo(name ="grnd_level")
    var grndLevel: Double = 0.toDouble(),

    @SerializedName("temp_kf")
    @ColumnInfo(name ="temp_kf")
    var tempKf: Double = 0.toDouble(),

    @ColumnInfo(name = "humidity")
    var humidity: Int = 0,

    @ColumnInfo(name = "pressure")
    var pressure: Double = 0.toDouble(),

    @SerializedName("sea_level")
    @ColumnInfo(name = "sea_level")
    var seaLevel: Double = 0.toDouble(),

    @SerializedName("temp_max")
    @ColumnInfo(name = "temp_max")
    var tempMax: Double = 0.toDouble()

)
package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Entity
data class Main (

    @PrimaryKey(autoGenerate = true)
    var uid: Long,

    @ColumnInfo(name = "temp")
    var temp: Double = 0.toDouble(),

    @ColumnInfo(name ="temp_min")
    var tempMin: Double = 0.toDouble(),

    @ColumnInfo(name ="grnd_level")
    var grndLevel: Double = 0.toDouble(),

    @ColumnInfo(name ="temp_kf")
    var tempKf: Double = 0.toDouble(),

    @ColumnInfo(name = "humidity")
    var humidity: Int = 0,

    @ColumnInfo(name = "pressure")
    var pressure: Double = 0.toDouble(),

    @ColumnInfo(name = "sea_level")
    var seaLevel: Double = 0.toDouble(),

    @ColumnInfo(name = "temp_max")
    var tempMax: Double = 0.toDouble()

)
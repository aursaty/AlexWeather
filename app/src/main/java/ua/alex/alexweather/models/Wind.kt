package ua.alex.alexweather.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Wind(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @SerializedName("deg")
        var deg: Double = 0.toDouble(),

        @SerializedName("speed")
        var speed: Double = 0.toDouble()

)
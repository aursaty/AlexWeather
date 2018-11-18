package ua.alex.alexweather.models

import com.google.gson.annotations.SerializedName

data class Wind(

        @SerializedName("deg")
        var deg: Double = 0.toDouble(),

        @SerializedName("speed")
        var speed: Double = 0.toDouble()

)
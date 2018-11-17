package ua.alex.alexweather.models

import com.google.gson.annotations.SerializedName

data class Rain (

        @SerializedName("3h")
        var jsonMember3h: Double = 0.toDouble()

)

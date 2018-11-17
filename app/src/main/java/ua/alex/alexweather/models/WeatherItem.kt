package ua.alex.alexweather.models

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
class WeatherItem {

    @SerializedName("dt")
    var dt: Int = 0

    @SerializedName("rain")
    var rain: Rain? = null

    @SerializedName("dt_txt")
    var dtTxt: String? = null

    @SerializedName("weather")
    var weather: List<Weather>? = null

    @SerializedName("main")
    var main: Main? = null

    @SerializedName("clouds")
    var clouds: Clouds? = null

    @SerializedName("wind")
    var wind: Wind? = null

    override fun toString(): String {
        return "WeatherItem{" +
                "dt = '" + dt + '\''.toString() +
                ",rain = '" + rain + '\''.toString() +
                ",dt_txt = '" + dtTxt + '\''.toString() +
                ",weather = '" + weather + '\''.toString() +
                ",main = '" + main + '\''.toString() +
                ",clouds = '" + clouds + '\''.toString() +
                ",wind = '" + wind + '\''.toString() +
                "}"
    }
}
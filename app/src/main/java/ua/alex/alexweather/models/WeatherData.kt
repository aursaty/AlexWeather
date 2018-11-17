package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import ua.alex.alexweather.db.City

@Generated("com.robohorse.robopojogenerator")
class WeatherData {

    @SerializedName("city")
    var city: City? = null

    @SerializedName("cnt")
    var cnt: Int = 0

    @SerializedName("list")
    var list: List<WeatherItem>? = null

    override fun toString(): String {
        return "WeatherData{" +
                "city = '" + city + '\''.toString() +
                ",cnt = '" + cnt + '\''.toString() +
                ",list = '" + list + '\''.toString() +
                "}"
    }
}
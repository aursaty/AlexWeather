package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class WeatherData {

    @SerializedName("city")
    var city: City? = null

    @SerializedName("cnt")
    var cnt: Int = 0

    @SerializedName("cod")
    var cod: String? = null

    @SerializedName("message")
    var message: Double = 0.toDouble()

    @SerializedName("list")
    var list: List<ListItem>? = null

    override fun toString(): String {
        return "WeatherData{" +
                "city = '" + city + '\''.toString() +
                ",cnt = '" + cnt + '\''.toString() +
                ",cod = '" + cod + '\''.toString() +
                ",message = '" + message + '\''.toString() +
                ",list = '" + list + '\''.toString() +
                "}"
    }
}
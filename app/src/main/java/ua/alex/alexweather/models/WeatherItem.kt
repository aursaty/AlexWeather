package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class WeatherItem {

    @SerializedName("icon")
    var icon: String? = null

    @SerializedName("description")
    var description: String? = null

    @SerializedName("main")
    var main: String? = null

    @SerializedName("id")
    var id: Int = 0

    override fun toString(): String {
        return "WeatherItem{" +
                "icon = '" + icon + '\''.toString() +
                ",description = '" + description + '\''.toString() +
                ",main = '" + main + '\''.toString() +
                ",id = '" + id + '\''.toString() +
                "}"
    }
}
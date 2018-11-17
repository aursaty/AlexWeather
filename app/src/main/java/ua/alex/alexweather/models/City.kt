package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import ua.alex.alexweather.db.Coord

@Generated("com.robohorse.robopojogenerator")
class City {

    @SerializedName("country")
    var country: String? = null

    @SerializedName("coord")
    var coord: Coord? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("id")
    var id: Int = 0

    override fun toString(): String {
        return "City{" +
                "country = '" + country + '\''.toString() +
                ",coord = '" + coord + '\''.toString() +
                ",name = '" + name + '\''.toString() +
                ",id = '" + id + '\''.toString() +
                "}"
    }
}
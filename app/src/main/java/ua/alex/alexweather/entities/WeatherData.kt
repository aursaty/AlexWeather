//package ua.alex.alexweather.entities
//
//import android.arch.persistence.room.*
//
////@Entity(foreignKeys = [ForeignKey(
////        entity = WeatherDataRelation::class,
////        parentColumns = [("uid")],
////        childColumns = [("uid")]
////)])
//data class WeatherData(
//
////        @Embedded
////        var weatherDataRelation: WeatherDataRelation,
////        @PrimaryKey(autoGenerate = true)
//        var uid: Long,
//
//        @Embedded
//        var city: City? = null,
//
//        @ColumnInfo(name = "cnt")
//        var cnt: Int = 0,
//
////        @Relation(parentColumn = "uid", entity = WeatherItemModel::class, entityColumn = "uid")
//        @ColumnInfo(name = "list")
//        var weather: List<WeatherItemModel>? = listOf()
//
//)
package ua.alex.alexweather.entities

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class WeatherData {

    @SerializedName("city")
    var city: City? = null

    @SerializedName("cnt")
    var cnt: Int = 0

    @SerializedName("list")
    var list: List<WeatherItemModel>? = null

    override fun toString(): String {
        return "WeatherData{" +
                "city = '" + city + '\''.toString() +
                ",cnt = '" + cnt + '\''.toString() +
                ",list = '" + list + '\''.toString() +
                "}"
    }
}
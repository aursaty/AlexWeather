package ua.alex.alexweather.db.entities

import android.arch.persistence.room.*


@Entity(foreignKeys = [ForeignKey(
        entity = WeatherItemRelation::class,
        parentColumns = [("uid")],
        childColumns = [("uid")]
)])
data class WeatherItem (

        @Embedded
        var weatherItemRelation: WeatherItemRelation,

        @Relation(parentColumn = "uid", entity = Weather::class, entityColumn = "uid")
        @ColumnInfo(name = "weather")
        var weather: List<Weather>? = listOf()
)
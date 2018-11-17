package ua.alex.alexweather.db

import android.arch.persistence.room.*

@Entity(foreignKeys = [ForeignKey(
        entity = WeatherDataRelation::class,
        parentColumns = [("uid")],
        childColumns = [("uid")]
)])
data class WeatherData (

        @Embedded
        var weatherDataRelation: WeatherDataRelation,

        @Relation(parentColumn = "uid", entity = WeatherItem::class, entityColumn = "uid")
        @ColumnInfo(name = "list")
        var weather: List<WeatherItem>? = listOf()
)
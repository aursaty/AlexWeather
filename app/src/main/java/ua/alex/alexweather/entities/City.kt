package ua.alex.alexweather.entities

import android.arch.persistence.room.*

@Entity
data class City(

        @PrimaryKey
        @ColumnInfo(name = "id")
        var id: Int = 0,

        @ColumnInfo(name = "country")
        var country: String? = "",

        @Embedded
        var coord: Coord? = null,

        @ColumnInfo(name = "name")
        var name: String? = ""

)
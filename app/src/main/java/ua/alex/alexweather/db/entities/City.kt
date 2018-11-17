package ua.alex.alexweather.db.entities

import android.arch.persistence.room.*

@Entity
data class City(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @ColumnInfo(name = "country")
        var country: String? = "",

        @Embedded
        var coord: Coord? = null,

        @ColumnInfo(name = "name")
        var name: String? = "",

        @ColumnInfo(name = "id")
        var id: Int = 0
)
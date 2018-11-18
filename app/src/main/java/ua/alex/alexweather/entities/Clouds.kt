package ua.alex.alexweather.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Clouds(

        @PrimaryKey(autoGenerate = true)
        var clouds_id: Long,

        @ColumnInfo(name = "all")
        var all: Int = 0

)
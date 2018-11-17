package ua.alex.alexweather.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Clouds(

        @PrimaryKey(autoGenerate = true)
        var uid: Long,

        @ColumnInfo(name = "all")
        var all: Int = 0

)
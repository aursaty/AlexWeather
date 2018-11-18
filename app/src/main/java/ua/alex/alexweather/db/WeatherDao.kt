package ua.alex.alexweather.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import ua.alex.alexweather.db.entities.WeatherItemRelation

@Dao
interface WeatherDao {

    @Query("SELECT * FROM WeatherItemRelation")
    fun getAllWeather(): List<WeatherItemRelation>

    @Insert
    fun insertAll(weatherData: List<WeatherItemRelation>)

//    @Delete
//    fun delete()
}
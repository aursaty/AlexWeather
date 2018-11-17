package ua.alex.alexweather.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import ua.alex.alexweather.db.entities.WeatherData
import ua.alex.alexweather.db.entities.WeatherItem

@Dao
interface WeatherDao {
    @Query("SELECT * FROM WeatherData")
    fun getAll(): WeatherData


    @Query("SELECT * FROM WeatherItem")
    fun getAllWeather(): List<WeatherItem>

    @Insert
    fun insertAll(weatherData: WeatherData)

    @Delete
    fun delete()
}
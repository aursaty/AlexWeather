package ua.alex.alexweather.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Flowable
import ua.alex.alexweather.entities.WeatherItemEntity

@Dao
interface WeatherDao {

    @Query("SELECT * FROM WeatherItemEntity")
    fun getAllWeather(): Flowable<List<WeatherItemEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(weatherData: List<WeatherItemEntity>)

//    @Delete
//    fun delete()
}
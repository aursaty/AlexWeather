package ua.alex.alexweather.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import ua.alex.alexweather.db.entities.WeatherData
import ua.alex.alexweather.db.entities.WeatherItem

@Database(entities = [WeatherData::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun weatherDao() : WeatherDao
}
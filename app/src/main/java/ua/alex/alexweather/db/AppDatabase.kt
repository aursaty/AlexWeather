package ua.alex.alexweather.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import ua.alex.alexweather.entities.WeatherItemEntity

@Database(entities = [WeatherItemEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun weatherDao() : WeatherDao
}
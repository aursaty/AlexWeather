package ua.alex.alexweather.repository

import io.reactivex.Observable
import ua.alex.alexweather.api.IWeatherApi
import ua.alex.alexweather.db.entities.WeatherData

class WeatherRepository(private val apiService: IWeatherApi) {
    fun getWeather(lat: Double, lon: Double): Observable<WeatherData> {
        return apiService.getForecast(lat, lon)
    }
}
package ua.alex.alexweather.db

import ua.alex.alexweather.entities.WeatherData
import ua.alex.alexweather.entities.WeatherItemEntity

object WeatherConverter {
    fun convert(data: WeatherData): List<WeatherItemEntity> {
        var result = emptyList<WeatherItemEntity>()
        data.list?.forEach { w -> result += WeatherItemEntity(
                dt = w.dt,
                rain = w.rain,
                dtTxt = w.dtTxt,
                main = w.main,
                clouds = w.clouds,
                wind = w.wind,
                weather = w.weather?.get(0)
        ) }
        return result
    }
}
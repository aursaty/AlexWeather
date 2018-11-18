package ua.alex.alexweather.db

import ua.alex.alexweather.db.entities.WeatherData
import ua.alex.alexweather.db.entities.WeatherItemRelation

object WeatherConverter {
    fun convert(data: WeatherData): List<WeatherItemRelation> {
        var result = emptyList<WeatherItemRelation>()
        data.list?.forEach { w -> result += WeatherItemRelation(
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
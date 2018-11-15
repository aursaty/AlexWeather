package ua.alex.alexweather.repository

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ua.alex.alexweather.api.IWeatherApi
import ua.alex.alexweather.models.WeatherData

class WeatherRepository {
    fun getWeather(lon: Int, lat: Int): WeatherData? {
        var result: WeatherData? = null
        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(IWeatherApi.create().getForecast(lon, lat)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { data -> result = (data) })
        return result
    }
}
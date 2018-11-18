package ua.alex.alexweather.repository

import android.annotation.SuppressLint
import android.util.Log
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import ua.alex.alexweather.api.IWeatherApi
import ua.alex.alexweather.db.WeatherConverter
import ua.alex.alexweather.db.WeatherDao
import ua.alex.alexweather.db.entities.WeatherData
import ua.alex.alexweather.db.entities.WeatherItemEntity

class WeatherRepository(private val weatherApi: IWeatherApi?, private val weatherDao: WeatherDao) {


//    fun getWeather(lat: Double, lon: Double): Observable<List<WeatherItemEntity>> {
//        return Observable.concatArray(getWeatherFromApi(lat, lon),
//                getWeatherFromDb())
//    }
//
//    fun getWeatherFromApi(lat: Double, lon: Double): Observable<List<WeatherItemEntity>> {
//        return Single.just(WeatherConverter.convert(weatherApi.getForecast(lat, lon)))
//                .toObservable()
//                .doOnNext { storeWeatherInDb(it) }
//    }

    fun getWeatherFromApi(lat: Double, lon: Double): Observable<WeatherData> {
        return weatherApi!!.getForecast(lat, lon)
                .doOnNext { storeWeatherInDb(WeatherConverter.convert(it)) }
    }

    @SuppressLint("CheckResult")
    fun storeWeatherInDb(weatherList: List<WeatherItemEntity>) {
        Observable.fromCallable { weatherDao.insertAll(weatherList) }
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe { Log.d("s", "ss") }

    }

    fun getWeatherFromDb(): Observable<List<WeatherItemEntity>> {
        return weatherDao.getAllWeather()
                .filter { it.isNotEmpty() }
                .toObservable()
    }
}
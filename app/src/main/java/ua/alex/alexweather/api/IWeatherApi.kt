package ua.alex.alexweather.api

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ua.alex.alexweather.api.ApiSettings.FORECAST
import ua.alex.alexweather.api.ApiSettings.PATH_API_VERSION
import ua.alex.alexweather.api.ApiSettings.PATH_DATA
import ua.alex.alexweather.models.WeatherData

interface IWeatherApi {
    @GET("$PATH_DATA/$PATH_API_VERSION/$FORECAST")
    fun getForecast(@Query(ApiSettings.PATH_LAT) lat: Double,
                    @Query(ApiSettings.PATH_LON) lon: Double,
                    @Query(ApiSettings.PATH_API_KEY) appid: String = ApiSettings.API_KEY): Observable<WeatherData>

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/"

        fun create(): IWeatherApi {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit.create(IWeatherApi::class.java)
        }
    }
}
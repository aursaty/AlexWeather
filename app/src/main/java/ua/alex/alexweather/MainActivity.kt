package ua.alex.alexweather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ua.alex.alexweather.repository.WeatherRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherData = WeatherRepository().getWeather(44, 55)

    }
}

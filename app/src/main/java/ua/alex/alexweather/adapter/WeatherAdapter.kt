package ua.alex.alexweather.adapter

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import ua.alex.alexweather.R
import ua.alex.alexweather.entities.WeatherItemEntity
import java.text.SimpleDateFormat
import java.util.*


class WeatherAdapter(private val weatherList: List<WeatherItemEntity>, val context: Context)
    : RecyclerView.Adapter<WeatherViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): WeatherViewHolder {
        val weatherViewHolder = WeatherViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.weather_list_item, p0, false))

        val typeface = Typeface.createFromAsset(context.assets, "fonts/weathericons-regular-webfont.ttf")
        weatherViewHolder.weatherIcon.typeface = typeface

        return weatherViewHolder
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    override fun onBindViewHolder(weatherViewHolder: WeatherViewHolder, p1: Int) {
        if (weatherList[p1].weather != null)
            weatherViewHolder.weatherIcon.text =
                    Html.fromHtml(setWeatherIcon(weatherList[p1].weather!!.id), 0)
        weatherViewHolder.day.text = getDay(weatherList[p1].dt)
        if (weatherList[p1].main != null) {
            weatherViewHolder.maxTemp.text = (weatherList[p1].main!!.tempMax - 273.15).toInt().toString()
            val humidity = "${weatherList[p1].main!!.humidity}%"
            weatherViewHolder.minTemp.text = humidity
        }
    }

    private fun getDay(time: Int): String {
        val date = Date(time.toLong() * 1000)
        val formatDay = SimpleDateFormat("EEEE", Locale.ENGLISH)
        val formatTime = SimpleDateFormat("kk:mm", Locale.ENGLISH)

        return formatDay.format(date) + ", " + formatTime.format(date)
    }

    private fun setWeatherIcon(weatherId: Int): String {
        val id = weatherId % 100
        var icon = ""
        when (id) {
            0 -> icon = "&#xf00d;"
            2 -> icon = "&#xf01e;"
            1, 3, 4 -> icon = "&#xf01c;"
            7 -> icon = "&#xf014;"
            8 -> icon = "&#xf013;"
            6 -> icon = "&#xf01b;"
            5 -> icon = "&#xf019;"
        }
        return icon
    }

}
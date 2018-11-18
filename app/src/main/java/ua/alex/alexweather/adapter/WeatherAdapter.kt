package ua.alex.alexweather.adapter

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import ua.alex.alexweather.R
import ua.alex.alexweather.entities.WeatherItemEntity


class WeatherAdapter(val weatherList: List<WeatherItemEntity>, val context: Context)
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
        weatherViewHolder.weatherIcon.text =
                Html.fromHtml(setWeatherIcon(weatherList[p1].weather?.id!!), 0)
    }

    private fun setWeatherIcon(weatherId: Int): String {
        val id = weatherId % 100
        var icon = ""
        when (id) {
            0 -> icon = "&#xf00d;"
            2 -> icon = "&#xf01e;"
            1,3,4 -> icon = "&#xf01c;"
            7 -> icon = "&#xf014;"
            8 -> icon = "&#xf013;"
            6 -> icon = "&#xf01b;"
            5 -> icon = "&#xf019;"
        }
        return icon
    }

}
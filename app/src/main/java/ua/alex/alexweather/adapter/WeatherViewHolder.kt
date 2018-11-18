package ua.alex.alexweather.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.weather_list_item.view.*

class WeatherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var weatherIcon = view.tv_icon
    var day = view.tv_day
    var maxTemp = view.tv_max_temp
    var minTemp = view.tv_min_temp
}
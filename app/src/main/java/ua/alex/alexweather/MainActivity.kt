package ua.alex.alexweather

import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Looper
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.android.gms.location.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import ua.alex.alexweather.api.IWeatherApi
import ua.alex.alexweather.models.WeatherData
import ua.alex.alexweather.repository.WeatherRepository

class MainActivity : AppCompatActivity() {

    private lateinit var locationRequest: LocationRequest
    private lateinit var locationCallback: LocationCallback
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    companion object {
        const val REQUEST_CODE = 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.ACCESS_FINE_LOCATION))
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_CODE)
        else {
            requestLocation()

            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), MainActivity.REQUEST_CODE)

            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper())
        }

    }

    private fun buildLocationCallBack() {
        locationCallback = object: LocationCallback() {
            override fun onLocationResult(p0: LocationResult?) {
                val location = p0!!.locations[p0.locations.size-1]

                fetchWeather(location.latitude, location.longitude)
            }
        }
    }

    private fun fetchWeather(latitude: Double, longitude: Double) {
        val compositeDisposable = CompositeDisposable()
        compositeDisposable
                .add(WeatherRepository(IWeatherApi.create())
                .getWeather(latitude, longitude)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { data -> updateUI(data) })
    }

    private fun updateUI(data: WeatherData?) {
        tv_location.text = data?.city?.name
    }

    private fun requestLocation() {
        buildLocationRequest()
        buildLocationCallBack()
    }

    private fun buildLocationRequest() {
        locationRequest = LocationRequest()
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        locationRequest.interval = 500
        locationRequest.fastestInterval = 3000
        locationRequest.smallestDisplacement = 10f
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode)
        {
            REQUEST_CODE -> {
                if (grantResults.isNotEmpty()) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                        Toast.makeText(this, "Permission granted", Toast.LENGTH_LONG).show()
                    else
                        Toast.makeText(this, "Permission denied", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

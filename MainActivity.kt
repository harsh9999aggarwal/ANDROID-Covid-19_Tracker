package com.example.covid_tracker

import android.app.DownloadManager
import android.app.VoiceInteractor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val request = Request.Builder()
            .url("https://api.covid19india.org/data.json")
            .build()

        val api= OkHttpClient().newCall(request)

        GlobalScope.launch{
            val response= withContext(IO){ api.execute() }
            val data = Gson().fromJson(response.body?.string(),Response::class.java)
            launch(Dispatchers.Main){
                bindCombinedData(data?.statewise?.get(0)!!)
                bindAllData(data.statewise)
            }

        }

    }

    private fun bindAllData(statewise:List<StatewiseItem?>) {
        val data =statewise.map{"${it!!.state}|${it.active} | ${it.recovered} | ${it.deaths}"}
        list.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
    }

    private fun bindCombinedData(statewiseItem: StatewiseItem) {
        confirmedTv.text = statewiseItem.confirmed
        activeTv.text = statewiseItem.active
        deceasedTv.text = statewiseItem.deaths
        recoveredTv.text = statewiseItem.recovered

    }
}
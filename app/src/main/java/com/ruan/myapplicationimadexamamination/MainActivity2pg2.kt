package com.ruan.myapplicationimadexamamination

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.StringBuilder
import kotlin.text.StringBuilder

class MainActivity2pg2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activity2pg2)
        tvDay = findViewById(R.id.textviewDay)
        tvMorning = findViewById(R.id.textviewDay)
        tvAfternoon = findViewById(R.id.textviewAfternoon)
        tvNotes = findViewById(R.id.textviewNotes)
        buttonBack = findViewById(R.id.buttonBack)

        val arrayDay = intent.getStringArrayExtra("dayArray")?.toList()?: emptyList()
        val arrrayMorning = intent.getFloatArrayExtra("morningArray")?.toList()?: emptyList()
        val arrayAfternoon = intent.getFloatArrayExtra("afternoonArray")?.toList()?: emptyList()
        val arrayNotes = intent.getStringArrayExtra("noteArray")?.toList()?: emptyList()

        var dayed = StringBuilder()
        for (index,day) in arrayDay.withIndex()){
            dayed.append("Day:${index} : $day")
        }
        var morning =StringBuilder()
        for((index,time)in arrayMorning.withIndex()){
            dayed.append("time": $(index) :$time")
        }
        var afternoon =StringBuilder()
        for((index,time)in arrayAfternoon.withIndex()){
            dayed.append("time": $(index) :$time")
        }
        var Notes =StringBuilder()
        for((index,time)in arrayNotes.withIndex()){
            dayed.append("time": $(index) :$time")


        }
    }
}
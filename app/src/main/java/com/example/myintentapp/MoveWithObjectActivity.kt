package com.example.myintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MoveWithObjectActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PERSON = "extra_person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvobject: TextView = findViewById(R.id.tv_object_received)

        val person = this.intent.getParcelableExtra<Person>(EXTRA_PERSON)
        val text = "Name : ${person?.name.toString()},\nEmail : ${person?.email},\nAge : ${person?.age},\nLocation : ${person?.city}"
        tvobject.text = text
    }
}
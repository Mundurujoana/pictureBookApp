package dev.mundu.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic5Activity : AppCompatActivity() {
    lateinit var btnPrev3:Button
lateinit var btnBack:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic5)

        btnPrev3 = findViewById(R.id.btnPrev3)
        btnPrev3.setOnClickListener {
            val intent = Intent(this, pic4Activity::class.java)
            startActivity(intent)
        }

        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
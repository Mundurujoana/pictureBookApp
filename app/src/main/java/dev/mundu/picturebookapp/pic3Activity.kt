package dev.mundu.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic3Activity : AppCompatActivity() {
    lateinit var btnNext5:Button
    lateinit var btnPrev5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic3)
        btnNext5 = findViewById(R.id.btnNext5)

        btnPrev5 = findViewById(R.id.btnPrev5)
        btnPrev5.setOnClickListener {
            val intent = Intent(this, pic2Activity::class.java)
            startActivity(intent)
        }

        btnNext5.setOnClickListener {
                val intent = Intent(this, pic4Activity::class.java)
                startActivity(intent)

        }
    }
}
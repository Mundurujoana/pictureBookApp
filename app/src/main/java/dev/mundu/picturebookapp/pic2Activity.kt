package dev.mundu.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic2Activity : AppCompatActivity() {
    lateinit var btnNext1:Button
    lateinit var btnprev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic2)
        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent = Intent(this, pic3Activity::class.java)
            startActivity(intent)
        }
        btnprev = findViewById(R.id.btnPrev)
        btnprev.setOnClickListener {
            val intent = Intent(this, pic1Activity::class.java)
            startActivity(intent)

        }
    }
}
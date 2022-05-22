package dev.mundu.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic1Activity : AppCompatActivity() {
    lateinit var btnNext:Button
lateinit var btnPrev7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic1)
        btnNext= findViewById(R.id.btnNext)
        btnNext.setOnClickListener{
            val intent = Intent(this, pic2Activity::class.java)
            startActivity(intent)
    }
        btnPrev7 = findViewById(R.id.btnPrev7)
        btnPrev7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
}
}
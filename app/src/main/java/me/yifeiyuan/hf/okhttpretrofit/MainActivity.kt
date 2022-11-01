package me.yifeiyuan.hf.okhttpretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goSpringBootServer(view: View) {
        startActivity(Intent(this,SpringBootActivity::class.java))
    }
}
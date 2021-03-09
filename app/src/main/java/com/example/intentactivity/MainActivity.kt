package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveData: Button = findViewById(R.id.btn_move_data)
        btnMoveData.setOnClickListener(this)
    }
    override fun onClick(v: View?){
        when(v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_data -> {
                val moveDataIntent = Intent(this@MainActivity, MoveWithData::class.java)
                moveDataIntent.putExtra(MoveWithData.EXTRA_NAME, "Sarah")
                moveDataIntent.putExtra(MoveWithData.EXTRA_AGE, 5)
                startActivity(moveDataIntent)
            }
        }
    }
}
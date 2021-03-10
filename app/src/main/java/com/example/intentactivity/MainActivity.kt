package com.example.intentactivity

import android.content.Intent
import android.net.Uri
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
        val btnMoveObject: Button = findViewById(R.id.btn_move_object)
        btnMoveObject.setOnClickListener(this)
        val btnDialNumber: Button = findViewById(R.id.btn_move_dial)
        btnDialNumber.setOnClickListener(this)
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
            R.id.btn_move_object -> {
                val person = Person(
                        "Dicoding Academy",
                        5,
                        "academy@gmail.com",
                        "Bandung"
                )
                val moveObjectData = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                moveObjectData.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveObjectData)
            }
            R.id.btn_move_dial -> {
                val phoneNumber = "085932990987"
                val phoneDialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(phoneDialIntent)

            }
        }
    }
}
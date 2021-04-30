package com.anastazijazivkovic.birdcounterapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View.OnClickListener
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.counter)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.blueBird)
        findViewById<Button>(R.id.roseBird)
        findViewById<Button>(R.id.greenBird)
        findViewById<Button>(R.id.yellowBird)
        findViewById<Button>(R.id.resetBtn)
        val constraintLayout: ConstraintLayout


        fun roseClickHandler(view: View, function: () -> Int) {
            counter++
            make_new_state(counter.toString(), Color.MAGENTA)
        }

        fun roseClickHandler(view: View) {
            counter++
            make_new_state(counter.toString(), Color.MAGENTA)
        }

        fun blueClickHandler(view: View) {
            counter++
            make_new_state(counter.toString(), Color.BLUE)
        }

        fun greenClickHandler(view: View) {
            counter++
            make_new_state(counter.toString(), Color.GREEN)
        }

        fun yellowClickHandler(view: View) {
            counter++
            make_new_state(counter.toString(), Color.YELLOW)
        }

        fun resetClickHandler(view: View) {
            counter++
            make_new_state(counter.toString(), Color.BLACK)

        } }

        private fun make_new_state(birdcounter: String, BackgroundColor: Int) {
            counter.text=birdcounter
            constraintLayout.setBackgroundColor(BackgroundColor)

            } }


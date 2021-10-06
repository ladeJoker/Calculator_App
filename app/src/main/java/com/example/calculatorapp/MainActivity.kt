package com.example.calculatorapp

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var display: TextView
    private lateinit var zero: Button
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var plusMinus: Button
    private lateinit var decimal: Button
    private lateinit var multiply: Button
    private lateinit var divide: Button
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var clear: Button
    private lateinit var result: Button
    private lateinit var del: Button
    private lateinit var c: CalculationsProcess
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        c = CalculationsProcess()
        display = findViewById(R.id.tvDisplay)
        display.text = c.showText
        zero = findViewById(R.id.btRowFour0)
        one = findViewById(R.id.btRowThree1)
        two = findViewById(R.id.btRowThree2)
        three = findViewById(R.id.btRowThree3)
        four = findViewById(R.id.btRowTwo4)
        five = findViewById(R.id.btRowTwo5)
        six = findViewById(R.id.btRowOne6)
        seven = findViewById(R.id.btRowOne7)
        eight = findViewById(R.id.btRowOne8)
        nine = findViewById(R.id.btRowOne9)
        add = findViewById(R.id.btRowFourPlus)
        subtract = findViewById(R.id.btRowThreeMinus)
        multiply = findViewById(R.id.btRowOneStar)
        divide = findViewById(R.id.btRowOneDiv)
        decimal = findViewById(R.id.btRowFourDot)
        plusMinus = findViewById(R.id.btRowFourSign)
        clear = findViewById(R.id.btRowFiveC)
        result = findViewById(R.id.btRowFiveEqual)
        del = findViewById(R.id.btRowFiveDel)


        zero.setOnClickListener { c.setNum("0"); display.text = c.showText }
        one.setOnClickListener { c.setNum("1"); display.text = c.showText }
        two.setOnClickListener { c.setNum("2"); display.text = c.showText }
        three.setOnClickListener { c.setNum("3"); display.text = c.showText }
        four.setOnClickListener { c.setNum("4"); display.text = c.showText }
        five.setOnClickListener { c.setNum("5"); display.text = c.showText }
        six.setOnClickListener { c.setNum("6"); display.text = c.showText }
        seven.setOnClickListener { c.setNum("7"); display.text = c.showText }
        eight.setOnClickListener { c.setNum("8"); display.text = c.showText }
        nine.setOnClickListener { c.setNum("9"); display.text = c.showText }
        add.setOnClickListener { c.operator('+'); display.text = c.showText }
        subtract.setOnClickListener { c.operator('-'); display.text = c.showText }
        multiply.setOnClickListener { c.operator('*'); display.text = c.showText }
        divide.setOnClickListener { c.operator('/'); display.text = c.showText }
        decimal.setOnClickListener { c.setDot(); display.text = c.showText }
        plusMinus.setOnClickListener { c.onClickPlusMinus(); display.text = c.showText }
        clear.setOnClickListener { c.clearAll(); display.text = c.showText }
        result.setOnClickListener { c.calculate(); display.text = c.showText }
        del.setOnClickListener { c.del(); display.text = c.showText }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation === Configuration.ORIENTATION_LANDSCAPE) {
            display.setPadding(0,0,24,0)
            display.textSize = 24f
        } else if (newConfig.orientation === Configuration.ORIENTATION_PORTRAIT) {
            display.setPadding(0,24,24,0)
            display.textSize = 32f
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d("MyLocation", "I'm in onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("MyLocation", "I'm in onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("MyLocation", "I'm in onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("MyLocation", "I'm in onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MyLocation", "I'm in onDestroy")
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main_menu, menu)
//        return true
//    }
}
package jp.techacademy.kosuke.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human1 = Human("きのした",22,"スノーボード")
        val human2 = Human("こうすけ",21,"釣り")

        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}
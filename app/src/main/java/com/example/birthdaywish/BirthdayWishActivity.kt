package com.example.birthdaywish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_wish.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayWishActivity : AppCompatActivity() {

    companion object{
        const val Name_extra="Name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)


        val name=intent.getStringExtra(Name_extra)
        birthday_greeting.text="Happy Birthday\n$name! "
    }
}
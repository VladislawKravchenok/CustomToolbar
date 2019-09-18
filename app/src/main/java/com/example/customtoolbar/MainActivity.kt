package com.example.customtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.R.attr.start
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.animation.AnimationUtils
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toolbar.*


class MainActivity : AppCompatActivity() {

    private lateinit var fragment: BaseFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragment = MainFragment()
        supportFragmentManager.beginTransaction().add(R.id.container_fragment, fragment).commit()

    }
}
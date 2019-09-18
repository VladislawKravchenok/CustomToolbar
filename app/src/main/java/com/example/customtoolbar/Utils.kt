package com.example.customtoolbar

import android.view.View
import android.view.animation.AnimationUtils

fun animateClickOnView(view: View) {
    view.startAnimation(
        AnimationUtils.loadAnimation(
            CustomToolbarApplication.instance,
            R.anim.image_click
        )
    )
}


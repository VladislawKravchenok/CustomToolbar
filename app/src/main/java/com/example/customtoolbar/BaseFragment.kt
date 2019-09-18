package com.example.customtoolbar

import android.content.Context
import android.view.View.VISIBLE
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.custom_toolbar.*

abstract class BaseFragment : Fragment() {
    private lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    protected fun initToolbar() {
        when (this) {
            is MainFragment -> {
                mainActivity.run {
                    iv_home.visibility = VISIBLE
                    iv_home.setOnClickListener { animateClickOnView(it) }
                    tv_title.setText(R.string.toolbar_title)
                    tv_title.setOnClickListener { animateClickOnView(it) }//always visible by default in xml
                    //tv_connect_button.setOnClickListener { animateClickOnView(it) }
                    iv_image.visibility = VISIBLE
                    iv_image.setOnClickListener { animateClickOnView(it) }
                }
            }
            //TODO (customize) You can create another fragment to customize visibility and click listener here and other...
            //TODO (customize) Also you can add any other views and tools into layout in 'custom_toolbar.xml'
        }
    }
}
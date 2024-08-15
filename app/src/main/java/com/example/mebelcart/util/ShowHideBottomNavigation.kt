package com.example.mebelcart.util

import android.view.View
import androidx.fragment.app.Fragment
import com.example.mebelcart.R
import com.example.mebelcart.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView = (activity as ShoppingActivity).findViewById<BottomNavigationView>(
        com.example.mebelcart.R.id.bottomNavigation
    )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView = (activity as ShoppingActivity).findViewById<BottomNavigationView>(
        com.example.mebelcart.R.id.bottomNavigation
    )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}

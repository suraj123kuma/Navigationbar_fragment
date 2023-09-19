package com.example.navigationbar_fragment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DrawerLayout=findViewById<DrawerLayout>(R.id.drawerLayout)
        val navigationView=findViewById<NavigationView>(R.id.navigation)
        val toolbar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            DrawerLayout.open()
        }
      navigationView.setNavigationItemSelectedListener {
          when(it.itemId){
              R.id.home->replaceFragmenet(Fragment_Home())
              R.id.profile->replaceFragmenet(Fragment_Profile())
              R.id.setting->replaceFragmenet(Setting_Fragment())
              R.id.finger->replaceFragmenet(Finger_Fragment())
          }
          DrawerLayout.close()
          false
      }
        val butt = findViewById<BottomNavigationView>(R.id.Buttonnavigation)
        butt.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home->replaceFragmenet(Fragment_Home())
                R.id.profile->replaceFragmenet(Fragment_Profile())
                R.id.setting->replaceFragmenet(Setting_Fragment())
                R.id.finger->replaceFragmenet(Finger_Fragment())
                else -> {
                }
            }
            true
        }
    }
    private fun replaceFragmenet(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmeee,fragment).commit()
    }
}
private fun NavigationView.setOnItemSelectedListener(any: Any) {
}

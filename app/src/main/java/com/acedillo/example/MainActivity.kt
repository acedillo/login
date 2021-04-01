package com.acedillo.example

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.acedillo.example.repository.RoomUserRepository
import com.acedillo.example.ui.main.LoginFragment
import com.acedillo.example.ui.main.PageViewModel
import com.acedillo.example.ui.main.SectionsPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        viewModel =
            ViewModelProvider(this, PageViewModel.getFactory(RoomUserRepository())).get(
                PageViewModel::class.java
            )


    }

    private fun showLoginFragment(){
        supportFragmentManager.beginTransaction().add()
    }
}
package com.jt17.playmarketclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jt17.playmarketclone.databinding.ActivityMainBinding
import com.jt17.playmarketclone.fragments.Apps
import com.jt17.playmarketclone.fragments.Books
import com.jt17.playmarketclone.fragments.Games

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentClicks()

    }

    private fun changeReplacedFragment(fragment: Fragment) {
        //used replaced fragments
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainFragment, fragment)
        fragmentTransaction.commit()
    }

    private fun fragmentClicks() {
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.games -> changeReplacedFragment(Games())
                R.id.apps -> changeReplacedFragment(Apps())
                R.id.books -> changeReplacedFragment(Books())
            }
            true
        }

    }

}
package com.example.viewpager2tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2tutorials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.beach1,
            R.drawable.beach2,
            R.drawable.beach3,
            R.drawable.beach4,
            R.drawable.beach5,
            R.drawable.beach6,
            R.drawable.beach7
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter

        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}
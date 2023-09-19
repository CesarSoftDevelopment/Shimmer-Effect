package com.example.shimmereffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.LinearLayout
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {

    private lateinit var shimmerFrameLayout : ShimmerFrameLayout
    private lateinit var dataLayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        shimmerFrameLayout = findViewById(R.id.shimmer_view)
        dataLayout = findViewById(R.id.data_view)


        dataLayout.visibility = View.INVISIBLE
        shimmerFrameLayout.startShimmerAnimation()

        val handler = Handler()
        handler.postDelayed({
            dataLayout.visibility = View.VISIBLE
            shimmerFrameLayout.stopShimmerAnimation()
            shimmerFrameLayout.visibility = View.INVISIBLE


        }, 5000)

    }
}
package com.android.khutbaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnboardingItems()
    }

    private fun setOnboardingItems(){
        onboardingItemsAdapter = OnboardingItemsAdapter(
            listOf(
                OnboardingItem(
                    onboardingImage = R.drawable.task,
                    title = "manage your task",
                    description = "organize all your todos in the projects. Color tag them to set priorities"
                ),
                OnboardingItem(
                    onboardingImage = R.drawable.time,
                    title="Work on time",
                    description = "when you are overwhelmed by the amount of work you have to do stop and rethink"
                ),
                OnboardingItem(
                    onboardingImage = R.drawable.reminder,
                    title="reminder setting",
                    description = "when you encounter a small task that less than 5 minutes to complete"
                )
            )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter = onboardingItemsAdapter
    }
}
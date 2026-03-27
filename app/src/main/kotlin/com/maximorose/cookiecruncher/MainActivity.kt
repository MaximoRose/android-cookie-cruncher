package com.maximorose.cookiecruncher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val clearButton: Button = findViewById(R.id.clear_button)
        
        clearButton.setOnClickListener {
            clearCookies()
        }
    }
    
    private fun clearCookies() {
        val cookieClearer = CookieClearer(this)
        
        try {
            cookieClearer.clearCookiesOnly()
            
            Toast.makeText(
                this,
                "Cookies cleared successfully!",
                Toast.LENGTH_SHORT
            ).show()
        } catch (e: Exception) {
            Toast.makeText(
                this,
                "Error clearing cookies: ${e.message}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
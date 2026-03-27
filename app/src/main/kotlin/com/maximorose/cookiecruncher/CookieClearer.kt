package com.maximorose.cookiecruncher

import android.content.Context
import android.webkit.CookieManager
import android.webkit.WebStorage

class CookieClearer(private val context: Context) {
    
    fun clearCookiesOnly() {
        // Clear cookies
        val cookieManager = CookieManager.getInstance()
        cookieManager.removeAllCookies(null)
        cookieManager.flush()
        
        // Clear WebStorage (LocalStorage, SessionStorage)
        WebStorage.getInstance().deleteAllData()
    }
}
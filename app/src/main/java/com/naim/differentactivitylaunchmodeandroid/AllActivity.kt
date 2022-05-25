package com.naim.differentactivitylaunchmodeandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.differentactivitylaunchmodeandroid.ui.AActivity
import com.naim.differentactivitylaunchmodeandroid.ui.BActivity
import com.naim.differentactivitylaunchmodeandroid.ui.CActivity
import com.naim.differentactivitylaunchmodeandroid.ui.DActivity

class AllActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startMyActivity(AActivity::class.java)
        startMyActivity(BActivity::class.java)
        startMyActivity(CActivity::class.java)
        startMyActivity(DActivity::class.java)
        startMyActivity(MainActivity::class.java)
    }

    private fun startMyActivity(classes: Class<*>?) {
        val intent = Intent(this, classes)
        startActivity(intent)
    }
}
package com.naim.differentactivitylaunchmodeandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.differentactivitylaunchmodeandroid.databinding.ActivityMainBinding
import com.naim.differentactivitylaunchmodeandroid.ui.AActivity
import com.naim.differentactivitylaunchmodeandroid.ui.BActivity
import com.naim.differentactivitylaunchmodeandroid.ui.CActivity
import com.naim.differentactivitylaunchmodeandroid.ui.DActivity

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartA.setOnClickListener {
            startMyActivity(MainActivity::class.java)
        }
        binding.btnStartB.setOnClickListener {
            startMyActivity(BActivity::class.java)
        }
        binding.btnStartC.setOnClickListener {
            startMyActivity(CActivity::class.java)
        }
        binding.btnStartD.setOnClickListener {
            startMyActivity(DActivity::class.java)
        }
        binding.btnDefault.setOnClickListener {
            startMyActivityWithFlag(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        binding.btnSingleTop.setOnClickListener {
            startMyActivityWithFlag(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        }
        binding.btnSingleTask.setOnClickListener {
//            startMyActivityWithFlag(Intent.SI)
        }
        binding.firstTitle.text = "Start Main Activity"
    }

    private fun startMyActivity(classes: Class<*>?) {
        val intent = Intent(this, classes)
        startActivity(intent)
    }

    private fun startMyActivityWithFlag(flag: Int) {
        val intent = requiredIntent()
        intent.flags = flag
        startActivity(intent)
    }

    private fun requiredIntent(): Intent {
        return when (binding.spinner.selectedItemPosition) {
            0 -> {
                Intent(this, AActivity::class.java)
            }
            1 -> {
                Intent(this, BActivity::class.java)
            }
            2 -> {
                Intent(this, CActivity::class.java)
            }
            else -> {
                Intent(this, DActivity::class.java)
            }
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        binding.firstTitle.text = "Start Main Activity form new intent"
    }
}
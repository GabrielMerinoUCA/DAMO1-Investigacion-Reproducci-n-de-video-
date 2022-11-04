package ni.edu.uca.investigacionrvideos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.investigacionrvideos.databinding.ActivityFvideoBinding
import ni.edu.uca.investigacionrvideos.databinding.ActivityMainBinding
import ni.edu.uca.investigacionrvideos.databinding.ActivitySvideoBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindind.root)
        iniciar()
    }

    private fun iniciar() {
        bindind.btnVideo1.setOnClickListener{
            startActivity(Intent(this, FVideo::class.java))
        }
        bindind.btnVideo2.setOnClickListener {
            startActivity(Intent(this, SVideo::class.java))
        }
    }
}
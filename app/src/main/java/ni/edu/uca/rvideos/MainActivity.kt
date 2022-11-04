package ni.edu.uca.rvideos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import ni.edu.uca.rvideos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inciar()
    }

    private fun inciar() {
        binding.btnGallery.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_GET_CONTENT
            intent.type = "video/*"
            startActivityForResult(intent, 200)


        }
        binding.vvVideo.setOnPreparedListener{
            var mediaController = MediaController(this)
            binding.vvVideo.setMediaController(mediaController)
            mediaController.setAnchorView(binding.vvVideo)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 200) {
            if (data != null) {
                val uri: Uri = data.data!!
                binding.vvVideo.setVideoURI(uri)
            } else {
                Toast.makeText(this, "No seleccionaste ningun video", Toast.LENGTH_SHORT).show()

            }
        }
    }
}
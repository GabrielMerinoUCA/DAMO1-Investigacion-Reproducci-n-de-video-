package ni.edu.uca.investigacionrvideos

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import ni.edu.uca.investigacionrvideos.databinding.ActivityFvideoBinding

class FVideo : AppCompatActivity() {
    private lateinit var binding: ActivityFvideoBinding
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFvideoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createVideoView()
    }

   private fun createVideoView() {
       binding.vvVideo1
       var videoPath = "android.resource://" + packageName + "/" + R.raw.fvideo
       var uri = Uri.parse(videoPath)
       binding.vvVideo1.setVideoURI(uri)

       var mediaController = MediaController(this)
       binding.vvVideo1.setMediaController(mediaController)
       mediaController.setAnchorView(binding.vvVideo1)
    }
}
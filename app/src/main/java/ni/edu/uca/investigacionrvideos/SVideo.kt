package ni.edu.uca.investigacionrvideos

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import ni.edu.uca.investigacionrvideos.databinding.ActivityFvideoBinding
import ni.edu.uca.investigacionrvideos.databinding.ActivitySvideoBinding

class SVideo : AppCompatActivity() {
    private lateinit var binding: ActivitySvideoBinding
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySvideoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        createVideoView()
        setContentView(binding.root)
    }

   private fun createVideoView() {
       binding.vvVideo2
       var videoPath = "android.resource://" + packageName + "/" + R.raw.svideo
       var uri = Uri.parse(videoPath)
       binding.vvVideo2.setVideoURI(uri)

       var mediaController = MediaController(this)
       binding.vvVideo2.setMediaController(mediaController)
       mediaController.setAnchorView(binding.vvVideo2)
   }
}
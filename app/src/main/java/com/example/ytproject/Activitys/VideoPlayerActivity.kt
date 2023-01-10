package com.example.ytproject.Activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ytproject.databinding.ActivityVideoPlayerBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener


class VideoPlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityVideoPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycle.addObserver(binding.youtubePlayerView)

        binding.youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = intent.getStringExtra("videoId")
                youTubePlayer.loadVideo(videoId!!, 0f)
            }
        })

    }
}
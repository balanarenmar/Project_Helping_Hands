package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Initialize the MediaPlayer
        mediaPlayer = MediaPlayer.create(this, R.raw.rickoll)
        // Start playing the sound effect
        mediaPlayer.start()
        // Play for the duration
        val soundDuration = mediaPlayer.duration

        // Purposefully delay screen. argument of Intent is the target activity

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
            finish()
        }, 2000) // delayed time in milliseconds.
    }
}
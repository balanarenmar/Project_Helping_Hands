package org.tensorflow.lite.examples.objectdetection

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val sdbDetect = findViewById<Button>(R.id.sdb_Detect)
        sdbDetect.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

            startActivity(intent)
            //finish it. closes app. BAD FIX
            //finish()
        }

        val showGesture = findViewById<Button>(R.id.vdgb_Gestures)
        showGesture.setOnClickListener {
            val viewChoices = layoutInflater.inflate(R.layout.modal_view_models, null)

            val viewDetectable = Dialog(this)
            viewDetectable.setContentView(viewChoices)

            viewDetectable.setCancelable(true)
            viewDetectable.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            viewDetectable.show()

            val alpha = viewChoices.findViewById<Button>(R.id.vdgb_alpha)
            val num = viewChoices.findViewById<Button>(R.id.vdgb_num)
            val phrase = viewChoices.findViewById<Button>(R.id.vdgb_prase)
            val rps = viewChoices.findViewById<Button>(R.id.vdgb_rps)

            alpha.setOnClickListener {
                viewDetectable.dismiss()

                val intent = Intent (this, ClassesAlphabet::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

                startActivity(intent)
            }
            num.setOnClickListener {
                viewDetectable.dismiss()

                val intent = Intent (this, ClassesNumber::class.java)

                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

                startActivity(intent)
            }
            phrase.setOnClickListener {
                viewDetectable.dismiss()

                val intent = Intent (this, ClassesPhrase::class.java)

                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

                startActivity(intent)
            }
            rps.setOnClickListener {
                viewDetectable.dismiss()

                val intent = Intent (this, ClassesGame::class.java)

                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

                startActivity(intent)
            }
        }
    }
}
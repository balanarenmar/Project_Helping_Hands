package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MenuScreen : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_screen)
        supportActionBar?.title = "Home";
        supportActionBar?.subtitle = "sairam";

        val sdbDetect = findViewById<Button>(R.id.sdb_Detect)
        sdbDetect.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)

            startActivity(intent)
            //finish it. closes app. BAD FIX
            //finish()
        }

        //detector for seeing Detectable Gestures (Gestures in class list)

        /*ClassesScreen*/
        val models = findViewById<Button>(R.id.class_Gestures)
        models.setOnClickListener {
            val intent = Intent (this, ClassesNumber::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            startActivity(intent)
        }
    }

}
package org.tensorflow.lite.examples.objectdetection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import org.tensorflow.lite.examples.objectdetection.data.Datasource


class ClassesScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.features_screen)

        // Initialize data.
        val myDataset = Datasource().loadPhrase()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)


        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}

package org.tensorflow.lite.examples.objectdetection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import org.tensorflow.lite.examples.objectdetection.adapter.ItemAdapter
import org.tensorflow.lite.examples.objectdetection.data.Datasource


class ClassesAlphabet : AppCompatActivity() {
    private lateinit var searchView: SearchView
    private val myDataset = Datasource().loadAlphabet()
    private lateinit var adapter: ItemAdapter
    private lateinit var recyclerView: RecyclerView // Declare recyclerView as a member variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.features_screen)

        // Initialize data.
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        adapter = ItemAdapter(this)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        //val recyclerView = findViewById<RecyclerView>(RecyclerView)

        searchView = findViewById(R.id.search_view)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                // Perform search logic when the user submits the query (optional)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                // Perform search logic as the user types or modifies the query
                // You can filter your dataset based on the new query and update the RecyclerView adapter
                filterDataset(newText)
                return true
            }
        })



    }

    private fun filterDataset(query: String) {
        val filteredDataset = myDataset.filter { affirmation ->
            // Perform filtering logic based on the query
            // Return true if the affirmation matches the query, otherwise false
            val text = getString(affirmation.stringResourceId)
            text.contains(query, ignoreCase = true)
        }

        (recyclerView.adapter as ItemAdapter).submitList(filteredDataset)
    }
}

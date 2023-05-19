package org.tensorflow.lite.examples.objectdetection.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.tensorflow.lite.examples.objectdetection.R
import org.tensorflow.lite.examples.objectdetection.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [FeaturesScreen]. Displays [Affirmation] data object.
 */
class ItemAdapter(private val context: Context) :
    ListAdapter<Affirmation, ItemAdapter.ItemViewHolder>(DiffCallback) {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * DiffCallback for calculating the difference between two lists.
     */
    private object DiffCallback : DiffUtil.ItemCallback<Affirmation>() {
        override fun areItemsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
            return oldItem.stringResourceId == newItem.stringResourceId
        }

        override fun areContentsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
            return oldItem == newItem
        }
    }
}
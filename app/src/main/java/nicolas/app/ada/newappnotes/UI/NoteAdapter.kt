package nicolas.app.ada.newappnotes.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import nicolas.app.ada.newappnotes.Data.Note
import nicolas.app.ada.newappnotes.R

class NoteAdapter(private val notesList: Array<Note>) :
    RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.iditText)
        }
    }
    // inflar vista
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.stickynote, viewGroup, false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val note = notesList [position]
        viewHolder.textView.text = note.text
    }
    //conteo de intems
    override fun getItemCount() = notesList.size

}
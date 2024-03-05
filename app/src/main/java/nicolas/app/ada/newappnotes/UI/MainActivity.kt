package nicolas.app.ada.newappnotes.UI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import nicolas.app.ada.newappnotes.Data.AppDataBase
import nicolas.app.ada.newappnotes.Data.Note
import nicolas.app.ada.newappnotes.Data.NoteDao
import nicolas.app.ada.newappnotes.R


class MainActivity : AppCompatActivity() {

    lateinit var noteDao: NoteDao
    lateinit var noteAdapter: NoteAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView : RecyclerView =findViewById(R.id.recyclerview)
        initDataBase()
        configureRecyclerView(recyclerView)

    }

    fun configureRecyclerView(recyclerView: RecyclerView){
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        noteAdapter = NoteAdapter(arrayOf())
    }
    fun initDataBase(){
        val db = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java, "database-name"
        ).build()
         noteDao = db.noteDao()
        val notes: List<Note> = noteDao.getAll()
    }
}
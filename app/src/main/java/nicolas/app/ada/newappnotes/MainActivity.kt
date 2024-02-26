package nicolas.app.ada.newappnotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import nicolas.app.ada.newappnotes.Data.AppDataBase
import nicolas.app.ada.newappnotes.Data.Note

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val db =Room.databaseBuilder(
        applicationContext,

        AppDataBase::class.java, "database-name"
    ).build()
    val noteDao = db.noteDao()
    val notes : List<Note> = noteDao.getAll()
}
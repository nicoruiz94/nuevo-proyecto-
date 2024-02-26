package nicolas.app.ada.newappnotes.Data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 1)
abstract class AppDataBase :RoomDatabase() {
    abstract fun noteDao():NoteDao
}
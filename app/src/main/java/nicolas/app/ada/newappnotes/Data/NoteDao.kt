package nicolas.app.ada.newappnotes.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAll(): List<Note>

    @Query("SELECT * FROM note WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Note>

    @Insert
    fun insertAll(vararg users: Note)

    @Delete
    fun delete(user: Note)

}
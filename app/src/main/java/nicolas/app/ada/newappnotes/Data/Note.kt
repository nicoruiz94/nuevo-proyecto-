package nicolas.app.ada.newappnotes.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey val uid : Int?,
    @ColumnInfo (name = "color") val color : String?,
    @ColumnInfo (name= "text")  val text : String?,
    @ColumnInfo (name = "date") val date : Int?

)
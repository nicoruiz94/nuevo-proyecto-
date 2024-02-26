package nicolas.app.ada.newappnotes.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey val uid : Int?,
    @ColumnInfo val color : String?,
    @ColumnInfo val text : String?,
    @ColumnInfo val date : Int?

)
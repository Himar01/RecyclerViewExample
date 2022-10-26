package es.ulpgc.moreno101.himar.recyclerviewexample

import androidx.room.Insert
import androidx.room.OnConflictStrategy

interface AppDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: SuperAppModel): Long
}
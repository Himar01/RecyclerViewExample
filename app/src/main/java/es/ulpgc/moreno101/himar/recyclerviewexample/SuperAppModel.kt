package es.ulpgc.moreno101.himar.recyclerviewexample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="app")
data class SuperAppModel (
    @PrimaryKey val id: Int,
    @ColumnInfo(name="name") val app:String,
    @ColumnInfo(name="creator") val creator:String,
    @ColumnInfo(name="description") val description:String,
    @ColumnInfo(name="photo_url") val photo:String
    )
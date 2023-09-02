package com.hann.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hann.noteapp.ui.theme.*

@Entity(tableName = "note")
data class Note(
    val title : String,
    val content : String,
    val timestamp : Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
){
    companion object {
        val noteColors = listOf(Purple80, PurpleGrey80, Pink80, Purple40, PurpleGrey40)
    }
}

class InvalidNotedException(message : String): Exception(message)


package com.hann.noteapp.feature_note.domain.use_case

import com.hann.noteapp.feature_note.domain.model.InvalidNotedException
import com.hann.noteapp.feature_note.domain.model.Note
import com.hann.noteapp.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNotedException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()){
            throw InvalidNotedException("The Title of the note cant be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNotedException("The content of the note cant be empty")
        }
        repository.insertNote(note)
    }

}
package com.hann.noteapp.feature_note.presentation.notes

import com.hann.noteapp.feature_note.domain.model.Note
import com.hann.noteapp.feature_note.domain.util.NoteOrder
import com.hann.noteapp.feature_note.domain.util.OrderType

data class NoteState(
    val note : List<Note> = emptyList(),
    val noteOrder : NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible : Boolean = false
)
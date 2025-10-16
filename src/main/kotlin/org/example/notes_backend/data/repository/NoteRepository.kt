package org.example.notes_backend.data.repository

import org.bson.types.ObjectId
import org.example.notes_backend.data.model.Note
import org.springframework.data.mongodb.repository.MongoRepository

interface NoteRepository: MongoRepository<Note, ObjectId> {
    fun findByOwnerId(ownerId: ObjectId): List<Note>
}
package org.example.notes_backend.data.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("note")
data class Note(
    val title: String,
    val description: String,
    val createdAt: Instant,
    val color: Long,
    val ownerId: ObjectId,
    @Id val id: ObjectId = ObjectId.get()
)
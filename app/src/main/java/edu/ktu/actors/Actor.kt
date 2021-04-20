package edu.ktu.actors

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Actor(
    @PrimaryKey(autoGenerate = true) val actorId: Int,
    val fullName: String,
    val birthYear: Int,
    val movie: String
    )
package DS

import java.util.*

class Partition(var nom: String = "", notes: List<Note>?) : Iterable<Note> {

    private val notes = ArrayList<Note>()

    init {
        if (notes != null) {
            this.notes.addAll(notes)
        }
    }

    override fun iterator(): Iterator<Note> {
        return notes.iterator()
    }
}

class Note(var nom: String) {
}
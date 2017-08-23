package DS

class Queue<T> : Iterable<T> {

    fun enqueue(item: T) {

    }

    fun dequeue(): T? {
        return null
    }

    override fun iterator(): Iterator<T> {
        throw UnsupportedOperationException("not implemented")
    }
}
package DS

/**
 * Created by Euranto on 26/07/2017.
 */
class Stack<T> : Iterable<T> {

    fun enqueue(item: T) {

    }

    fun dequeue(): T? {
        return null
    }

    override fun iterator(): Iterator<T> {
        throw UnsupportedOperationException("not implemented")
    }
}
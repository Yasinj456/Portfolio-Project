package Components.Standard;

/**
 * Standard interface for all components.
 *
 * @param <T>
 *            the type of the implementing class.
 */
public interface Standard<T> {

    /**
     * Clears this object to its initial value.
     *
     * @clears this
     * @ensures this is in its initial state
     */
    void clear();

    /**
     * Creates and returns a new instance of this object.
     *
     * @return a new instance of this object
     * @ensures <pre>
     * newInstance is a fresh object with the same initial state
     * </pre>
     */
    T newInstance();

    /**
     * Transfers the value of the given object into this object.
     *
     * @param source
     *            the object to transfer from
     * @updates this
     * @clears source
     * @ensures this = #source
     */
    void transferFrom(T source);
}
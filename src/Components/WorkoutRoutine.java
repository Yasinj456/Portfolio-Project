package Components;

/**
 * Enhanced interface for WorkoutRoutine.
 * Extends WorkoutRoutineKernel with additional operations.
 *
 * @author Yasin
 */

public interface WorkoutRoutine extends WorkoutRoutineKernel {
    /**
     * Updates an existing exercise in this routine.
     *
     * @param name
     *            the name of the exercise
     * @param sets
     *            updated sets
     * @param reps
     *            updated reps
     * @param weight
     *            updated weight
     * @ensures the exercise with this name is updated if present
     */
    void updateExercise(String name, int sets, int reps, int weight);

    /**
     * Checks whether this routine contains a given exercise.
     *
     * @param name
     *            exercise name
     * @return true if this routine contains an exercise with this name
     * @ensures contains = true if and only if exercise exists
     */
    boolean contains(String name);

    /**
     * Calculates the total training volume of this workout routine.
     *
     * @return total volume (sets × reps × weight)
     * @ensures totalVolume >= 0
     */
    int totalVolume();

    /**
     * Prints all exercises in this routine.
     *
     * @ensures prints each exercise’s details
     */
    void printRoutine();

}

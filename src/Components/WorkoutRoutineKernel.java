package Components;

/**
 * Kernel interface for WorkoutRoutine.
 * Shows the minimal operations needed for a workout routine.
 *
 * @author Yasin
 */

public interface WorkoutRoutineKernel {
    /**
     * Adds a new exercise to this workout routine.
     *
     * @param name
     *            the name of the exercise
     * @param sets
     *            number of sets
     * @param reps
     *            number of reps per set
     * @param weight
     *            weight used per rep
     * @ensures adds a new exercise with given attributes to the routine
     */
    void addExercise(String name, int sets, int reps, int weight);

    /**
     * Removes an exercise by name from this workout routine.
     *
     * @param name
     *            the name of the exercise to remove
     * @ensures removes the exercise if present
     */
    void removeExercise(String name);

    /**
     * Clears all exercises from this workout routine.
     *
     * @ensures this workout routine contains no exercises
     */
    void clearRoutine();

    /**
     * Returns the number of exercises in this workout routine.
     *
     * @return number of exercises
     * @ensures size >= 0
     */
    int size();

}

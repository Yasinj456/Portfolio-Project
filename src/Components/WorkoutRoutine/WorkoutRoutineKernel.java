package Components.WorkoutRoutine;

import Components.Standard.Standard;

/**
 * Kernel interface for WorkoutRoutine.
 *
 * @author Yasin
 */
public interface WorkoutRoutineKernel extends Standard<WorkoutRoutine> {

    /**
     * Adds a new exercise to this workout routine.
     *
     * @param name
     *            the name of the exercise
     * @param sets
     *            number of sets for this exercise
     * @param reps
     *            number of reps per set
     * @param weight
     *            weight used per set
     * @updates this
     * @requires name is not empty and sets, reps, weight > 0
     * @ensures this = #this with the new exercise added
     */
    void addExercise(String name, int sets, int reps, int weight);

    /**
     * Removes an exercise from this workout routine.
     *
     * @param name
     *            the name of the exercise to remove
     * @updates this
     * @requires exercise with given name exists in this
     * @ensures this = #this with the exercise removed
     */
    void removeExercise(String name);

    /**
     * Clears all exercises from this routine.
     *
     * @updates this
     * @ensures this = empty workout routine
     */
    void clearRoutine();

    /**
     * Returns the number of exercises in this workout routine.
     *
     * @return the number of exercises
     * @ensures size = |this|
     */
    int size();
}
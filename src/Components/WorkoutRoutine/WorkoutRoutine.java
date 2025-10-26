package Components.WorkoutRoutine;

/**
 * Enhanced interface for WorkoutRoutine.
 *
 * @author Yasin
 */
public interface WorkoutRoutine extends WorkoutRoutineKernel {

    /**
     * Updates an existing exercise in this workout routine.
     *
     * @param name
     *            the name of the exercise
     * @param sets
     *            new number of sets
     * @param reps
     *            new number of reps
     * @param weight
     *            new weight value
     * @updates this
     * @requires exercise with given name exists in this
     * @ensures this = #this with the given exercise updated
     */
    void updateExercise(String name, int sets, int reps, int weight);

    /**
     * Checks whether this workout routine contains an exercise with the given name.
     *
     * @param name
     *            the name 
     * @return true if an exercise with the name exists, false otherwise
     * @ensures contains = (name is in this)
     */
    boolean contains(String name);

    /**
     * Computes the total training volume for this workout routine.
     *
     * @return total volume (sum of sets × reps × weight for all exercises)
     * @ensures totalVolume = sum of (sets × reps × weight) for each exercise in this
     */
    int totalVolume();

    /**
     * Prints this workout routine in a readable format.
     *
     * @ensures routine prints
     */
    void printRoutine();
}
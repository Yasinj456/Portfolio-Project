package Components.WorkoutRoutine;

import components.list.List;
import components.list.List1L;

/**
 * Kernel implementation of WorkoutRoutine.
 *
 * @author Yasin
 * @convention all exercises in this.exercises list have non-null names and positive sets, reps, and weight
 * @correspondence this = the list of exercises in order with their sets, reps, and weight
 */
public class WorkoutRoutine1L extends WorkoutRoutineSecondary{
    
   /**
     * List representation of the exercises.
     */
    private List<String> rep;

    /**
     * Constructor for an empty WorkoutRoutine.
     */
    public WorkoutRoutine1L() {
        this.rep = this.createNewRep();
    }

    /**
     * Creates a new empty representation list.
     *
     * @return a new empty List of Strings
     */
    private List<String> createNewRep() {
        return new List1L<>();
    }

}

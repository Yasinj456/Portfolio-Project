package Components.WorkoutRoutine;

import components.list.List;
import components.list.List1L;

/**
 * Kernel implementation of WorkoutRoutine.
 *
 * @author Yasin
 * @convention all exercises in this.rep have non-null names and positive sets, reps, and weight
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

    **
     * Resets this routine back to empty.
     */
    @Override
    public void clear() {
        this.clearRoutine();
    }


    @Override
    public void addExercise(String name, int sets, int reps, int weight) {
        assert name != null && name.length() > 0;
        assert sets > 0 && reps > 0 && weight > 0;

        String exercise = name + ":" + sets + ":" + reps + ":" + weight;
        this.rep.addRightFront(exercise);
    }

    @Override
    public void removeExercise(String name) {
        assert name != null && name.length() > 0;

        this.rep.moveToStart();
        int count = this.rep.rightLength();
        boolean found = false;

        for (int i = 0; i < count && !found; i++) {
            String exercise = this.rep.rightFront();
            int colon = 0;
            while (colon < exercise.length() && exercise.charAt(colon) != ':') {
                colon++;
            }
            String exerciseName = exercise.substring(0, colon);

            if (exerciseName.equals(name)) {
                this.rep.removeRightFront();
                found = true;
            } else {
                this.rep.advance();
            }
        }
    }

    @Override
    public void clearRoutine() {
        this.rep.clear();
    }

    @Override
    public int size() {
        return this.rep.rightLength() + this.rep.leftLength();
    }

    @Override
    public WorkoutRoutine1L newInstance() {
        return new WorkoutRoutine1L();
    }

    @Override
    public void transferFrom(WorkoutRoutine source) {
        WorkoutRoutine1L s = (WorkoutRoutine1L) source; 
        this.rep = s.rep;       
        s.rep = s.createNewRep();  
        
    }
}

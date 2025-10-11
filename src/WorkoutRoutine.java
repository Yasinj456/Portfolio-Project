import java.util.ArrayList;
import java.util.List;


/** 
@author Yasin Jama 
*/
public class WorkoutRoutine {
    
    
    
    private static class Exercise {
        private String name;
        private int sets;
        private int reps;
        private int weight;

        Exercise(String name, int sets, int reps, int weight) {
            this.name = name;
            this.sets = sets;
            this.reps = reps;
            this.weight = weight;
        }

    }

    private List<Exercise> exercises;

    /**
     * Default constructor.
     * @return 
     */
    public void WorkoutRoutine2() {
        this.exercises = new ArrayList<>();
    }

    /**
     * Adds a new exercise.
     */
    public void addExercise(String name, int sets, int reps, int weight) {
        Exercise e = new Exercise(name, sets, reps, weight);
        this.exercises.add(e);
    }

    /**
     * Removes an exercise by name.
     */
    public void removeExercise(String name) {
        for (int i = 0; i < this.exercises.size(); i++) {
            if (this.exercises.get(i).name.equals(name)) {
                this.exercises.remove(i);
                return; 
            }
        }
    }

    /**
     * Updates an exercise already there.
     */
    public void updateExercise(String name, int sets, int reps, int weight) {
        for (Exercise e : this.exercises) {
            if (e.name.equals(name)) {
                e.sets = sets;
                e.reps = reps;
                e.weight = weight;
                return;
            }
        }
    }

    /**
     * Returns number of exercises.
     */
    public int size() {
        return this.exercises.size();
    }

    /**
     * Checks if the routine contains an exercise by name.
     */
    public boolean contains(String name) {
        for (Exercise e : this.exercises) {
            if (e.name.equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Calculates total training volume.
     */
    public int totalVolume() {
        int total = 0;
        for (Exercise e : this.exercises) {
            total += e.sets * e.reps * e.weight;
        }
        return total;
    }

    /**
     * Prints all exercises.
     */
    public void printRoutine() {
        System.out.println("Workout Routine:");
        for (Exercise e : this.exercises) {
            System.out.println("- " + e.name + ": " + e.sets + "x" + e.reps + " (" + e.weight + " lbs)");
        }
    }

    /**
     * Clears all exercises.
     */
    public void clearRoutine() {
        this.exercises.clear();
    }

    /**
     * Simple main to test behavior.
     */
    public static void main(String[] args) {
        WorkoutRoutine r = new WorkoutRoutine();
        r.addExercise("Bench Press", 3, 10, 95);
        r.addExercise("Squat", 4, 8, 135);
        r.printRoutine();

        System.out.println("Total volume: " + r.totalVolume());
        System.out.println("Contains Squat? " + r.contains("Squat"));

        r.updateExercise("Bench Press", 3, 8, 105);
        r.printRoutine();

        r.removeExercise("Squat");
        r.printRoutine();

        r.clearRoutine();
        System.out.println("Size after clear: " + r.size());
    }

    













}

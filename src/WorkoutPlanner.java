import Components.WorkoutRoutine.WorkoutRoutine;
import Components.WorkoutRoutine.WorkoutRoutine1L;

public class WorkoutPlanner {

    private WorkoutRoutine upperBody;
    private WorkoutRoutine lowerBody;

    public WorkoutPlanner() {
        this.upperBody = new WorkoutRoutine1L();
        this.lowerBody = new WorkoutRoutine1L();

        // Upper body day
        this.upperBody.addExercise("Bench Press", 3, 8, 145);
        this.upperBody.addExercise("Overhead Press", 3, 10, 85);
        this.upperBody.addExercise("Row", 4, 10, 95);

        // Lower body day
        this.lowerBody.addExercise("Squat", 4, 6, 205);
        this.lowerBody.addExercise("Leg Press", 3, 12, 230);
        this.lowerBody.addExercise("Calf Raise", 4, 15, 70);
    }

    public void printPlan() {
        System.out.println("Upper Body Day:");
        this.upperBody.printRoutine();
        System.out.println("Total volume: " + this.upperBody.totalVolume());
        System.out.println();

        System.out.println("Lower Body Day:");
        this.lowerBody.printRoutine();
        System.out.println("Total volume: " + this.lowerBody.totalVolume());
    }

    public static void main(String[] args) {
        WorkoutPlanner planner = new WorkoutPlanner();
        planner.printPlan();
    }
}

import Components.WorkoutRoutine.WorkoutRoutine;
import Components.WorkoutRoutine.WorkoutRoutine1L;

public class WorkoutRoutineDemo {
    public static void main(String[] args) {
        WorkoutRoutine routine = new WorkoutRoutine1L();

        routine.addExercise("Bench Press", 3, 10, 135);
        routine.addExercise("Squat", 4, 8, 185);
        routine.addExercise("Lat Pulldown", 3, 12, 90);

        System.out.println("Number of exercises: " + routine.size());
        System.out.println("Total training volume: " + routine.totalVolume());

        System.out.println("Contains Bench Press? " + routine.contains("Bench Press"));
        System.out.println("Contains Deadlift? " + routine.contains("Deadlift"));

        routine.printRoutine();
    }

}

package Portfolio-Project.test;
package Components.WorkoutRoutine;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkoutRoutineSecondaryTest {

    /**
     * Test updateExercise changes sets/reps/weight through totalVolume.
     */
    @Test
    public void testUpdateExerciseChangesVolume() {
        WorkoutRoutine r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100); 

        r.updateExercise("Bench", 4, 10, 100);

        assertEquals(1, r.size());
        assertTrue(r.contains("Bench"));
        assertEquals(4 * 10 * 100, r.totalVolume());
    }

    /**
     * Test updateExercise on one of several exercises.
     */
    @Test
    public void testUpdateExerciseAmongMany() {
        WorkoutRoutine r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100); 
        r.addExercise("Squat", 4, 8, 200);  

        r.updateExercise("Bench", 2, 10, 100); 

        int expected = 2000 + 6400;
        assertEquals(2, r.size());
        assertEquals(expected, r.totalVolume());
    }

    /**
     * Test printRoutine works as it should.
     */
    @Test
    public void testPrintRoutine() {
        WorkoutRoutine r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);
        r.addExercise("Squat", 4, 8, 200);

        r.printRoutine();
        
    }

    /**
     * Test equals returns true when workout sizes match.
     */
    @Test
    public void testEqualsSameSize() {
        WorkoutRoutine r1 = new WorkoutRoutine1L();
        WorkoutRoutine r2 = new WorkoutRoutine1L();

        r1.addExercise("Bench", 3, 10, 100);
        r2.addExercise("Squat", 4, 8, 200);

       
        assertTrue(r1.equals(r2));
    }

    /**
     * Test equals returns false for different sizes.
     */
    @Test
    public void testEqualsDifferentSize() {
        WorkoutRoutine r1 = new WorkoutRoutine1L();
        WorkoutRoutine r2 = new WorkoutRoutine1L();

        r1.addExercise("Bench", 3, 10, 100);
        r2.addExercise("Squat", 4, 8, 200);
        r2.addExercise("Row", 3, 12, 90);

        assertFalse(r1.equals(r2));
    }

    /**
     * Test toString includes the correct size in the message.
     */
    @Test
    public void testToStringMessage() {
        WorkoutRoutine r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);
        r.addExercise("Squat", 4, 8, 200);
        r.addExercise("Row", 3, 12, 90);

        String s = r.toString();
        assertEquals("WorkoutRoutine with 3 exercises", s);
    }
}
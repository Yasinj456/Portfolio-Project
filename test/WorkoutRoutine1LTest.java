package Portfolio-Project.test; 
package Components.WorkoutRoutine;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkoutRoutine1LTest {

    /**
     * Test constructor: new routine should be empty.
     */
    @Test
    public void testConstructorEmpty() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        assertEquals(0, r.size());
        assertEquals(0, r.totalVolume());
    }

    /**
     * Test addExercise with one exercise.
     */
    @Test
    public void testAddExerciseOne() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);
        assertEquals(1, r.size());
        assertTrue(r.contains("Bench"));
        assertEquals(3 * 10 * 100, r.totalVolume());
    }

    /**
     * Test addExercise with two exercises.
     */
    @Test
    public void testAddExerciseTwo() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100); 
        r.addExercise("Squat", 4, 8, 200);  
        assertEquals(2, r.size());
        assertTrue(r.contains("Bench"));
        assertTrue(r.contains("Squat"));
        assertEquals(3000 + 6400, r.totalVolume());
    }

    /**
     * Test removeExercise removes the right one and leaves the rest.
     */
    @Test
    public void testRemoveExerciseMiddle() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);
        r.addExercise("Squat", 4, 8, 200);
        r.addExercise("Row", 3, 12, 90);

        r.removeExercise("Squat");

        assertEquals(2, r.size());
        assertTrue(r.contains("Bench"));
        assertTrue(r.contains("Row"));
        assertFalse(r.contains("Squat"));
    }

    /**
     * Test clearRoutine makes the routine empty.
     */
    @Test
    public void testClearRoutine() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);
        r.addExercise("Squat", 4, 8, 200);

        r.clearRoutine();

        assertEquals(0, r.size());
        assertEquals(0, r.totalVolume());
    }

    /**
     * Test clear calls clearRoutine.
     */
    @Test
    public void testClearStandard() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);

        r.clear();

        assertEquals(0, r.size());
        assertEquals(0, r.totalVolume());
    }

    /**
     * Test newInstance returns a fresh empty routine.
     */
    @Test
    public void testNewInstance() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100);

        WorkoutRoutine1L fresh = r.newInstance();

        assertNotSame(r, fresh);
        assertEquals(0, fresh.size());
        assertEquals(0, fresh.totalVolume());
    }

    /**
     * Test transferFrom moves all data from source into this.
     */
    @Test
    public void testTransferFrom() {
        WorkoutRoutine1L source = new WorkoutRoutine1L();
        WorkoutRoutine1L target = new WorkoutRoutine1L();

        source.addExercise("Bench", 3, 10, 100);
        source.addExercise("Squat", 4, 8, 200);

        target.transferFrom(source);

        assertEquals(0, source.size());
        assertEquals(2, target.size());
        assertTrue(target.contains("Bench"));
        assertTrue(target.contains("Squat"));
    }

    /**
     * Test totalVolume with many exercises.
     */
    @Test
    public void testTotalVolumeMultiple() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        r.addExercise("Bench", 3, 10, 100); 
        r.addExercise("Squat", 5, 5, 200);  
        r.addExercise("Row", 4, 8, 80);     

        int expected = 3000 + 5000 + 2560;
        assertEquals(expected, r.totalVolume());
    }

    /**
     * Test contains on empty and non-empty routine.
     */
    @Test
    public void testContainsBasic() {
        WorkoutRoutine1L r = new WorkoutRoutine1L();
        assertFalse(r.contains("Bench"));

        r.addExercise("Bench", 3, 10, 100);
        assertTrue(r.contains("Bench"));
        assertFalse(r.contains("Squat"));
    }
}

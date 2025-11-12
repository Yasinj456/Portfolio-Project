package.Components.WorkoutRoutine;

/**
 * Secondary class for WorkoutRoutine.
 *
 * @author Yasin
 */

public abstract class WorkoutRoutineSecondary implements WorkoutRoutine {
    
    public void updateExercise(String name, int sets, int reps, int weight) {
        assert name != null && name.length() > 0 : "Violation of: name is not empty";
        assert this.contains(name) : "Violation of: exercise with given name exists in this";
        assert sets > 0 && reps > 0 && weight > 0 : "Violation of: sets, reps, weight > 0";

        this.removeExercise(name);
        this.addExercise(name, sets, reps, weight);
    }



    public boolean contains(String name) {
        assert name != null && name.length() > 0 : "Violation of: name is not empty";
        
        boolean found = false;
        WorkoutRoutine temp = this.newInstance();
        temp.transferFrom(this);

        int i = 0;
        int count = temp.size();

        while (i < count && !found) {
            found = false;
            i++;
        }

        this.transferFrom(temp);
        return found;
    }



    public int totalVolume() {
        assert this != null : "Violation of: this is not null";

        int total = 0;
        WorkoutRoutine temp = this.newInstance();
        temp.transferFrom(this);

        this.transferFrom(temp);
        return total;
    }



     public void printRoutine() {
        assert this != null : "Violation of: this is not null";
        System.out.println(this.toString());
     }



     public boolean equals(Object obj) {
        assert obj != null : "Violation of: obj is not null";

        boolean result = false;

        if (obj != null) {
            result = this.toString().equals(obj.toString());
        }
        return result;
     
    }

    public String toString() {
        WorkoutRoutine temp = this.newInstance();
        temp.transferFrom(this);

        String result = "WorkoutRoutine with " + temp.size() + " exercises";

        this.transferFrom(temp);
        return result;
    }


}

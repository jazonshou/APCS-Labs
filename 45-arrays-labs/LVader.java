import java.util.Arrays;

//make your LVader class here

public class LVader {
    private int[] stopsOnEachFloor;

    LVader(int numberOfFloors) {
        stopsOnEachFloor = new int[numberOfFloors];
    }

    public boolean inRange(int num) {
        return num < stopsOnEachFloor.length;
    }

    public boolean incNumStops(int floor) {
        if(inRange(floor)) {
            stopsOnEachFloor[floor]++;
            return true;
        } 
        return false;
    }

    public int numStops(int floor) {
        return floor >= stopsOnEachFloor.length ? -1 : stopsOnEachFloor[floor];
    }

    public int floorWithMostStops() {
        int prev = 0, floor = 0;
        for(int i = 0; i < stopsOnEachFloor.length; i++) {
            if(stopsOnEachFloor[i] > prev) {
                floor = i;
            }
            prev = stopsOnEachFloor[i];
        }
        return floor;
    }

    public String toString() {
        return "" + Arrays.toString(stopsOnEachFloor);
    }
}
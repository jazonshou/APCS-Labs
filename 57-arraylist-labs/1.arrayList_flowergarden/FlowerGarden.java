import java.util.Arrays;
import java.util.ArrayList;

public class FlowerGarden
{
	//create an arraylist instance variable
	private ArrayList<String> flowers;

	//write a constructor 		
	public FlowerGarden() {
        flowers = new ArrayList<String> ();
    }

	//write add flower
	public void addFlower(String f) {
        if(getCount(f) == 0) {
            flowers.add("01 " + f);
        } else {
            int prevPos = findFlower(f);
            int newCount = getCount(f) + 1;
            if(newCount < 10) {
                flowers.add(("0" + newCount) + " " + f);
            } else {
                flowers.add((newCount) + " " + f);
            }
            // delete previous copy of flower
            flowers.remove(prevPos);
        }
    }

	//write get count
	public int getCount(String f) {
        int pos = findFlower(f);

        if(pos == -1) {
            return 0;
        } else {
            return Integer.parseInt(flowers.get(pos).substring(0, 2));
        }
    }

	//write get flower name
	public String getFlowerName(int index) {
        return index < flowers.size() ? flowers.get(index).substring(3) : "out of range";
    }

	//write in range
	public boolean inRange(int val, int start, int end) {
        return val >= start && val < end;
    }

	//write find flower
    public int findFlower(String f) {
        for(int i = 0; i < flowers.size(); i++) {
            if(flowers.get(i).indexOf(f) >= 0) {
                return i;
            }
        }
        return -1;
    }

	//write max flower	
	public String maxFlower() {
        int maxNum = 0;
        String maxFlower = "";
        for(int i = 0; i < flowers.size(); i++) {
            String temp = getFlowerName(i);
            if(getCount(temp) > maxNum) {
                maxFlower = temp;
                maxNum = getCount(temp);
            }
        }
        int maxFlowerCnt = getCount(maxFlower);
        if(maxFlowerCnt < 10) {
            return "0" + maxFlowerCnt + " " + maxFlower;
        }
        return maxFlowerCnt + " " + maxFlower;
    }

	//write a toString
    public String toString() {
        return flowers + "";
    }
}
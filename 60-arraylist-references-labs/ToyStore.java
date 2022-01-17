//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
        toyList = new ArrayList<Toy> ();
	}

	public void loadToys( String[] toys )
	{
        boolean repeat = false;
        for(String toy : toys) {
            for(Toy item : toyList) {
                if(toy.equals(item.getName())) {
                    item.setCount(item.getCount() + 1);
                    repeat = true;
                } 
            }
            if(!repeat) {
                toyList.add(new Toy(toy));
            }
            repeat = false;
        }
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy : toyList) {
            if(toy.getName().equals(nm)) {
                return toy;
            }
        }
        return null;
  	}
  
  	public String getMostFrequentToy()
    {
        String max = "";
        int prevMax = 0;
        for(Toy toy : toyList) {
            if(toy.getCount() > prevMax) {
                max = toy.getName();
            }
        }
  		return max;
  	}  
  
  	public void sortToysByCount()
  	{
        ArrayList<Toy> sortedToys = new ArrayList<Toy> ();
        
        int[] nums = new int[toyList.size()];
        for(int i = 0; i < toyList.size(); i++) {
            nums[i] = toyList.get(i).getCount();
        }
        Arrays.sort(nums);

        for(int j = 0; j < nums.length; j++) {
            for(int i = 0; i < toyList.size(); i++) {
                if(toyList.get(i).getCount() == nums[j]) {
                    sortedToys.add(toyList.get(i));
                    toyList.remove(i);
                    break;
                }
            }
        }
        toyList = sortedToys;
  	}  
  	  
	public String toString()
	{
	   return toyList + "";
	}
}
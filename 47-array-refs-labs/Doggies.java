//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
        if(spot < pups.length) {
            Dog n = new Dog(age, name);
            pups[spot] = n;
        }
	}

	public String getNameOfOldest()
	{
        String oldest = "";
        int prev = 0;
        for(Dog item : pups) {
            if(item.getAge() > prev) {
                oldest = item.getName();
            }
            prev = item.getAge();
        }
		return oldest;
	}

	public String getNameOfYoungest()
	{
		String youngest = "";
        int prev = 0;
        for(Dog item : pups) {
            if(item.getAge() < prev) {
                youngest = item.getName();
            }
            prev = item.getAge();
        }
		return youngest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
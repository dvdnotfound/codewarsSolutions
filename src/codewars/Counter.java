package codewars;

public class Counter {
	public int countSheeps(Boolean[] arrayOfSheeps) {
	    int sheeps = 0;
	    for(Boolean shep : arrayOfSheeps)
	      if(shep != null && shep == true) 
	        sheeps++;
	  return sheeps;
	}
}

import java.util.HashMap;
public class Majority{
	public static void main(String[] args){
		int[] maxElement = new int[10000];
		int[] arr = { 3, 3 ,4, 2, 4, 4, 2, 4};
		int size = arr.length/2;
		int val = 0;
		for (int i=0; i < arr.length ; i++) {
		  maxElement[arr[i]] += 1;
		 } 
		for (int i=0; i < arr.length ; i++) {
		    if(size < maxElement[i]){
		    	val = i;
		    }
		 }
		 if (val > 0)
		 	System.out.println("Value is : " + val);
		 else
		 	System.out.println("NONE");
	}
}
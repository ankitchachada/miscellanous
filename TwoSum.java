public class TwoSum { 
	 
	private static void getsum(int[] arr,int n){
		boolean[] boo = new boolean[10000];
		for (int i=0;i<arr.length ; ++i ) {
			int temp = n - arr[i];
			if(temp >=0 && boo[temp]){
				System.out.println("Pair with given sum " +
                                    n + " is (" + arr[i] +
                                    ", "+temp+")");
    
			}
			boo[arr[i]] = true;
		}
	}
	public static void main(String[] args){
		int[] arr = {2,3,4,5,6,7,8,9};
		int n = 10;
		getsum(arr,n);
	}
}
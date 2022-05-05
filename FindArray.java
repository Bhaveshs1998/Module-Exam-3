import java.util.*;
class FindArray{
	
	//Method to implioment search operation in java
	
	static int findElement(int arr[], int n, int key){
		for(int i = 0; i < n; i++){
			if(arr[i] == key){
				return i;
			}
			//return -1;
		}
	return -1;	
	}

	
	//Driver code
	public static void main(String args[]){
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int n = arr.length;
		
		//using element from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value that you want to find : ");
		int key = sc.nextInt();
		
		int position = findElement(arr, n, key);
		
		if(position == -1){
			System.out.println("Element not found !!!!");
		}
		else{
			System.out.println("Given element is at position : "+(position+1));
		}
	    
	}
}
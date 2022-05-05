//Reversing array elements using recursion

import java.io.*;
class ReverseArray1{
	
	//Method to revere array elements from start to end
	static void reverseArray(int arr[], int start, int end){
		
		int temp;
		if(start >= end){
			return;
			
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArray(arr, start+1, end-1);
		}
	}	
		//utility that prints out an array on a line
		static void printArray(int arr[], int size){
			for(int i = 0; i < size; i++){
				System.out.println(arr[i]+" ");
			}
			System.out.println();
	}
	
	public static void main(String args[]){
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		System.out.println("Original Arrya elements: ");
		printArray(arr, 9);
		
		reverseArray(arr, 0, 8);
		System.out.println("Array after reversal are : ");
		printArray(arr, 9);
	}
	
}

import java.util.*;
import java.io.*;

public class ArrayBuckets {

    int length;
    int[] nums;
    ArrayList[] buckets;

    public ArrayBuckets(int n){
	Random r = new Random();
	int random;
	length = n;
	nums = new int[length];
	for (int i = 0; i<n; i++){
	    random = r.nextInt(1000);
	    nums[i] = random;
	}
    }

    public String toString(){
	return Arrays.toString(nums);
    }

    public int getL(){
	return length;
    }



    public void bsort(int[] a){
	int swaps = 0;
	int comparisons = 0;
	for (int n = 0; n<a.length; n++){
	    for (int i = 0; i<a.length-1; i++){
		comparisons++;
		if (a[i] > a[i+1]){
		    int temp = a[i];
		    a[i] = a[i+1];
		    a[i+1] = temp;
		    swaps++;
		}
	    }
	    if (swaps == 0){
		System.exit(0);
	    }
	}
    }


    public void insertionSort(int[] a){
	int ins=0;
	for (int i = 1; i<a.length; i++){
	    int temp = a[i];
	    for (int j = i-1;j>=0;j--){
		if (temp < a[j]){
		    a[j+1] = a[j];
		    a[j] = temp;
		    ins++;
		}
	    }
	}
    }


    public void selectionSort(int[] a){
	for (int i=0;i<a.length;i++){
	    //swap counts?
	    int minIndex=i;
	    for (int j = i; j<a.length; j++){
		if (a[j]<=a[minIndex]){
		    minIndex = j;
		}
	    }

	    int temp = a[minIndex]; 
	    a[minIndex] = a[i];
	    a[i] = temp;

	}
    }







    public void radixSort(){
	int value, digit; 
	for (int pos = 0; pos<3; pos++){ 
	    buckets = new ArrayList[10];
	    for (int j = 0; j<10; j++){
		buckets[j] = new ArrayList();
	    }
	    for (int i = 0; i<length; i++){
		value = nums[i];
		digit = (((value)/((int)(Math.pow(10,pos))))%10);//ex: this would return 5 if pos = 1 and nums[i] was 425
		//System.out.println(digit);
		//System.out.println(value);
		(buckets[digit]).add(nums[i]);
	    }
	    int[] temp = new int[length];
	    int tp= 0;
	    for (int j = 0; j<buckets.length; j++){
		for (int k = 0; k<(buckets[j]).size() && tp<length; k++){
		    nums[tp] = (Integer)((buckets[j]).get(k));
		    tp++; 
		}
	    }
	    //    System.out.println(Arrays.toString(nums));
	}
    }
}







 

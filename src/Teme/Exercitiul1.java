package Teme;
import java.util.Arrays;
public class Exercitiul1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"ana" , "ion" , "ana", "lucy",        "antonia"}; 
        int n = arr.length; 
          
        System.out.println(mostFrequent(arr,n)); 
	}
	static String mostFrequent(String arr[], int n) { 
		Arrays.sort(arr); 
		int max_count = 1; 
		String res = arr[0]; 
        int curr_count = 1;   
        for (int i = 1; i < n; i++) { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        return res; 
    } 
}

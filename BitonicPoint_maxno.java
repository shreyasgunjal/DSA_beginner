/* Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array. */

import java.util.Scanner;
import java.util.*;

class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int a = arr[n-1];
        return a;
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt(); 
        }
        
        Solution obj = new Solution();
        
        
        System.out.println(obj.findMaximum(arr , n));


    }
}

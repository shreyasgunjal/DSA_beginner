/* Wave of array*/
/* to change position of neighbour elements */
import java.util.Scanner;
import java.util.*;

class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int temp;
        for(int i=1; i<n ; i+=2){
            temp = a[i-1];
            a[i-1] = a[i];
            a[i] = temp;
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt(); 
        }
        
        Solution obj = new Solution();
        obj.convertToWave(n, a);
        // Assuming `convertToWave` method returns the modified array `a`
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }


    }
}

/*Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.*/

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0 ; i<=n-k; i++){
            int j=i;
            
            int rex=0;
            while(j<k+i){
                rex = Math.max(rex,arr[j]);
            j++;
            }
            res.add(rex);
        }
        return res;
    }
}

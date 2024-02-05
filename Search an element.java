/* Search an element in an array */

class Solution{
        
    static int search(int arr[], int N, int X)
    {
        int i=0;
        int num;
       while(i<N){
           if(arr[i]==X){
              return i;
           }
           i++;
       }
       return -1;
    }
    
}

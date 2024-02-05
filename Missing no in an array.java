/* Missing no in an Array */

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        // Arrays.sort(array);
        // for(int i=0; i<n-1 ; i++){
        //     if(array[i] != i+1){
        //         return i+1;
        //     }
        // }
        // return n;
        
        int totalarr = 0;
        int totalloop = 0;
        
        for(int i=0 ; i<array.length ; i++){
            totalarr += array[i];
        }
        
        for(int j=1 ; j<=n ; j++){
            totalloop += j;
        }
        
        return totalloop - totalarr;
    }
}

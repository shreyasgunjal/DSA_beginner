/* Minimum and Maximum in array*/


class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        long minimum = a[0];
        long maximum = a[(int)n-1];
        
        return new Pair(minimum,maximum);
    }
}

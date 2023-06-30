Missing number in array (GFG)
class Solution {
    int missingNumber(int array[], int n) {
         int sum = (n*(n+1))/2;
        
        int sum_arr = 0;
        for(int i=0; i<n-1; i++){
            sum_arr += array[i];
        }
        
        int missing_no = sum - sum_arr;
        return missing_no;
    }
}
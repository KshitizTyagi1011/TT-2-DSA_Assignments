// Convert array into Zig-Zag fashion (GFG)
class Solution{
    public void zigZag(int a[], int n){
        boolean flag = true;
        int temp = 0;
        for(int i=0; i<n-1; i++){
            if(flag){
                if(a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            else{
                if(a[i] < a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            flag = !flag;
        }
    }
}
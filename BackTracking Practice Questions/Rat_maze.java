import java.util.* ;

import java.io.*; 

public class Solution {

    public static ArrayList < String > findSum(int[][] arr, int n) {

         ArrayList<String> al=new ArrayList<>();

         helper(arr,al,0,0,"",n);

         return al;

    }

    private static void helper(int[][] m, ArrayList<String> al, 

    int i,int j,String path,int n){

    if(i<0 || i>=n || j<0 || j>=n || m[i][j]==0){return ;}

    if(i==n-1 && j==n-1){

    al.add(path);

    return ;

    }

    m[i][j]=0;

    helper(m,al,i+1,j,path+"D",n);

    helper(m,al,i,j-1,path+"L",n);

    helper(m,al,i,j+1,path+"R",n);

    helper(m,al,i-1,j,path+"U",n);

    m[i][j]=1;

    return;

    }

}
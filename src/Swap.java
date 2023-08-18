import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Swap {

    public static  int [] process(BufferedReader br) throws Exception{
        /* start of the code */
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input [0]);// size of the array
        int k = Integer.parseInt(input[1]);  // roation
        String []arr = br.readLine().split(" ");
        int []newArr = new int [n];
        // string conversion to integer
        for(int i=0;i<arr.length;i++){
            newArr[i] = Integer.parseInt(arr[i]);
        }
        // actual logic
        k = k%n;
        while(k>0){
            int previousValue = newArr[0];
            int nextValue = -1 ;
            for(int i=1;i<n;i++){
                nextValue = newArr[i];
                newArr[i] = previousValue;
                previousValue = nextValue;
            }
            newArr[0] = nextValue;

            k--;
        }

        return newArr;

        /* end of the code */
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){

           int[] a =  process(br);
//
           for(int i=0;i<a.length-1;i++)
           System.out.print(a[i]+" ");
           System.out.println(a[a.length-1]);
            t--;
        }





    }
}

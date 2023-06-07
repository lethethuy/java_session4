package baiTapTrenLop;

import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr3.length; i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }else {
                arr3[i]=arr2[i-arr1.length];
                // vd: i =6; => arr3[6] = arr2[1]
                //           => arr3[7] = arr2[2]
            }
        }
        System.out.println(
                "mang sau khi duoc gop la: "+ Arrays.toString(arr3)
        );

    }
}

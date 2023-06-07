package baiTapTrenLop;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr1.length-1];
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap so muon xoa");
        int number = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i<arr1.length; i++ ){
            if(number==arr1[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Trong mang khong co so nay");
        }else {
            System.out.println("So nay nam o vi tri index "+index);
            for (int i = 0;i<arr2.length;i++){
                if(i<index){
                    arr2[i] =arr1[i];
                }
                if (i >= index){
                    arr2[i] = arr1[i+1];
                }
            }

        }
        System.out.println("Mảng sau khi xóa là: "+ Arrays.toString(arr2));

    }
}

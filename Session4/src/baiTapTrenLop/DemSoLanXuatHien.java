package baiTapTrenLop;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String string = "hieuratchilamom";

        System.out.println("Hay nhap vao 1 ky tu");

        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i<string.length(); i++){
            if(input == string.charAt(i)){
                count++;
            }
        }
        System.out.printf("ky tu %c xuat hien %d trong chuoi %s", input,count,string);
    }
}

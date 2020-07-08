package tinhtien;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		int [] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap mang");
		for(int i = 0; i < arr.length -1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("in mang");
		for(int i : arr) {
			System.out.println(i);
		}
         System.out.println("vi tri can them vao mang");
         int Vtri =  sc.nextInt();
         System.out.println("nhap so can them:");
           int So = sc.nextInt();
           for(int i =  arr.length-1 ; i > Vtri ; i--) {
        	   arr[i] = arr[i -1];
           }
           arr[Vtri] = So;
           for(int  i: arr) {
        	   System.out.println(i);
           }
	}

}

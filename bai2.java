package tinhtien;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Sodien;
		System.out.print("nhap so dien :");
         Sodien = sc.nextFloat();
         float  tien = 0;
         if(Sodien < 50) 
         {
            tien = Sodien*1549;
         }
         else if(Sodien <=100)
         {
        	 tien = 50*1549+(Sodien -50)*1600;
         }
         else if(Sodien <=200)
         {
        	 tien = 50*1549+ 50*1600+(Sodien -50 - 50)*1857;
         }
         else if(Sodien <=300)
         {
        	 tien = 50*1549+ 50*1600+100*1857+(Sodien - 50 - 50 -100)*2340;
         }
         else if(Sodien <=400)
         {
        	 tien = 50*1549+ 50*1600+100*1857+100*2340+(Sodien - 50 - 50 - 100 - 100)*2615;
         }
         else
         {
        	 tien = 50*1549+ 50*1600+100*1857+100*2340+100*2615+(Sodien - 50 - 50 - 100 - 100 - 100)*2701;
         }
         System.out.print("thanh tien la :" +tien+"VND");
	}
}
	

package tinhtien;

public class delete {

	public static void main(String[] args) {
		int[]arr= {90,90,20,27,35,22,10,8,8};
		int xoa = 35;
		int count = 0;
		for(int i = 0; i < arr.length; i++) 
		{
		   if(xoa == arr[i])
		   {
			   for(int j = i ; j < arr.length -3 ; j++)
			   {
				   arr[j] = arr[j+1];
			       
			   }
			   count =  count + 1;
			   break; 
			      
		   }
		  
		}
		if(count == 0)
		{
			System.out.println("not found");
		}
		else 
		{
			System.out.println("xoa thanh cong" );
			 for(int i = 0; i < arr.length; i++) 
			   {
				   System.out.print(arr[i]+  " ");
			   }

			
		}
		
		
	}

}

package tinhtien;

public class AddArray {

	public static void main(String[] args) {
		int[] arr = {90,90,20,27,35,22,10,8,8};
		int ViTri = 2;
		int SCD = 100;
		for(int  i = arr.length - 1 ; i > ViTri; i--)
		{ 
			   
		       arr[i] = arr[i-1];
		}
		arr[ViTri] = SCD;
		for(int i = 0 ; i < arr.length ; i++) 
		{
		
			System.out.print(arr[i]+ " ");
		}
	}
	

}

import java.util.ArrayList;

public class Javabasics {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		
		for (int i=0;i<arr1.length;i++)
		{
			if (arr1[i] % 2==0)
			{
				//System.out.println(arr1[i]);
				//break;
			}
			else
			{
				//System.out.println(arr1[i] + "is not multiple of 2 maccha");
			}
		}
		
		ArrayList a= new ArrayList();
		a.add("vinayak");
		a.add("Shridhara");
		a.add("Hebbar");
		
		System.out.println(a.get(1));
		
		for (int i=0;i<3;i++) {
			
			System.out.println(a.get(i));

		}
		
	}

}

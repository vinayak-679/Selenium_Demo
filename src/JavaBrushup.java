
public class JavaBrushup {

	public static void main(String[] args) {
		
		int a=2;
		double b = 1.232;
		float c =(float) 1.32;
		String web = "vinayak hebbar";
		char lett = 'w';
		boolean cond =true; 
		
		//System.out.println(a + b + c + web + lett + cond);

		//Array 1
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		//System.out.println(arr[4]);
		
		//Array 2
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		//System.out.println(arr1[8]);
		
		for(int i=0; i<arr.length; i++)
		{
			//System.out.println(arr[i]);
		}
		
		for(int j:arr1)
		{
			System.out.println(j*j);
		}
		
	}

}


public class TypeofStrings {

	public static void main(String[] args) {
		// can create string in 2 ways, String is an object in java
		String s="Vinayak";
		String s1="Vinayak";//now s1 will not allocate memory it will point it to s because both having same value
		
		
		// 2nd way
		String s2 = new String("Hebbar");
		String s3 = new String("Hebbar"); // now it will have 2 memory allocation because we have used new keyword so it will create 2 seperate memory for the same 2 values
		
		String s4 = "Vinayak Shridhara Hebbar";
		//String[] splittedStrings=s4.split(" ");
		//System.out.println(splittedStrings[0]);
		//System.out.println(splittedStrings[1]);
		//System.out.println(splittedStrings[2]);
		
		String[] splittedStrings=s4.split("Shridhara");
		System.out.println(splittedStrings[0]);
		System.out.println(splittedStrings[1]);
		System.out.println(splittedStrings[1].trim());
		
		for (int i=s4.length()-1;i>=0;i--) {
			
			System.out.println(s4.charAt(i));
		}

	}

}

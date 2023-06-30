
public class MethodsinJava {

	public static void main(String[] args) {
		
		MethodsinJava obj=new MethodsinJava();
		String s = obj.getdata();
		System.out.println(s);
		method2 obj2=new method2();
		obj2.getdata3();
		obj.getdata();
		getdata2();

	}
	
	//always should create methods out side the main method and should call it after using object
	//public = this method can be accessed by any classes available(ex:TypeofStrings,Javabasics etc classes)
	
	public String getdata()
	{
		System.out.println("Hello world");
		return "vinayak hebbar";
		
	}
	
	public static void getdata2() // no need to use object to call this because it is static
	{
		System.out.println("Static method no need of object");
		
	}
	
	
}

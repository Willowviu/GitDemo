
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
	}

	//why method? 
	//Basically because if you have any set up lines of code which you want to reuse every time, you can wrap all that lines in one block, and for 
	//that block you can give it one name, so whenever you want to use that set up lines of code, you can simply call that block name, 
	//automatically all that lines of code will be executed, so instead of repeating the lines again and again, then you will create a method
	//for it and wrap all that lines of code into that method.
	
	public String getData()
	{
		System.out.println("Hello world");
		System.out.println("Hello world2");
		System.out.println("Hello world3");
		return "Francisco de Miguel";
	}
	public static String getData2()
	{
		System.out.println("Hello world");
		return "Francisco de Miguel";
	}
	
	
}


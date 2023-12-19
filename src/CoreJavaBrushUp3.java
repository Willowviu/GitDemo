
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//******* One of the famous Job interview question:******* 
		// What is a String in Java?: It is an object that represent a sequence of characters
		// How many ways you can define a String?: There are 2 ways of creating Strings
		// One is String literal: Basically if you have same multiple values with the same name, then it won't create a new object, it will 
		// refer to the existing
	
		//String s1 = "Francisco de Miguel";
		String s5 = "Hello";
		
		
		// And the other is new keyWord: Here no matter if it's the same string value, it will still explicitly create a new object in the
		// memory space
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Francisco de Miguel";
		String[] SplittedString = s.split("de");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[1].trim());
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		//********Another famous interview question: Print the string in river
		
		}
	
	}


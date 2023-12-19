import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*** This is a famous job interview question, the difference between arrays and arrayList?
		//You can explain them that arrays have a static size that you can set it initially whereas the arrayList you can  
		//dynamically grow by adding multiple items into the List 
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10,11,122};
		
		//2,4,6,8,10,122
		//check if the array is multiple of 2
		
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{	
			System.out.println(arr2[i]);
			break;
			}
			else
			{
			System.out.println(arr2[i] +" is not multiple of 2");	
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Voy a facer");
		a.add("pao de queijo");
		a.add("en cero coma cero");
		a.add("a ver que tal me sale la primera vez");
		//a.remove(3);
		System.out.println(a.get(3));
		
		//Normal for loop
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));	
		}
		//Enhanced for loop
		System.out.println("***************************************");
		for ( String val :a)
		{
			System.out.println(val);
		}	
		//If you want to know/check whether any item is presented in the array list
		System.out.println(a.contains("pao de queijo"));
		
		
		//If you want to access any methods presented in the class you have to create an object of that class - object.method
	}

}

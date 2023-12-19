
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String website = "World Surf League";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum+" is the number of the variable I just declared as myNum");
		System.out.println("myNum is the number of the variable I just declared as myNum");
		System.out.println(website);
		
		//Arrays -> can store multiples values in one single variable
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		//this is another way to do it
		int[] arr2 = {1,2,4,5,6,7,8,9,10,11,122};
		
		//System.out.println(arr2[2]);
		//System.out.println(arr[2]);
		
		
		//For loop -> can iterate over each of every element of our arrays and can print values of it 
		//for loop arr.length - 5
		//for(int i = 0; i< arr.length; i++)
		{
			//System.out.println(arr[i]);
		}
		
		//for(int i = 0; i< arr2.length; i++)
		{
			//System.out.println(arr2[i]);
		}
		
		String[] name = {"Francisco", "de Miguel", "Arroyo"}; 
		for(int i = 0; i< name.length; i++)
		{
			System.out.println(name[i]);
		}
		//Another way to do it, it is called Enhanced for loop syntax
		for( String s: name)
		{
			System.out.println(s);
		}	
	
		
		
	
	
	
	
	
		
		
		
		
	}

}

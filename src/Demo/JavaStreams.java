package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreams {
	
	// TODO Auto-generated method stub
	//116.Learn everything about Java Streams
	
	//Count the number of names starting with alphabet A in a list
	//@Test
	public void regular() 
	{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Alvaro");
	names.add("Diego");
	names.add("Fran");
	names.add("Angel");
	names.add("Pablo");
	int count = 0;
		
	for(int i=0;i<names.size();i++)
	{
		String actual = names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}
	System.out.println(count);
	}
	
	//@Test using streams now
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alvaro");
		names.add("Diego");
		names.add("Fran");
		names.add("Angel");
		names.add("Alejandra");
		
		//There is no life for intermediate operations if there is no terminal operation
		//Terminal operation will execute only if intermediate operation (.filter) returns true
		//We can create stream with stream package(which for me is not working)
		//how to use .filter in Stream API
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//the action here is check whether starts with A
		//so here streams are extremely powerful cos they can scan your hole collection parallelly, it reduces a lot of execution
		//time
		
		long d = Stream.of("Alvaro","Diego","Fran","Angel","Alejandra").filter(s-> //****does not recognize the stream.of method
		{
			s.startsWith("A");
			return true;
		}).count();
	System.out.println(d);
		//print all the names of the ArrayList which are greater than 4
	//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//now we just want to print the 1st result
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//the most important thing to grab here is .forEach() which help us to scan through the hole array and it will print
		//in one single shot!
	}
	
	/*public static void main(String[] args)// public void steamMap() in the lesson
	{
		 ArrayList<String> names = new ArrayList<String>();
			names.add("man");
			names.add("Don");
			names.add("women");
			
		 
		//print the names which have last letter as "n " and convert them to Uppercase
			
		Stream.of("Alvaro","Diego","Fran","Angel","Alejandra").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//print names which have first letter as "A" with Uppercase and sorted (=ordenado)
		
		List<String> names1 = Arrays.asList("Alvaro","Diego","Fran","Angel","Alejandra");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//***Interview Question***
		//In general interviewer will give you the array and will ask you to sort it, so we will simply convert the array 
		//into a List smartly, after we will apply the .stream() and use the .sorted() method and print it.
		
		//Merging 2 different Lists and print it sorted
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());//this will concat 2 strings
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//We are checking now whether Angel is presented on the list with the result of a boolean
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Angel"));
		Assert.assertTrue(flag);
		System.out.println(flag);
		//so if flag (=Angel) is present the test will be valid and test case will pass, if it is not present flag will be false and the 
		//test case will fail
				
	}*/
	
	 //public void streamCollect()	//if commented out this public void and change the name so it is working*** 
	public static void main(String[] args)
	 {
		//we have a list and we need to do some modification/manipulation
		//and prepare a new list 
		//and with this new list we may need to perform any further operations in our class file
		 
		 List<String> ls = Stream.of("Alvaro","Diego","Fran","Angel","Alejandra").filter(s->s.endsWith("o")).map(s->s.toUpperCase())
		 .collect(Collectors.toList());
		 
		 //now we telling we want to print the first result of the names that ends with an "o" and in Uppercase
		 //System.out.println(ls.get(0));
		 //and we can get the same result but instead of using .collect() we can use .limit()
		 
		 //now imagine our interviewer is asking us to print a unique number from this array
		 //sort the array
		 List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		 //so 1st thing is convert it to a stream, and with .distinct() we will only print the unique distinct numbers and
		 //will avoid all the duplicates
		 //values.stream().distinct().forEach(s->System.out.println(s));
		 //***This are famous INTERVIEW QUESTIONS***like print unique number of the array and sort the array
		 //so you instead of writing multiple loops and conditions, if you write this single step they will GET IMPRESED!
		 
		 //now print the array in ascending order and print only the 3rd index (sorted will be 1,2,3,5,7,9)
		 List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		 System.out.println(li.get(2));
		 
		 
	 }
	}


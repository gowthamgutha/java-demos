/*
* More can be found at https://github.com/gowthamgutha/java-demos/
*/
import java.util.*;
public class MethodReferencesDemo
{
	public static void main(String args[])
	{
	List<String> namesList=new ArrayList<String>();
	
	namesList.add("Rama");
	namesList.add("Sita");
	namesList.add("Lakshmana");
	namesList.add("Bharatha");
	namesList.add("Sathrugna");

	// call the println() method of System.out object
	namesList.forEach(System.out::println);

  // call the static printString method of MethodReferencesDemo class
	namesList.forEach(MethodReferencesDemo::printString);
	}

	public static void printString(String st)
	{
	System.out.println(st);
	}
}

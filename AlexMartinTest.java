package myprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class AlexMartinTest {
public static void main(String [] agrs)
{
	int[] army= {2,3,4,6,8,3,5,9,7,6,8,9,3};
	printarmy(army);
}
public static void printarmy(int[] army)
{
	List<Integer> Alexarmy=new ArrayList<Integer>();
	List<Integer> Martinarmy=new ArrayList<Integer>();
	for(Integer i:army)
	{
		if(i%2==0)
			Alexarmy.add(i);
		else
			Martinarmy.add(i);
	}
	Collections.sort(Alexarmy);
	Collections.sort(Martinarmy,Collections.reverseOrder());
	System.out.println("Alex Army"+Alexarmy);
	System.out.println("Martin Army"+Martinarmy);
}
}

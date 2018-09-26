import java.util.*;
import java.io.*;

class Compare
{
	public static void main(String args[])
	{
		Set<String> s=new HashSet<>();
		s.add("harshita");
		s.add("garima");
		System.out.print("Set1 :");
		System.out.println(s);
		Set<String> s1=new HashSet<>();
		s1.add("harman");
		s1.add("yashi");
		s1.add("garima");
		s1.add("harshita");
		System.out.print("Set2: ");
		System.out.println(s1);
		s1.retainAll(s);
		System.out.print("common in both sets:");
		System.out.println(s1);
	}
}
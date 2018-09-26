import java.util.*;
import java.io.*;
class HashMapDemo
        {
         public static void main(String args[])
          {
	     HashMap hm=new HashMap();
	     hm.put("ABC",new Double(2318.40));
	     hm.put("HAR",new Double(8452.40));
	     hm.put("ARE",new Double(5737.22));
	     hm.put("MSK",new Double(3745.00));
	     hm.put("SRK",new Double(5930.16));
	     Set set=hm.entrySet();
	     Iterator i=set.iterator();
	     System.out.println("keys and values:");
	     while(i.hasNext())
	     {
		   Map.Entry me=(Map.Entry)i.next();
		   System.out.print(me.getKey()+":");
		   System.out.println(me.getValue());
	     }
           }
        }
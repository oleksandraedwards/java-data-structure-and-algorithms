package arrays;

import java.util.Arrays;

public class ArrayCopyReferences
{
   public static void main(String[] args)
   {
      Object[] obj1 = {new Integer(10),
                       new StringBuffer("foobar"),
                       new Double(12.95)};


      // At the first glance we might think that all data is copied.
      // In reality, the internal data is shared between two arrays.

      // The assignment operator obj2[i] = obj1[i] is a crucial part of understanding the concept.
      // You cannot copy references by assigning one to another. The assignment creates an alias rather than a copy.

      Object[] obj2 =  new Object[obj1.length];
      for(int i = 0; i < obj1.length; i ++)
            obj2[i] = obj1[i];

      //this change to obj1 does NOT effect obj2.
      obj1[0] = new Integer(5);

      System.out.println(Arrays.toString(obj1));
      System.out.println(Arrays.toString(obj2));
      System.out.println();


      //this change to obj1 DOES effect obj2
      ((StringBuffer) obj1[1]).append('s');

      System.out.println(Arrays.toString(obj1));
      System.out.println(Arrays.toString(obj2));
   }
}
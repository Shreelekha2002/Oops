/*public class Test {
public static void main(String[] args)
{
  int x = 9, y = 12, z = 3;
 
  int exp1 = x - y/3 + z * 2 - 1;
  int exp2 = (x - y)/3 + ((z * 2) - 1);
 
  System.out.println(exp1);
  System.out.println(exp2);
  }
}*//*
 public class Test {
public static void main(String[] args)
{
  int x = 9, y = 12;
  int a = 2, b = 4, c = 6;
 
   int exp = (3 + 4 * x)/5 - 10 * (y - 5) * (a + b + c)/x + 9 * (4/x + (9 + x)/y);
 
   System.out.println(exp);
  }
}
*//*
public class Test {
public static void main(String[] args)
{
  int x = 200, y = 50, z = 100;
  if(x > y && y > z)
 {
     System.out.println("Hello");
  }
 if(z > y && z < x)
{
   System.out.println("Java");
}
 if((y+200) < x && (y+150) < z)
{
   System.out.println("Hello Java");
 }
}
}
*/
/*
public class Test {
 public static void main(String[] args)
{
   int x = 20, y = 30, z = 50;
    x += y;
    y -= x + z;
    z *= x * y;
 System.out.println("x = " +x );
 System.out.println("y = " +y );
 System.out.println("z = " +z );
 }
}
*/
/*
public class Test {
public static void main(String[] args)
{
  int x=y=z = 10;
  System.out.println(x + " " + y + " " + z);// error will be cannot find symbol of y and z
  }
}
*/
public class Test {
public static void main(String[] args)
{
   int x, y, z;
   x = y = z = 2;
   x += y;
   y -= z;
   z /= (x + y);
 System.out.println(x + " " + y + " " + z);
  }
}
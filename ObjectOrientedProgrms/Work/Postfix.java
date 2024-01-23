public class Postfix{

public static void main(String args[]){

int num1=5;
int num2=9;

System.out.println("original number:"+num1);
num1++;
System.out.println("Postinc number:"+num1);
num1--;
System.out.println("Postdec number:"+num1);
num1+=1;
System.out.println("PostInc number:"+num1);
++num2;
System.out.println("Preinc number:"+num2);
--num2;
System.out.println("Predec number:"+num2);
num2+=5;
System.out.println("Preinc number:"+num2);
}
}
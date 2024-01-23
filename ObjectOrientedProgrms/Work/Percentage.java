public class Percentage{
	public static void main(String args[])
{
	int kannada=65;
	int english=60;
	int physics=65;
	int chemistry=67;
	int maths=51;
	int boilogy=69;
	int totalMarks=600;


 float	obtainedMarks=kannada+english+physics+chemistry+maths+boilogy;
	
		System.out.println("Obtained Marks is:"+obtainedMarks);
	
	float percentage=(obtainedMarks/totalMarks)*100;
	
		System.out.println("Percentage is:"+percentage);
	
if(0<percentage && percentage<35){
		System.out.println("Fail");
	}
	else if(35<percentage && percentage<50){	
		System.out.println("Second class");
	}
		else if(50<percentage && percentage<70){
			System.out.println("First class");
		}
			else if(70<percentage && percentage<90){
				System.out.println("Distinction");
			}	
				else{
					System.out.println("Rank holder");
				}
			}
		}
public class Application{
	
	static String name="Gate";
	static int version=2023;
	static int cost=1800;
	static boolean availability=true;
	static long loginId=93872;
	static int ApplicationStartDate=07;
	static String  ApplicationStartMonth="August";
	static int  ApplicationEndDate=15;
	static String  ApplicationEndMonth="september";
	static int examYear=2023;
	static int examDate=15;
	static String examMonth="Febraury";
	static int mockTestDate=20;
	static String mockTestMonth="December";
	static String gateFullForm="Graduate Aptitude Test in Engineering";
	static int gateStartedYear=1983;
	static String language="English";
	static String gatePurpose="Post-graduate engineering admissions, screening for entry-level engineering jobs.";
	static String gateExamDuration="Three hours";
		
		public static int display(){
			int version=2023;
		return version;
		
		}
		public static int display1(){
			int cost=1800;
			return cost;
			
		}
		public static String display2(){
			String name="Gate";
			return name;
			
		}
		public static boolean display3(){
			boolean availability=true;
			return availability;
			
		}
		public static void main(String args[]){
			System.out.println("Name of the application:"+Application.name);
			
			System.out.println("Application version:"+Application.display());
			
			System.out.println("Application cost:"+Application.display1());
			
			System.out.println("Application name:"+Application.display2());
			
			System.out.println("Application availability is there:"+Application.display3());
			
			System.out.println("Application login id is "+loginId);
			
			System.out.println("Application Start Date is "+ApplicationStartDate);
			
			System.out.println("Application Start Month is "+ApplicationStartMonth);
			
			System.out.println("Application End Date is "+ApplicationEndDate);
			
			System.out.println("Application End Month is "+ApplicationEndMonth);
			
			System.out.println("Exam Year is "+examYear);
			
			System.out.println("Exam Date is "+examDate);
			
			System.out.println("Exam Month is "+examMonth);
			
			System.out.println("Mock Test Date is "+mockTestDate);
			
			System.out.println("Mock Test Month is "+mockTestMonth);
			
			System.out.println("Gate Full Form is "+gateFullForm);
			
			System.out.println("Gate Started Year is "+gateStartedYear);
			
			System.out.println("Gate exam language is "+language);
			
			System.out.println("Gate  Purpose "+gatePurpose);
			
			System.out.println("Gate Exam Duration is "+gateExamDuration);
		}
		
		
		
	
} 
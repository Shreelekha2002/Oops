import java.io.*;
	public class DayIdentification{
		public static void main(String args[]){
			int day=5;
			String dayString;
			String dayType;
			
			switch(day){
				case 1: dayString="Sunday";
						break;
				case 2: dayString="Monday";
						break;
				case 3: dayString="Tuesday";
						break;
				case 4: dayString="Wednesday";
						break;
				case 5: dayString="Thursday";
						break;
				case 6: dayString="Friday";
						break;
				case 7: dayString="Saturday";
						break;
				default: dayString="Invalid day";	
				
		}
		switch(day){
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				dayType="weekday";
				break;
			case 1:
			case 7:
				dayType="weekends";	
				break;
			default:
				dayType="Inavalid datatype";
		}
		System.out.println(dayString + " is a " + dayType);	
		}	
	}

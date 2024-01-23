public class AnagramChecker{
	public static boolean areAnagrams(String string1, String string2){
		if(string1.length()!=string2.length())
		{
		return false;
		}
		
		int[] charCount=new int[256];
		
		for(int i=0; i<string1.length(); i++){
		charCount[string1.charAt(i)]++;
		
		}
		
		for(int i=0; i<string2.length(); i++){
			charCount[string2.charAt(i)]--;
			
		
		}
		
		for(int count:charCount){
		if(count!=0){
		return false;
		}
		}
		return true;
		
		}
		public static void main(String args[]){
			String input1String1="loco";
			String input1String2="cool";
			System.out.println(areAnagrams(input1String1, input1String2));
			
			String input2String1="poolo";
			String input2String2="loop";
			System.out.println(areAnagrams(input2String1, input2String2));
		}
	
}

public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String c = "he11o";
		Driver.removeVowels(s); 
		Driver.removeConsonants(s); 
		Driver.removeDigits(c);

	}
	
	//returns a new String with all of the vowels
	//removed form the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		 s = s .replaceAll("[aeiou]","");
		 System.out.println(s);
		return "s";
	}
	
	//returns a new String with all of the consonants
	//removed form the parameter String
	//"hello" -> eo
	static String removeConsonants(String s)
	{
		s = s .replaceAll("[bcdfghjklmnpqrst]","");
		System.out.println(s);
		return "s";
	}
		
	//returns a new String with all of the numbers
	//removed form the parameter String
	//"he11o" -> heo
	static String removeDigits(String c)
	{
		c = c .replaceAll("[0123456789]","");
		System.out.println(c);
		return "c";
	}
		
	//return the first occurence in s where c is found or -1 if 
	//it was not found - we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
}
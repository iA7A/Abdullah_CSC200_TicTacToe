
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "124";
		String c = "123";
		Driver.stringToInt(s);


	}


     //return the integer version of the char parameter
       static int charToInt(char c)
        {
	     return "0123456789".indexOf(c);
  }

       //Converts s, which is a string representation
       //of an int into an int representation
       //"124" -> 124
       static int stringToInt(String s)
{
    	   s = s = s;
    	   int i = Integer.valueOf(s);
    	   System.out.println(s);
		return i; 
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
package string;

import java.util.regex.Pattern;

public class SubStringToString {
	private String demoString = "hellohello";
	private int stringLength = demoString.length()/2;
	private String regex; 
	private Pattern match;
	
	
	public void processString()
	{
		if(stringLength<2)
		{
			System.out.println("["+demoString+"]" +" can create the whole String.");
		}
		else
		{
			for(int i=2; i <=stringLength; i++)
			{
				regex = demoString.substring(0, i);
				match = Pattern.compile(regex);
				if(demoString.contains(match.toString()))
				{
					if(demoString.equals(createNewString(match)))
					{
						System.out.println("["+ match +"]" + " can create the whole string");
						break;
					}
					else
					{
						System.out.println("Substring "+ match + " cannot form SuperString perfectly.");
					}
				}
			}
		}
	}
	
	public String createNewString(Pattern match2)
	{
		StringBuffer sb = new StringBuffer();
		
		for(int i= 0; i<stringLength; i ++ )
		{
			sb.append(match2);
			if(sb.length() == demoString.length())
				break;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SubStringToString obj = new SubStringToString();
		obj.processString();
	}
}

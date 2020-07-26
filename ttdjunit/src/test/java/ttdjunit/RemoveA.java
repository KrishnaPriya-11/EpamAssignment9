package ttdjunit;

public class RemoveA {

	public String remove(String string) {
		
		int length=string.length();
		if(length<1)
		{
			return string;
		}
		else if(length==1)
		{
			if(string.equals("A"))
				return "";
			else
				return string;
		}
		else
		{
			if(string.charAt(1)=='A')
			{
				string=string.substring(0,1)+string.substring(2,string.length());
			}
			if(string.charAt(0)=='A')
			{
				string=string.substring(1);
			}
			return string;
		}
		
	}

}

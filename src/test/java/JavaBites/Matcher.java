package JavaBites;

import java.util.regex.Pattern;

public class Matcher {
public static void main(String[] args) {
	Pattern pattern = Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
	java.util.regex.Matcher matcher = pattern.matcher("w3scfghools");
	boolean matchFound = matcher.find();
	if(matchFound)
	{
		System.out.println("Match Found");
	}
	else
	{
		System.out.println("Match not Found");
	}
	
}
}

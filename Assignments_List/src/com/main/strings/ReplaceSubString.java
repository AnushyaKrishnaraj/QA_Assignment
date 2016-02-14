package com.main.strings;
// find and replace a given substring
public class ReplaceSubString {
public String replace(String input,String subString,String replaced)
{
	String replacedString;
	replacedString=input.replaceAll(subString, replaced);
	System.out.println("THe replaced string is  " +replacedString);
	return replacedString;
}

}

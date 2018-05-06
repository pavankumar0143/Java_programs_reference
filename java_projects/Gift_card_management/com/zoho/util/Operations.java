package com.zoho.util;

public class Operations {
	
	private static int check(char c){
		if(c>='a' && c<='z'){
			return 0;
		}
		else if(c>='A' && c<='Z'){
			return 1;
		}
		else if(c>='0' && c<='9'){
			return 2;
		}
	return 3;
	}
	
	public static  String encodeString(String s){
		char arr[]=new char[27];
		char c='a';
		String res="";
		
		for(int i=0;i<26;i++){
			arr[i]=c;
			c++;
		}
		arr[26]='a';
		for(int i=0;i<s.length();i++){
			switch(check(s.charAt(i))){
			case 0:res=res+(arr[((s.charAt(i)-'a')%26)+1]);break;
			
			case 1:res=res+(Character.toUpperCase(arr[((Character.toLowerCase(s.charAt(i))-'a')%26)+1]));break;
			
			case 2: {
						if(s.charAt(i)=='9'){
							res=res+'0';
						}
						else{
							res=res+String.valueOf(s.charAt(i)-48+1);
							
						}
					}break;
			case 3:res=res+s.charAt(i);break;
			}
		}
		return res.trim();
	}
}

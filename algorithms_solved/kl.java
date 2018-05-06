package demo;


import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kl {
    public static String compare(String s1,String s2,int val){
        String small="";int a=0;
        if(s1.length()==s2.length())
        {if(val==1){
             a=s1.compareTo(s2);
            if(a<0){
                small=s1;
            }
            else
                small=s2;
        }
        else if(val==0){
        	 a=s1.compareTo(s2);
             if(a<0){
                 small=s2;
             }
             else
                 small=s1;
        }
        else if(val==1){
        if(s1.length()<s2.length())
        	small=s1;
        else
        	small=s2;
        
        }
        }
        else if(val==0){
                if(s1.length()<s2.length())
                	small=s2;
                else
                	small=s1;
                
            }
        
        return small;
    }
    public static void main(String[] args) {
		System.out.println(compare("Pacan","Pakan",0));
	}
}
    
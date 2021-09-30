package com.example.week3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        String s3 = new String("JAVA");

        System.out.printf("s1.equals(s2) : %b%n",s1.equals(s2));
        System.out.printf("s2.equals(s3) : %b%n",s2.equals(s3));
        System.out.printf("s1.equalsIgnoreCase(s3) : %b%n",s1.equalsIgnoreCase(s3));
        System.out.printf("s1 == s2: %b%n", s1==s2);

        String s4 = "Java";
        String s5 = "Java";
        System.out.printf("s4 == s5 : %b%n", s4==s5);
           System.out.printf("s1.compareTo(s2) : %b%n",s1.equalsIgnoreCase(s2));

       System.out.printf("s1.compareTo(s3) : %b%n",s1.equalsIgnoreCase(s3));
        System.out.printf("s3.compareTo(s1) : %b%n",s3.equalsIgnoreCase(s1));

        List<String> names = Arrays.asList("Mandeep", "Ramandeep","Rajpreet","Simran");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

       for (int i=1; i<=10; i++)
       {
           for (int j=1; j<=10; j++)
               System.out.printf("%4d", i*j);
           System.out.println();
       }
String longword = "Supercalifragilisticexpialidocious";
       System.out.printf("s1.subString(0,6) : \"%s\"%n", longword.substring(0,5));

       String csv = "Mandeep,kaur,Student";
       System.out.printf("First name : %s%n", csv.substring(0, csv.indexOf(',')));

      System.out.printf("longword.replaceAll(\"a\",\"ZZZZ\") : %s%n",
               longword.replaceAll("a","ZZZZ"));
    }
}

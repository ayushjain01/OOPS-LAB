import java.util.*;

public class Strings{

    public static void main(String[] args){

        String str1,str2,str3;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("""
                    Press
                    1.To Extract a portion of a string
                    2.Count the occurrences of a particular word
                    3.Replace a substring with a given string
                    4.Rearrange the string and write it in alphabetical order
                    5.Compare two strings ignoring case
                    6.Concatenate two strings
                    7.Exit
                    ...""");
            int choice,n,m;
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter a String:");
                    str1 = sc.nextLine();
                    System.out.print("Enter the starting position:");
                    n = sc.nextInt();
                    System.out.print("Enter the no of characters:");
                    m = sc.nextInt();
                    str2 = str1.substring(n-1,m+n-1);
                    System.out.println("The extracted string is "+ str2);
                    break;

                case 2:
                    System.out.print("Enter the String:");
                    str1 = sc.nextLine();
                    System.out.print("Enter the Word:");
                    str2 = sc.next();
                    String[] strs = str1.split(" ");
                    int counter =0;
                    int len = strs.length;
                    for(int i=0;i<len;i++){
                        if(strs[i].equals(str2))
                            counter++;
                    }
                    System.out.println("The no of occurrences of the word " + str2 +"in the string"+
                            str1 +" are:" + counter);
                    break;

                case 3:
                    System.out.print("Enter the String:");
                    str1 = sc.nextLine();
                    System.out.print("Enter the substring you want to replace:");
                    str2 = sc.next();
                    System.out.print("Enter the substring with which you want to replace it:");
                    str3 = sc.next();
                    System.out.println("The string after replacement is "+str1.replace(str2,str3));
                    break;

                case 4:
                    System.out.println("Enter the String");
                    str1 = sc.nextLine();
                    str2 = str1.toLowerCase();
                    char[] sortString = str2.toCharArray();
                    Arrays.sort(sortString);
                    str3 =new String(sortString);
                    System.out.println("The string after sorting is "+str3);
                    break;

                case 5:
                    System.out.println("Enter string 1");
                    str1 = sc.nextLine();
                    System.out.println("Enter string 2");
                    str2 = sc.nextLine();

                    boolean cmp = str2.equalsIgnoreCase(str1);
                    if(cmp){
                        System.out.println("The two strings are equal");
                    }
                    else{
                        System.out.println("The two strings are not equal");
                    }
                    break;

                case 6:
                    System.out.println("Enter string 1");
                    str1 = sc.nextLine();
                    System.out.println("Enter string 2");
                    str2 = sc.nextLine();
                    str3 = str1.concat(str2);
                    System.out.println("The string after concatenation is: "+ str3);
                    break;

                case 7:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}
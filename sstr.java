import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number of entries:");
        String str = obj.nextLine();
        int strLength = str.length();
        System.out.println("item to be searched for :");
        String str1 = obj.nextLine();
   System.out.println("Index value is "+str.indexOf(str1));
    }
}

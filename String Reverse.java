import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String nA="";
        char ch;
        for(int i = 0; i < A.length(); i++){
            ch= A.charAt(i);
            nA=ch+nA;
        }
        if(A.equals(nA)){
            System.out.println("Yes");
        }
        else if(!(A.equals(nA))){
            System.out.println("No");
        }
    }
    
}

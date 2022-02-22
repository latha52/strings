//string copy


import java.io.*;
class strcpy
{
    public static void main(String[] arg)throws IOException
    {
        int n,i;
        String str1 ,str2 ;
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
          System.out.println("enter a string");
    
         str1 = br.readLine();
         str2 = str1;
       // str2 = new String(str1);
        System.out.println("new str2 is "+str2);
    
    }
}
import java.io.*;
class strrev
{
    public static void main(String[] arg)throws IOException
    {
        int i,n;
        String str1,str2=""  ;
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
          System.out.println("enter a string");
    
         str1 = br.readLine();

       // System.out.println("reverse string is");
        for(i=str1.length()-1; i>=0; i--)
        {
            str2 = str2+str1.charAt(i);
        }
        System.out.println("the reverse string is "+str2) ;   
        System.out.println(str1);
       // if(str1 == str2)
       if(str1.equals(str2))
        System.out.println("string is polydrem");
        else 
        System.out.println("string is not polyndrem");
    }
}
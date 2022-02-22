// to print   charcters ,letters, special characters in a string

import java.io.*;
class strbr
{
    public static void main(String[] arg)throws IOException
    {
        int n,i;
        String str1  ;
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
          System.out.println("enter a string");
    
         str1 = br.readLine();
         
         
        for(i=0; i<str1.length(); i++)
        {
            
            if(str1.charAt(i) == 65||str1.charAt(i) == 69||str1.charAt(i) == 73||str1.chatAt(i) ==79 ||str1.charAt(i) == 85  )
                n++;
             
                
        }
        int x = str1.length()-n;
        System.out.println("no.of ovewls "+n+"\tno of consonents "+x);
        
      
       // System.out.println("no.of charcters is "+n+"no.of letters:"+m+"no. of special characts "+x);
    }
}

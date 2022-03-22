import java.util.Scanner;

public class RomanToInt {

public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String st=sc.next();                  
        int len=st.length();
        int sum=roman_int(st.charAt(0));

if(len==2)         
{
   if(roman_int(st.charAt(1))>sum)
      sum=roman_int(st.charAt(1))-sum;
   else
      sum=sum+roman_int(st.charAt(1));

}
else {                  
    int i=0;
            sum=0;
       
while(i<len-1)       
{    
    if( roman_int(st.charAt(i))>= roman_int(st.charAt(i+1)))
  {
        sum+=roman_int(st.charAt(i));
        i++;
  }

    else
          {      
             sum+=roman_int(st.charAt(i+1))-roman_int(st.charAt(i));
             i+=2;
           }
   
}
    if(i==len-1)              
       { 
           sum+=roman_int(st.charAt(i));       
       }
}


    System.out.println(Math.abs(sum));
}

static int roman_int(char ch) {

            int h = 0;
            switch(ch) {
            case 'I':h=1 ; 
            break;
            case 'V':h=5 ;
            break;
            case 'X':h=10;
            break;
            case 'L':h=50;
            break;
            case 'C':h=100;
            break;
            case 'D': h=500;
            break;
            case 'M': h=1000; 
            break;
            default: System.out.println("invalid input");
         
       }
return h;
   }

}
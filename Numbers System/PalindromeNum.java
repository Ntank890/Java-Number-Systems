class PalindromeNum{
  public static void main(String[]args){
     int a=121;
     int temp=a;
     int rev=0;        // 1 12 121
     while(temp!=0){
       rev*=10;       // increase the number 
       rev+=temp%10;  //add last digit to rev num
       temp/=10;      //destroy temp num until 0
     }
     if(a==rev){
       System.out.println(a +" is a palindrome number");
     }
   }
 }
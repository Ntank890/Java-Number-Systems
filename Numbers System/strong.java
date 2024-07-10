class strong{
   public static void main(String[]args){
     int n=145;
     int temp=n;
     int sum=0;
     while(temp!=0){
         int fact=1;
     for(int i=1;i<=temp%10;i++){
         fact*=i;
        }
        sum+=fact;
       temp/=10;
    }
 
    if(sum==n)
     System.out.println("the given number is factorial number");
    }
   }
class Armstrong{
    public static void main(String[]args){
      int n=153;
      int temp=n;
      int length=0;
      while(temp!=0){
        length++;
        temp/=10;
       }
      temp=n;
      int sum=0;
      while(temp!=0){
       sum+=Math.pow(temp%10,length);
       temp/=10;
      }
     if(sum==n){
       System.out.println("the given number is armstrong number");
      }
    }
  }
        
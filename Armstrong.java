class Armstrong {
public static boolean isArmstrong(int num){
    int sum=0;
    int n=num;
    while(n>0){
        int r=n%10;
        sum+=(r*r*r);
        n=n/10;
        
    }
    return sum==num;
}
    
    public static void main(String[] args) {
     System.out.println(isArmstrong(407));
      
    }
}
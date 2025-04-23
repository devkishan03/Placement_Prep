import java.lang.*;
import java.util.ArrayList;
public class NumbersSer {

    public static boolean isPalindrome(int n){
         int num=n;
         int rnum=0;
         while(num>0){
            int s=num%10;
            rnum=(rnum*10)+s;
            num=num/10;
        }
         return rnum==n;
    }

    public static void findPalindromeRange(int from ,int to){

        for(int i=from;i<=to;i++){
            System.out.println(i+" isPalindrome:"+isPalindrome(i));
        }

    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2||n==3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for(int i=4;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void findPrimeRange(int from,int to){
        for(int i=from;i<=to;i++){
            System.out.println(i+" is Prime:"+isPrime(i));
        }
    }
   
    public static boolean isArmstrong(int n){
        int num=n;
        int qnum=0;
        while(num>0){
           int s=num%10;
           qnum+=s*s*s;
           num/=10;
        }
        return qnum==n;
    }
    public static void findArmstrongRange(int from,int to){
        int count=0;
        for(int i=from;i<=to;i++){
            boolean flags=isArmstrong(i);
            if(flags){
                count++;
            }
            System.out.println(i+" is Armstrong num:"+flags);
        }
        System.out.println("total numbers:"+count);
    }

    public static boolean isPerfectNumber(int n){
        int sum=1;
        if(n<4){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void findPerfectRange(int from,int to){
        for(int i=from;i<=to;i++){
            System.out.println(i+" is Perfect:"+isPerfectNumber(i));
        }
    }

    public static String oddOrEven(int n){
        return n%2==0?"even":"odd";
    }
    public static String positiveOrNegative(int n){
        return n<0?"negative":"positive";
    }
    public static int sumOfNaturalNum(int n){
        return (n*(n+1))/2;
    }
    public static int sumOfAPSeries(int start,int diff,int n){
        if (n<=0) {
            return 0;
        }
        int sum=start;
        int a=start;
        for(int i=0;i<n-1;i++){
            a+=diff;
            sum+=a;
        }
        return sum;

    }

    public static double sumOfGPSeries(double start,double diff,double n){
        if(n<=0){
            return 0;
        }
        double sum=start;
        double a=start;
        for(int i=0;i<n-1;i++){
            a*=diff;
            sum+=a;
        }
        return sum;
    }

    public static double findGreatest(double a,double b){
        return a>b?a:b;
    }
    public static double findGreatest2(double a,double b,double c){
        return a>b&&a>c?a:b>c?b:c;
    }
    
    public static int reverseDigit(int n){
        int revDigit=0;
        while(n>0){
            int d=n%10;
            revDigit=revDigit*10+d;
            n=n/10;
        }
        return revDigit;
    }

    public static void minMaxDigit(int n){
        int min=n%10;
        int max=n%10;
        n=n/10;
        while(n>0){
            int d=n%10;
            if(d>max){
                max=d;
            }
            if(d<min){
                min=d;
            }
            n=n/10;
        }
        System.out.println("Higher digit:"+max+"\n"+"Lower digit:"+min);
    }
    
    public static void printFibonacci(int n){
        int a=0;
        int b=1;
        if(n<=0){
            return;
        }
        if(n==1){
            System.out.print(a);
        }
        if(n==2||n>2){
            System.out.print(a+" "+b+" ");
        }
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();  
    }

    public static int factorial(int n){
        
        if(n>0){
           return n*factorial(n-1);
        }
        return 1;
    }
    
    public static double powerOfNum(int x,int n){
        return Math.pow(x, n);
    }

    public static void factorsOfNum(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void primeFactor(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0){
                boolean flag=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag=false;
                    }
                }
                if(flag){
                    System.out.print(i+" ");
                }
            }

        }
        System.out.println();
    }

    public static boolean isStrong(int n){
        if(n<1){
            return false;
        }
        if(n==1||n==2){
            return true;
        }
        int num=n;
        int sum=0;
        while(num>0){
            int r=num%10;
            for(int i=r-1;i>=1;i--){
                r=r*i;
            }
            sum+=r;
            num=num/10;
        }
        return sum==n;
    }

    public static void findStrongRange(int start,int end){
         for(int i=start;i<=end;i++){
            System.out.println(i+" is Strong number:"+isStrong(i));
         }
    }

    public static boolean isAutomorphic(int n){
        int num=n*n;
        while(n>0){
            if(num%10!=n%10){
                return false; 
            }
            n/=10;
            num/=10;
        }
        return true;
    }
    public static int GCDofTwoNumbers(int n1,int n2){
        if(n1==0){
            return n2;
        }
        if(n2==0){
            return n1;
        }
        int small=n1>n2?n2:n1;
        for(int i=small;i>=1;i--){
            if(n1%i==0&&n2%i==0){
                return i;
            }
        }
        return 1;
    }
    public static int LCMofTwoNumbers(int n1,int n2){
        if(n1==0||n2==0){
            return 0;
        }
        return (n1*n2)/GCDofTwoNumbers(n1, n2);
    }

    public static boolean isHarsedNumber(int n){
        if(n==0){
            return false;
        }
        n=Math.abs(n);
        int num=n;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum+=r;
            num/=10;
        }
        return n%sum==0;
    }

    public static boolean isAbundant(int n){
        if(n==0||n==1){
            return false;
        }
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
       // System.out.println(sum);
        return sum>n;
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int sumOfNumbersRange(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        return sum;
    }

    public static void permutationAndCombination(int N,int r){
            if(N-r==0){
                return;
            }
            int fact=1;
            for(int i=1;i<=N;i++){
              fact*=i;
            }
            System.out.println(fact/(N-r));
    }

    public static void replaceWithOne(int n){
        if(n==0){
            System.out.println(1);
        }
        int ans=0;
        int temp=1;
        while(n>0){
            int num=n%10;
            if(num==0){
                num=1;
            }
            ans=temp*num+ans;
            temp=temp*10;
            n=n/10;

        }
       System.out.println(ans);
    }

    public static boolean isSumOfTwoPrime(int n){
        if(n<4){
            return false;
        }
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=2;i<n;i++){
            boolean flag=true;
            if(i==2||i==3){
                flag=true;
            }
            else if(i%2==0||i%3==0){
                flag=false;
                continue;
            }
            for(int j=2;j*j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
              arr.add(i);
            }
            
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==n){
                    return true;
                }
            }
        }
      return false;
    }

    public static void areaofCircle(int r){
        if(r<1){
            return;
        }
        System.out.printf("%.1f",Math.PI*r*r);
    }


    public static void main(String args[]){
         // System.out.println(isPalindrome(5445));
         // findPalindromeRange(0, 100);
         // findPrimeRange(0, 100);

         //System.out.println(isArmstrong(153));
         //findArmstrongRange(2,1000);
        // findPerfectRange(0, 100);
       // System.out.println(sumOfNaturalNum(10));
       //System.out.println(sumOfGPSeries(1, 0.5, 3));
       //System.out.println(reverseDigit(123));
       //minMaxDigit(9812);
      // printFibonacci(10);
      //System.out.println(factorial(6));
      //System.out.println(powerOfNum(2, 5));
      //factorsOfNum(15);
      //primeFactor(35);
      //System.out.println(isStrong(143));
      //findStrongRange(0, 500);
    // System.out.println(isAutomorphic(76));
   // System.out.println(GCDofTwoNumbers(24, 12));
     //System.out.println(isHarsedNumber(-3));
    // System.out.println(isAbundant(18));
   // System.out.println(sumOfDigits(12345));
   //permutationAndCombination(5, 3);
       // replaceWithOne(1102302);
      // System.out.println(isSumOfTwoPrime(74));
      areaofCircle(5);




    }
}

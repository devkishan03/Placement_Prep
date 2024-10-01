
class Automorphic {

public static boolean isAutomorphic(int n){
    int num=n*n;
    String str=String.valueOf(n);
    String str2=String.valueOf(num);
    int d=str.length();
    return str.equals(str2.substring(str2.length()-d));
}
  
    public static void main(String[] args) {
   System.out.println(isAutomorphic(25));
    }
}
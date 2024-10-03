
public class Passwordvalidate {
    public static boolean isValid(String str) {
        String rgx = "^(?=\\S+$)(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&^*~]).{8,20}$";
        return str.matches(rgx);
    }

    public static void main(String[] args) {
        String pass = "K1ishan!jhfg";
        System.out.println(isValid(pass));
    }
}

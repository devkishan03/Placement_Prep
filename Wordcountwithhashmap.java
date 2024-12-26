import java.util.HashMap;

public class Wordcountwithhashmap {

    public static void countWords(String str){
          String str2[]=str.split(" ");
         HashMap<String ,Integer> hsmp=new HashMap<>();

         for(String s:str2){
            hsmp.put(s, hsmp.getOrDefault(s,0)+1);
         }
         
         for(String s:hsmp.keySet()){
            System.out.println(s+" : "+hsmp.get(s));
         }
    }



    public static void main(String []args){
        String str="hello my name is kishan singh this is test series for check the contineous common word how many times accours this this this word";
       countWords(str);
    }
}

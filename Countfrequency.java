public class Countfrequency {
public static void countWordFreq(String str[]){
    String unique[]=new String[str.length];
    boolean value[]=new boolean[str.length];
    int totalcount[]=new int[str.length];
        for(int i=0;i<str.length;i++){
            int count=1;
             for(int j=i+1;j<str.length;j++){
                if(value[j]!=true){
                    if(str[i].toLowerCase().equals(str[j].toLowerCase())){
                       value[j]=true;
                       count++;
                    }else{
                        value[j]=false;
                    }
               }
             }
             totalcount[i]=count;   
        }
        int index=0;
        for(int i=0;i<str.length;i++){
            if(value[i]!=true){
                unique[index++]=str[i];
            }
        }
        System.out.println("words count:");
        for(int i=0;i<str.length;i++){
            if(unique[i]!=null)
             System.out.println(unique[i]+": "+totalcount[i]);
        }

}



    public static void main(String []args){
       String str="hi my name is hi my name kishan singh my";
       String str2[]=str.split(" ");
       countWordFreq(str2);
    }
}

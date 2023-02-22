import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        
        HashMap<String,String>countries=new HashMap<>();

        //adding values to hash:
        countries.put("pakistan", "20cr");
        countries.put("Indaia", "30cr");
        countries.put("USA", "30cr");
        countries.put("Turkey", "12cr");
        // //  access the key-values:
        // System.out.println(countries.get("pakistan"));
        // System.out.println(countries.get("USA"));
        //  //seacrching for key:
        // if(countries.containsKey("indonasia")){
        //     System.out.println("This key is present ");
        // }else{
        //     System.out.println("this key is not present");
        // }

        // for(Map.Entry<String,String> values:countries.entrySet()){
        //     System.out.println(values.getKey()+"  "+values.getValue());

        // }
countries.remove("USA");
        Set<String>keys=countries.keySet();
        for(String values:keys){
         System.out.println(values+"  "+countries.get(values));   
        }
    }
}

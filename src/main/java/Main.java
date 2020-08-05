import model.Prop;
import service.Comparitor;

import java.util.HashSet;
import java.util.Set;

public class Main {




    public static  void  main(String args[]){

        Prop comp1= new Prop("a");
        Prop comp2= new Prop("b");



        System.out.println("\nkeys in First not in second");
        for(Object k:Comparitor.getSetDifference(comp1.getAllKeys(),comp2.getAllKeys())){
            String key = (String)k;
            System.out.println(key);
        }


        System.out.println("\nkeys in second not in first");
        for(Object k: Comparitor.getSetDifference(comp2.getAllKeys(),comp1.getAllKeys())){
            String key = (String)k;
            System.out.println(key);
        }

        System.out.println("\nCommon keys and values");
        for(Object k: Comparitor.getSetCommon(comp2.getAllKeys(),comp1.getAllKeys())){
            String key = (String)k;
            if(comp1.getPropertyValue(key).equals(comp2.getPropertyValue(key))){
                System.out.println(key +" = "+comp1.getPropertyValue(key));
            }
            else{
                System.out.println(key +" = "+comp1.getPropertyValue(key) +" , "+key+" = "+comp2.getPropertyValue(key) );
            }

        }


    }




}



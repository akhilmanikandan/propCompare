package service;

import java.util.HashSet;
import java.util.Set;

public class Comparitor {

    public static <T> Set<T> getSetDifference(final Set<T> setOne, final Set<T> setTwo) {
        Set<T> result = new HashSet<T>(setOne);
        result.removeIf(setTwo::contains);
        return result;
    }

    public  static  <T> Set<T> getSetCommon(final Set<T> setOne, final Set<T> setTwo){

        Set<T> result = new HashSet<T>(setOne);
        result.retainAll(setTwo);
        return result;
    }




}

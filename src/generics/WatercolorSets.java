package generics;

import generics.watercolors.Watercolors;
import util.Sets;

import java.util.EnumSet;
import java.util.Set;

/**
 * FileName: WatercolorSets.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-9
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAM_BLUE_HUE, Watercolors.BURNT_UMBER);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);


        System.out.println(Sets.union(set1, set2));
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println(subset);

        System.out.println(Sets.difference(set1, subset));
        System.out.println(Sets.difference(set2, subset));

        System.out.println(Sets.complement(set1, set2));



    }
}

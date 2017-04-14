package generics;

import java.util.*;

/**
 * FileName: LostInformation.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-17
 */
public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long, Double> particle = new Particle<>();

        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
    }


}

class Frob {

}

class Fnorkle {

}

class Quark<Q> {

}

class Particle<POSITION, MOMENTUM> {

}

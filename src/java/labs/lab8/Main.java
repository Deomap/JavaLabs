package java.labs.lab8;

import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Pet> hm = new HashMap<>();

        hm.put("p1", new Cat("Jack"));
        hm.put("p2", new Dog("Doge"));
        hm.put("p3", new Owl("Owl"));
        hm.put("p4", new Cat("Puh"));

        System.out.println(hm.get("p1"));
        System.out.println(hm.get("p2"));
        System.out.println(hm.get("p3"));
        System.out.println(hm.get("p4"));

        hm.put("p5", new Owl("Owl"));

        int t = hm.size();

        Random r = new Random();
        int rn;
        for(int i = 0; i < 20; i++){
            rn = r.nextInt(20);
            hm.put(Integer.toString(rn), new Dog(Integer.toString(rn)));
        }

        System.out.println(hm.values());
        System.out.println("Повторов: " + (20 + t - hm.size()));
    }
}

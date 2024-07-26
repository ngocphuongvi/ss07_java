package Exercise01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Tao list so nguyen 10 phan tu
        List<Integer> intergerList = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            intergerList.add(random.nextInt(1000));
        }
        System.out.println("List so nguyen: "+intergerList);
        int max= Collections.max(intergerList);
        System.out.println("Max: "+max);
    }
}

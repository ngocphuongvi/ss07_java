package Exercise03;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Tao danh sach so nguyen
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        final int[] sum= {0};//Su dung mang de chua gia tri tong vi cac bien trong bieu thuc lambda phai la final hoac la effectively final
        integers.forEach(i->{sum[0]+=i;});// bieu thuc lambda the hien 1 doi tuong `consumer` trong java

        System.out.println("Tong cac phan tu trong danh sach la: "+sum[0]);

    }
}

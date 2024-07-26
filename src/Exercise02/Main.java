package Exercise02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello World! We are from VietNam!";

        //chia chuoi cho truoc thanh cac chuoi con va them vao danh sach
        String[] words = inputString.split(" ");
        List<String> stringList=new ArrayList<>(Arrays.asList(words));

        //in ra cac chuoi con co do dai lon hon 3
        System.out.println("Cac chuoi co do dai lon hon 3 ky tu: ");
        for (String string : stringList) {
            if(string.length()>3){
                System.out.println(string);
            }
        }

    }
}

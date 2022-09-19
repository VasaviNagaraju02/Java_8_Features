package javaeightfeatures;


import java.util.Arrays;

public class For_Each {
    public static void main(String[] args) {
        String[] name = {"vasu","vasavi","kashyap","nagaraju"};
        Arrays.stream(name).forEach(System.out::println);
    }
}
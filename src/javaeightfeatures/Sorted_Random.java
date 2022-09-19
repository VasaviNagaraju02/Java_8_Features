package javaeightfeatures;

import java.util.Random;

class Sorted_Random {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);


    }
}

package StramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        nums.stream().map(e -> Integer.toBinaryString(e) + " ").forEach(print);
        System.out.println("");
        nums.stream().map(e -> Integer.toBinaryString(e) + " ")
                .map(e -> new StringBuilder(e).reverse().toString())
                .forEach(print);

        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        System.out.println("");
        nums.stream().map(Integer::toBinaryString)
                .map(inverter)
                .map(e -> Integer.parseInt(e, 2) + " ")
                .forEach(print);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        list.stream().forEach(System.out::println); //forEach
        List<String> filteredList = list.stream()
                                        .filter(s -> s.startsWith("A"))
                                        .collect(Collectors.toList());
        System.out.println(filteredList);//
        List<Integer> lengths = list.stream()
                                    .map(String::length)
                                    .collect(Collector.toList());


    }
}

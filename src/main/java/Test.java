import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    // Remove even numbers from list.
    public static <T extends Number> List<T> removeEvenNumbers(List<T> numbers) {
        return numbers.stream().filter((n) -> n.longValue() % 2 != 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        integers.add(7);
//        integers.add(5);
//        integers.add(3);
//        integers.add(6);
//        System.out.println(removeEvenNumbers(integers));

        String samuray = "Baeldung helps \n \n developers \n explore Java";
        List<String> collect = samuray.lines().collect(Collectors.toList());
        System.out.println(collect);
        String strip = samuray.strip();
        System.out.println(strip);
    }
}



///api/v1
//
///books
//
//CRUD
//
//PostMapping -> /api/v1/books
//GetMapping -> /api/v1/books
//GetMapping by id -> /api/v1/books/{id}
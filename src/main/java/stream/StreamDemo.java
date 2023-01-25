package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("200"));
        list.add(new Employee("120"));
        list.add(new Employee("70"));
        list.add(new Employee("70"));
        list.add(new Employee("1000"));

        Integer reduce = list.stream().
                map(Employee::getSalary)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(reduce);
        System.out.println();

        Set<Integer> collect = list.stream().map(Employee::getSalary)
                .map(Integer::parseInt)
                .filter(value -> value > 100)
                .collect(Collectors.toSet());
        collect.stream().forEach(System.out::println);
        System.out.println("///////");
        System.out.println();


        Set<Integer> collect1 =
                list.parallelStream().map(Employee::getSalary)
                .map(Integer::parseInt)
                .filter(value -> value > 100)
                .collect(Collectors.toSet());

        int i = 200;
        byte a = (byte) i;
        System.out.println(a + "bbbbbbbbbbbbbikik");

        collect.stream().forEach(System.out::println);
        System.out.println("///////");
        System.out.println();

        Stream<Integer> stream = list.stream()
                .map(emp -> {
//                    System.out.println(emp.getSalary());
                    return emp.getSalary();
                })
                .map(Integer::parseInt)
//                .filter(value -> value > 100);
                .sorted();

        System.out.println(stream.findFirst());
        System.out.println("-----------");
        System.out.println(stream.collect(Collectors.toList()));

    }

}

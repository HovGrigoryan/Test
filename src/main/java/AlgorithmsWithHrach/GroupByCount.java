package AlgorithmsWithHrach;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByCount {


    public static Map<String, Integer> calculate(List<User> users) {

        Map<String, Integer> countriesCount = new HashMap<>();

        for (User user : users) {
            String country = user.getCountry();
//            if (countriesCount.containsKey(country)) {
//                countriesCount.put(country, countriesCount.get(country) + 1);
//            } else {
//                countriesCount.put(country, 1);
//            }

//            countriesCount.computeIfPresent(country, (key, value) -> ++value);
//            countriesCount.putIfAbsent(country, 1);
            countriesCount.compute(country, (key, value) -> value != null ? ++value : 1);
        }


        return countriesCount;
    }

    public static Map<String, Integer> calculateByStream(List<User> users) {

//        return users.stream().map(User::getCountry).collect(Collectors.groupingBy(Function.identity(), Coll));
        return null;
    }


    public static void main(String[] args) {
        Date date = new Date();
        User arm = new User(1, "", "Arm", date);
        User arm2 = new User(1, "", "Arm", date);
        User arm3 = new User(1, "", "Arm", new Date());
        User rus = new User(1, "", "Rus", new Date());
        User rus1 = new User(1, "", "Rus", new Date());
        List<User> users = Arrays.asList(arm, arm2, arm3, rus, rus1);
        Map<String, Integer> calculate = calculate(users);
        System.out.println(calculate);
//        System.out.println(arm.equals(arm2));
//        System.out.println(arm==arm2);
//        Map<User,String> map = new HashMap<>();
//        map.put(arm,"Poxos");
//        map.put(arm2,"Vaxo");
//        System.out.println(map);
    }

}

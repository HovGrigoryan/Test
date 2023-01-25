package interviewKaren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Customer {

    private String name;
    private String surName;
    private Integer age;

    public Customer(String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(surName, customer.surName) && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Method should calculate
     * 1.Result String should be formatted "name + surname"
     * 2.Result list should be sorted alphabetical
     * 3.Customers from list  with age >= minAge
     *
     * @param customerList
     * @param minAge
     * @return result list
     */


    public static List<String> getCustomers(List<Customer> customerList, Integer minAge) {
        //TODO Implementation
        List<String> lst = new ArrayList<String>();

//        for (Customer customer : customerList) {
//            if (customer.getAge() >= minAge) {
//                lst.add(customer.getName() + " " + customer.getName());
//            }
//            Collections.sort(lst);
//        }
        customerList.stream().filter(c -> c.getAge() >= minAge).map(c -> c.getName() + " " + c.getSurName()).sorted().forEach(lst::add);
        System.out.println(lst);
        return lst;
    }

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Artur", "Sargsyan", 20);
        Customer customer1 = new Customer("Vardan", "Madatyan", 19);
        Customer customer2 = new Customer("Bagrat", "Madatyan", 19);
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        getCustomers(customerList, 18);
    }
}

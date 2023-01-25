package AlgorithmsWithHrach;

import java.util.Date;
import java.util.Objects;

public final class User {

    private final int id;
    private final String name;
    private final String country;
    private final Date birthDay;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Date getBirthDay() {
        return new Date(birthDay.getTime());
    }

    public User(final int id, final String name, final String country, final Date birthDay) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.birthDay = new Date(birthDay.getTime());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(country, user.country) && Objects.equals(birthDay, user.birthDay);
    }
    //    public static void main(String[] args) {
//        Date date = new Date(2000, 01, 22);
//        User user = new User(1, "Poxos", "Anglia", date);
//        date.setMonth(5);
//        System.out.println(user.birthDay.getMonth());
//    }
}

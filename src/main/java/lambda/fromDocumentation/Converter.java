package lambda.fromDocumentation;

class Person {
    String firstName;
    String lastName;

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
//        P create();
    }
    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }


    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
            Person person = personFactory.create("Peter", "Parker");
        final int  num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        stringConverter.convert(2);

    }




}



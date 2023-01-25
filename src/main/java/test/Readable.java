package test;

import java.util.Locale;
import java.util.Optional;

public interface Readable {

    public void readBook();

    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook() {
    }
}

class Ebook extends Book {

    @Override
    public void readBook() {

    }

    public void setBookMark() {

    }

    public static void main(String[] args) throws NotFoundExc {
        Book book = new Ebook();
        book.readBook();
        Optional<String> optional = getOptionalString();
        System.out.println(optional.
                map(s -> s.toUpperCase(Locale.ROOT)).orElseThrow(()-> new NotFoundExc()));

    }

    private static Optional<String> getOptionalString() {
        return Optional.ofNullable(null );
    }

}





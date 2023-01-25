package designPattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookType {

    private final String type;
    private final String distributor;
    private final String otherData;
}

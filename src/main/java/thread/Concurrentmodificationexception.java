package thread;

import java.util.*;

public class Concurrentmodificationexception {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3))
                list.remove(value); //ConcurrentModificationException
//                it.remove(); //Will work normally
        }

    }

}
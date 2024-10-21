package hw241024;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TaskIterator {

    //    2. Имеется заданный список имен студентов:
//    List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
//    С помощью итератора:
//    a). Вывести имена, состоящие из 4 букв
//    b). Удалить из списка null и пустые строки.

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

        Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name != null && name.length() == 4) {
                System.out.println(name);
            }
        }

        iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name == null || name.isEmpty()) {
                iterator.remove();
            }
        }
        System.out.println(names);


    }

}



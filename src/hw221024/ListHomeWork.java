package hw221024;


import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class ListHomeWork {

    public static void main(String[] args) {

//        У вас есть список значений String, вы должны вернуть список со всеми
// значениями String более трех символов

        List<String> list = List.of("One", "Two", "Three", "Y", "No");

        List<String> result = new ArrayList<>();

        for (String word : list) {
            if (word.length() > 3) {
                result.add(word);

            }
        }
        System.out.println(result);


        //    /У вас есть список значений Integer, вы должны вернуть список, содержащий только нечетные числа

        Random random = new Random();


        List<Integer> list2 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list2.add(random.nextInt(100));
        }

        for (Integer integer : list2) {
            if (integer % 2 != 0) {
                result2.add(integer);
            }

        }
        System.out.println();
        System.out.println(list2);

        System.out.println(result2);


        //У вас есть список значений String, вы должны вернуть список этих значений без каких-либо дубликатов

        List<String> list3 = List.of("One", "Two", "Three", "Y", "No", "One", "Two", "Three", "Y", "No");

        List<String> result3 = new ArrayList<>();
        for (String word2 : list3) {
            if (!result3.contains(word2)) {
                result3.add(word2);

            }
        }
        System.out.println();

        System.out.println(result3);

        //У вас есть список значений String, вы должны вернуть одну строку, которая
// представляет собой конкатенацию всех значений.

        List<String> list4 = List.of("One", "Two", "Three", "Y", "No");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("One ");
        stringBuilder.append("Two ");
        stringBuilder.append("Three ");
        stringBuilder.append("Y ");
        stringBuilder.append("No ");

        String result4 = stringBuilder.toString();
        System.out.println(result4);

        String[] string1 = {"One", "Two", "Three", "Y", "No"};
        String string2 = String.join(" ", string1);
        System.out.println(string2);

        StringJoiner blaBlabla = new StringJoiner(", ");
        blaBlabla.add("One");
        blaBlabla.add("Two");
        blaBlabla.add("Three");
        blaBlabla.add("Yes");
        blaBlabla.add("No");

        System.out.println(blaBlabla);


        List<String> list5 = List.of("One", "Two", "Three", "Yes", "No");
        System.out.println(((("One, ".concat("Two, ")).concat("Three, ")).concat("Yes, ")).concat("No."));


//У вас есть список значений Integer, вы должны вернуть их сумму

        List<Integer> list6 = List.of(1,2,3,4,5,6,7,8,9);
        int res = 0;
        for( int i : list6) {
            res = i+res;
        }

        System.out.println(res);

        //У вас есть список значений Integer, вы должны вернуть их максимум

        List<Integer> list7 = List.of(1,2,3,4,5,6,7,8,9);
        int max = list7.get(0);
        for (int i = 0; i < list7.size(); i++) {
            if (list7.get(i)>max){
                max = list7.get(i);
            }
        }

        System.out.println(max);


        //У вас есть список String, вы должны вернуть максимальную длину String

        List<String> list8 = List.of("I", "am", "tired", "doing", "my", "Java", "Homework");
        int maxLeghth = 0;
        for (String str : list8){
            if (str.length()>maxLeghth) {
                maxLeghth = str.length();
            }
        }
        System.out.println(maxLeghth);


        //Напишите метод для объединения двух списков в один общий ArrayList

        List<String> list9 = List.of("I", "am", "tired", "doing", "my", "Java", "Homework");
        List<String> list10 = List.of("Who", "am", "I", "to", "be", "tired", "?");

        List<String> united = uniteLists(list9, list10);
        System.out.println(united);
    }
    private static List<String> uniteLists(List<String> a, List<String> b) {
        List<String> united = new ArrayList<>(a);
        united.addAll(b);
        return united;
    };


}

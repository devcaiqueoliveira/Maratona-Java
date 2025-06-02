package academy.devedojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("--------------");

        Integer[] numbersToArray = new Integer[3];
        numbersToArray[0] = 1;
        numbersToArray[1] = 2;
        numbersToArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numbersToArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numbersToArray));
        System.out.println(arrayToList);

        System.out.println("-----------");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersToArray));
        numbersList.add(15);
        System.out.println(numbersList);

        List<String> strings = Arrays.asList("1", "2");
    }
}

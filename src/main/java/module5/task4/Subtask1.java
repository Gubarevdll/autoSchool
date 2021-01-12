package module5.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Subtask1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
                "a", "s", "d", "f", "g", "h", "j", "k", "l", "", "z", "x", "c", "v", "b",
                "n", "m", "", "", "", "", "", "", "", "", "qw", "we", "er", "rt", "ty",
                "yu", "ui", "io", "op", "as", "sd", "df", "fg", "gh", "hj", "jk", "js", "jh", "ds", "cv", "vb");

        System.out.println("Количество символов каждого элемента:");
        list.forEach(s -> System.out.print(s.length() + ", "));
        System.out.println("\nНе пустые элементы списка не содержащие символ d:");

        list.stream().filter(x -> !x.contains("d") && !x.isEmpty()).forEach(s -> System.out.print(s + ", "));

        System.out.println("\nЭлементы списка в алфавитном порядке:");
        list = list.stream().sorted().collect(Collectors.toList()); //Здесь остались пробелы потому как в задании не было указанно никак фильтровать а сортипровка ставит их в начало списка.
        System.out.println(list);
    }
}

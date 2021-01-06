package module5.task2;

import java.time.LocalDate;
import java.util.*;

public class Subtask15 {
    public static void main(String[] args) {
        HashMap<String, LocalDate> map = new HashMap();

        map.put("Дмитрий", LocalDate.parse("1991-05-20"));
        map.put("Владимир", LocalDate.parse("1991-06-20"));
        map.put("Анатолий", LocalDate.parse("1991-07-20"));
        map.put("Василий", LocalDate.parse("1991-02-20"));
        map.put("Андрей", LocalDate.parse("1991-03-20"));
        map.put("Антон", LocalDate.parse("1991-08-20"));
        map.put("Илья", LocalDate.parse("1991-02-20"));
        map.put("Павел", LocalDate.parse("1991-09-20"));
        map.put("Артем", LocalDate.parse("1991-02-20"));
        map.put("Валентин", LocalDate.parse("1991-11-20"));
        map.put("Михаил", LocalDate.parse("1991-02-20"));

        removeAllSummerPeople(map);

        System.out.println(map);
    }

    public static void removeAllSummerPeople(HashMap<String, LocalDate> map) {

        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            int rad = pair.getValue().getMonthValue();
            if (rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
    }
}

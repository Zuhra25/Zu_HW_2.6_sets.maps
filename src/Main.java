import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 2, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings1 = new ArrayList<>(List.of("яблоко", "груша", "вишня", "яблоко", "банан", "банан"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(strings1);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer i : nums) {
            if (i % 2 != 0) {
                System.out.printf("%s ", i);
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> setNums = new HashSet<>(nums);
        for (Integer i : nums) {
            if (i % 2 != 0) {
                setNums.remove(i);
            }
        }
        System.out.printf("%s ", setNums);
        System.out.println();
    }

    public static void task3(List<String> strings1) {
        Set<String> strings2 = new HashSet<>(strings1);
        System.out.printf("%s ", strings2);
        System.out.println();
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> mapSrtings = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            int copy = Collections.frequency(strings, strings.get(i));
            mapSrtings.put(strings.get(i), copy);
        }
           System.out.println(mapSrtings.toString());
    }
}


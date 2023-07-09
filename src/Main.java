import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 2, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings1 = new ArrayList<>(List.of("яблоко", "груша", "вишня", "яблоко", "банан", "банан"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task1(nums);
        System.out.println();
        task2(nums);
        System.out.println();
        task3(strings1);
        System.out.println();
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer i : nums) {
            if (i % 2 != 0) {
                System.out.printf("%s ", i);
            }
        }
    }

    public static void task2(List<Integer> nums) {
//        Collections.sort(nums);
        Set<Integer> setNums = new HashSet<>(nums);
        for (Integer i : nums) {
            if (i % 2 != 0) {
                setNums.remove(i);
            }
        }
        Set<Integer> setNums2 = new TreeSet<>(setNums);
        System.out.printf("%s ", setNums2);
    }

    public static void task3(List<String> strings1) {
        Set<String> strings2 = new HashSet<>(strings1);
        System.out.printf("%s ", strings2);

    }

    public static void task4(List<String> strings) {
        Map<Integer, String> mapSrtings = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            int copy = Collections.frequency(strings, strings.get(i));
            mapSrtings.put(copy,strings.get(i));
        }
        Map<Integer, String> mapSrtings2 = new  TreeMap<>(mapSrtings);
        System.out.println(mapSrtings2.toString());
    }
}


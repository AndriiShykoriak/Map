package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumbers {
    public void uniqueNumbers() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 numbers:");
        for (int i = 1; i < 6; i++) {
            int key = i;
            System.out.print("id: " + i + " = ");
            int value = scanner.nextInt();
            numbers.put(key, value);
        }
        HashSet<Integer> set = new HashSet<>(numbers.values());
        System.out.print("UniqueNumbers: ");
        for (Integer number : set) {
            System.out.print(number + " ");
        }
    }
}


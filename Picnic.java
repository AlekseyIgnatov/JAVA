import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Picnic {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            int Count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                Count++;
            }
            System.out.println("Количество слов в файле: " + Count);

            scanner = new Scanner(file);
            String longer = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longer.length()) {
                    longer = word;
                }
            }
            System.out.println("Самое длинное слово: " + longer);

            scanner = new Scanner(file);
            HashMap<String, Integer> Frequency = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (Frequency.containsKey(word)) {
                    Frequency.put(word, Frequency.get(word) + 1);
                } else {
                    Frequency.put(word, 1);
                }
            }
            System.out.println("В корзине:");
            for (String word : Frequency.keySet()) {
                System.out.println(word + ": " + Frequency.get(word) + " шт.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }
}
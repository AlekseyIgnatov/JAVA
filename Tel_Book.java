import java.util.*;
import java.util.HashMap;

public class Tel_Book {
    public static void main(String[] args) {
        // Создаем HashMap для хранения телефонной книги
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        // Добавляем контакты и их телефоны в телефонную книгу
        addContact(phoneBook, "Иванов", "123456789");
        addContact(phoneBook, "Петров", "987654321");
        addContact(phoneBook, "Сидоров", "111111111");
        addContact(phoneBook, "Иванов", "999999999");

        // Выводим телефонную книгу, отсортированную по убыванию числа телефонов
        printPhoneBook(phoneBook);
    }

    // Метод для добавления контакта в телефонную книгу
    public static void addContact(HashMap<String, List<String>> phoneBook, String name, String phone) {
        // Если контакт уже существует, добавляем телефон в его список
        if (phoneBook.containsKey(name)) {
            List<String> phones = phoneBook.get(name);
            phones.add(phone);
        } else {
            // Иначе, создаем новый список телефонов и добавляем его в телефонную книгу
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }

    // Метод для вывода телефонной книги
    public static void printPhoneBook(HashMap<String, List<String>> phoneBook) {
        // Создаем список с парами имя-количество телефонов для сортировки
        List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());

        // Сортируем список по убыванию количества телефонов
        sortedContacts.sort((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()));

        // Выводим отсортированную телефонную книгу
        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
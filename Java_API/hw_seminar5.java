import java.util.Scanner;

public class hw_seminar5 {
    
}

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
public class phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа справочник");
        PhoneContacts phoneContacts = new PhoneContacts();
        System.out.println("Введите название группы контактов:");

        while (true) {
            String input = scanner.next();
            if (input.equals("no")){
                break;
            } else {
                phoneContacts.addGroup(input);
                System.out.println("Создать еще одну группу (введите название или введите нет)?");
            }
        }
        System.out.println(phoneContacts.groupMap);


        while (true){
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String nameOfContact = scanner.nextLine();
            String numberOfContact = scanner.nextLine();
            if(nameOfContact.equals("нет")){
                break;
            }
            Contact newContact = Contact.createContact(nameOfContact, numberOfContact);
            phoneContacts.addContact(newContact);
            System.out.println("Список контактов");
            phoneContacts.showContact();

            System.out.println("Укажите группу контактов через пробел");
            String inputGroupNames = scanner.nextLine();
            String[] arrayOfInputGroupNames = inputGroupNames.split(" ");
        }

        System.out.println("Группы в справочнике: ");
        System.out.println(phoneContacts.groupMap);
    }
}

// 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
// 3. 
// Реализовать алгоритм пирамидальной сортировки (HeapSort).

// 4*. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

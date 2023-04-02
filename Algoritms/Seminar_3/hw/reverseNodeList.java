package Algoritms.Seminar_3.hw;

// Необходимо реализовать метод разворота связного списка 

// (двухсвязного или односвязного на выбор).

// Реализация двусвязного списка

public class reverseNodeList {

    // public static void main(String[] args) {
    // создаём список

    // выводим список в консоль
    // System.out.println();
    // System.out.println("Задан список из чисел:");
    // System.out.println("Развернем список:");

    // }

    Node head; // стартовый элемент
    Node tail; // конечный элемент

    // классическое добавление элемента в связный список без привязки к ноде
    public void add(int value) {
        Node node = new Node(); // новая нода
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    // функция вставки элемента в середину связного списка
    public void add(int value, Node node) {
        Node next = node.next; // создание ссылки на ноду next
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    // операция удаления элемента (ноды)
    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    // поиск элемента в связном списке
    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    // разворот двусвязного списка
    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    // стандартный класс ноды связного списка
    public class Node {
        int value; // значение
        Node next; // следующий элемент
        Node previous; // предыдущий элемент
    }
}
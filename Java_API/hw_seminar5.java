import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class hw_seminar5 {
    
}

// 1. Реализуйте структуру телефонной книги с помощью HashphoneNumber, учитывая, что один человек может иметь несколько телефонов.
class phonebook {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        dataOfBook();
        findInDataOfBook("Петров");
    }
    
    public static void dataOfBook() {
        phoneBook.put("Егоров", List.of("+79999999999", "+79991234567"));
        phoneBook.put("Петров", List.of("+75552223322", "+77775556633", "+79995553366"));
        phoneBook.put("Московская", List.of("+79991112233", "+79523336633"));
    
    }
    
    public static void findInDataOfBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}

// 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
class recurringNames{
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Антон " +
                "Марина " +
                "Светлана " +
                "Кристина " +
                "Анна " +
                "Анна " +
                "Иван " +
                "Анфиса " +
                "Мария " +
                "Иван " +
                "Павел " +
                "Мария " +
                "Светлана " +
                "Мария " +
                "Адрей" +
                "Мария " +
                "Мария " +
                "Марина " +
                "Иван " +
                "Анна " +
                "Иван " +
                "Павел " +
                "Иван ";
        String[] listOfNames = employees.split(" ");
        for (int i = 0; i < listOfNames.length; i ++) {
            if (nameMap.containsKey(listOfNames[i])) {
                nameMap.replace(listOfNames[i], nameMap.get(listOfNames[i]) + 1);
            } else {
                nameMap.put(listOfNames[i], 1);
            }
        }
        System.out.println("Количество имен в списке:\n" + nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println("Отсортированный по убыванию популярности список имен:\n" + sortedNameMap);
    }
}


// 3. 
// Реализовать алгоритм пирамидальной сортировки (HeapSort).
class HeapSort
{
    public void sort(int arr[])
    {
        int n = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекаем элементы из кучи   
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
     void heapify(int arr[], int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

           // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

          // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
       // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

          // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Управляющая программа
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Неотсортированный список:");
        printArray(arr);

        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Отсортированный список:");
        printArray(arr);
    }
}

// 4*. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// Решение не моё. Нашел на просторах сети и попытался разобраться.
class J11 {
    public static class Queen {
        int x, y;
        static int count = 0;

        public Queen(Board board) {
            while (true) {
                // System.out.println("Создаем ферзя");
                Random rnd = new Random();
                int x = rnd.nextInt(8);
                int y = rnd.nextInt(8);
                if (board.cell[x][y] == 0) {
                    this.x = x;
                    this.y = y;
                    count++;
                    break;
                }
            }
        }
    }

    public static class Board {
        int size;
        int[][] cell;

        public Board(int size) {
            this.size = size;
            this.cell = new int[this.size][this.size];
        }

        public void addQueen(Queen queen, int index) {
            this.cell[queen.x][queen.y] = index + 2;
            for (int i = 1; i < 8; i++) {
                int x = queen.x;
                int y = queen.y;
                if ((x + i) < 8 && (y + i) < 8 && (x + i) >= 0 && (y + i) >= 0 && this.cell[x + i][y + i] == 0) {
                    this.cell[x + i][y + i] = 1;
                }
                if ((x + i) < 8 && (y - i) < 8 && (x + i) >= 0 && (y - i) >= 0 && this.cell[x + i][y - i] == 0) {
                    this.cell[x + i][y - i] = 1;
                }
                if ((y + i) < 8 && (y + i) >= 0 && this.cell[x][y + i] == 0) {
                    this.cell[x][y + i] = 1;
                }
                if ((y - i) < 8 && (y - i) >= 0 && this.cell[x][y - i] == 0) {
                    this.cell[x][y - i] = 1;
                }
                if ((x - i) < 8 && (y + i) < 8 && (x - i) >= 0 && (y + i) >= 0 && this.cell[x - i][y + i] == 0) {
                    this.cell[x - i][y + i] = 1;
                }
                if ((x - i) < 8 && (y - i) < 8 && (x - i) >= 0 && (y - i) >= 0 && this.cell[x - i][y - i] == 0) {
                    this.cell[x - i][y - i] = 1;
                }
                if ((x + i) < 8 && (x + i) >= 0 && this.cell[x + i][y] == 0) {
                    this.cell[x + i][y] = 1;
                }
                if ((x - i) < 8 && (x - i) >= 0 && this.cell[x - i][y] == 0) {
                    this.cell[x - i][y] = 1;
                }
            }
        }

        public boolean checkBoard() {
            for (int[] row : this.cell) {
                for (int elem : row) {
                    if (elem == 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void print() {
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    if (this.cell[j][i] == 0 || this.cell[j][i] == 1) {
                        System.out.print(" - ");
                    } else {
                        System.out.printf(" %d ", this.cell[j][i] - 1);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void start() {
        int size = 8;
        Board board = new Board(size);
        nextTurn(board);
    }

    public static void nextTurn(Board board) {
        Queen[] queens = new Queen[8];
        for (int i = 0; i < 8; i++) {
            if (board.checkBoard()) {
                start();
                return;
            }
            queens[i] = new Queen(board);
            board.addQueen(queens[i], i);
        }
        board.print();
    }

    public static void main(String[] args) {
        start();
    }
}
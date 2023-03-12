// Множество коллекций Set
// Set построен на примере Map, но работаем только с ключами. Значение получается по ключу.

// Быстрая работа с данными.

// isEmpty()- проверка на пустоту
// add(V) - добавление элемента в коллекцию
// remove(V) - удаление элемента из коллекции
// contains(V) - проверка на включение элемента в коллекции
// clear() - удаление всех элементов коллекции
// size() - возвращает количество элементов в коллекции

// addAll(Coll) - объединение множеств
// retainAll(Coll) - пересечение множеств
// removeAll(Coll) - разность множеств



// TreeSet

// В основе HashMap
// Упорядочено по возрастанию
// null быть не может


// LinkedHashSet

// В основе HashMap
// Помнит порядок
// Использовать, когда нужен HashSet с запоминанием порядка элемента
// isEmpty()- проверка на пустоту
// add(V) - добавление элемента в коллекцию
// remove(V) - удаление элемента из коллекции
// contains(V) - проверка на включение элемента в коллекции
// clear() - удаление всех элементов коллекции
// size() - возвращает количество элементов в коллекции

// addAll(Coll) - объединение множеств
// retainAll(Coll) - пересечение множеств
// removeAll(Coll) - разность множеств




// Java является объектно-ориентированным языком.

// Программа, написанная на Java, должна соответствовать парадигме объектно-ориентированного программирования.

// Следует понимать, что принципы ООП не просто определяют структуру программы. Это некий функциональный подход, с которым нам предстоит разобраться.

// Спагети-код - код, в котором данные связаны с методами для их обработки и в итоге может получиться так, что отдельные ветви алгоритма переплетаются, образуя запутанный клубок, в котором невозможно разобраться.

// Решение проблемы получило название объектно-ориентированное пронраммирование или ООП.

// При использовании данного подхода, упорядочивание кода базируется на объединении данных, с другой стороны, в одно целое. Это "одно целое" в ООП называется экземпляром класса.

// Вся программа при этом имеет блочную структуру, что существенно упрощает анализ кода и внесение в него изменения.

// ООП - искусственный прием, в большинстве случаев не зависящий от языка программирования.


// Подитоги.

// Если говорят, что разработка идет с использованием ООП - это говорит о том, что используются классы и экземпляры этих классов.

// Каждый экземпляр класса определяется общим шаблоном, который называется классом.

// В рамках класса задается общая структура, на основе которой затем создаются экземпляры.

// Данные, относящиеся к классу, называются полями класса, а код их обработки - методами класса.


public class lection6_071222_Worker {
    int id;
    int salary;
    String firstName;
    String lastName;
    
    @Override
    public String toString() {
        String res = String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);

        return res;
    }

@Override
public boolean equals(Object obj) {
    lection6_071222_Worker t = (lection6_071222_Worker) obj;
    return id == t.id && firstName == t.firstName;
}

@Override
public int hashCode() {
        return id;
    }
}
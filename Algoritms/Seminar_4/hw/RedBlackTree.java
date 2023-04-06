package Algoritms.Seminar_4.hw;

// Необходимо превратить собранное на семинаре дерево поиска в полноценное левостороннее красно-черное дерево. 

// И реализовать в нем метод добавления новых элементов с балансировкой.
//
// Красно-черное дерево имеет следующие критерии:
// • Каждая нода имеет цвет (красный или черный)
// • Корень дерева всегда черный
// • Новая нода всегда красная
// • Красные ноды могут быть только левым ребенком
// • У краной ноды все дети черного цвета
//
// Соответственно, чтобы данные условия выполнялись, после добавления элемента в дерево необходимо произвести балансировку, 
// благодаря которой все критерии выше станут валидными. Для балансировки существует 3 операции – левый малый поворот, 
// правый малый поворот и смена цвета.

public class RedBlackTree<T extends Comparable<T>> {

    private Node<T> root;

    private static class Node<T> {
        private T value;
        private Node<T> left;
        private Node<T> right;
        private boolean isRed;

        Node(T value) {
            this.value = value;
            this.isRed = true;
        }
    }

    public void add(T value) {
        root = add(root, value);
        root.isRed = false;
    }

    private Node<T> add(Node<T> node, T value) {
        if (node == null) {
            return new Node<T>(value);
        }

        if (value.compareTo(node.value) < 0) {
            node.left = add(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = add(node.right, value);
        } else {
            // Это значение уже существует в дереве
            return node;
        }

        // Проверить, сбалансировано ли дерево
        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    // Метод rotateLeft производит левый малый поворот.
    private Node<T> rotateLeft(Node<T> node) {
        Node<T> x = node.right;
        node.right = x.left;
        x.left = node;
        x.isRed = node.isRed;
        node.isRed = true;
        return x;
    }

    // Метод rotateRight производит правый малый поворот.
    private Node<T> rotateRight(Node<T> node) {
        Node<T> x = node.left;
        node.left = x.right;
        x.right = node;
        x.isRed = node.isRed;
        node.isRed = true;
        return x;
    }

    // Метод flipColors меняет цвета нод: красного на черный, и черного на красный.
    private void flipColors(Node<T> node) {
        node.isRed = !node.isRed;
        node.left.isRed = !node.left.isRed;
        node.right.isRed = !node.right.isRed;
    }

    // Метод `isRed` проверяет, является ли нода красной или черной.
    private boolean isRed(Node<T> node) {
        if (node == null) {
            return false;
        }
        return node.isRed;
    }
}
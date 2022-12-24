package OOP.Seminars.seminar4.Ext000;

import java.util.Arrays;

public class MyCollection<T> {
    private T[] myArray;

    public MyCollection(T[] myArray) {
        this.myArray = myArray;
    }

    @Override
    public String toString() {
        return "MyCollection [myArray=" + Arrays.toString(myArray) + "]";
    }

    public T getElement(int index) {
        return this.myArray[index];
    }

    public void setElement(int index, T newValue) {
        this.myArray[index] = newValue;
    }

    public int sizeOfArray() {
        return this.myArray.length;
    }

    public void addNewElement(T newElement) {
        T[] newArray = (T[]) new Object[sizeOfArray() + 1];
        for (int i = 0; i < sizeOfArray(); i++) {
            newArray[i] = this.myArray[i];
        }
        newArray[sizeOfArray()] = newElement;
        this.myArray = newArray;

    }

    // public <T4> int meth(T4 x) {

    // }

}

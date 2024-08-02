package less4;

import java.util.EmptyStackException;

public class GBStack {

    private int[] values;
    private int size = 0; // сколько реально элементов лежит
    private int capacity = 3; //объем
    private int top = -1;

    public GBStack() { // конструктор
        this.values = new int[capacity];
    }

    private void addCapacity() {
        int[] copy = new int[values.length * 2];
        System.arraycopy(this.values, 0, copy, 0, this.capacity);
        this.capacity = copy.length;
        this.values = copy;
    }

    /**
     * @return возвращает верхний элемент стека и удаляет его
     */
    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        size--;
        return values[top--];
    }

    /**
     * @return возвращает верхний элемент стека
     */
    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.values[top];
    }

    /**
     * Кладет элемент на вершину стека
     * @param value
     * @return добавлено или нет
     */
    public boolean push(int value) {
        if (this.size == this.capacity) {
            addCapacity();
        }
        try {
            this.values[++top] = value;
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @return пуст стек или нет
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * @return возвращает кол-во элементов в стеке
     */
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(values[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder);
    }
}

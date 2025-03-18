package lista_03;

public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] array)
    {
        for (int a = 0; a < array.length - 1; ++a) {
            for (int b = 0; b < array.length - 1; ++b) {
                if (array[b].compareTo(array[b + 1]) > 0) {
                    T aux = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        bubbleSort(array);

        for (int a = 0; a < array.length; ++a) {
            System.out.print(array[a] + " ");
        }
    }
}

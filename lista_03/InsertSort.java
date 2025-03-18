package lista_03;

public class InsertSort {
    public static <T extends Comparable<T>> void insertSort(T[] array)
    {
        for (int a = 1; a < array.length; ++a) {
            T elected = array[a];
            int b = a - 1;

            while (b >= 0 && elected.compareTo(array[b]) < 0) {
                array[b + 1] = array[b];
                --b;
            }

            array[b + 1] = elected;
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        insertSort(array);

        for (int a = 0; a < array.length; ++a) {
            System.out.print(array[a] + " ");
        }
    }
}

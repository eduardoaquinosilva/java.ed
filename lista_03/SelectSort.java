package lista_03;

public class SelectSort {
    public static <T extends Comparable<T>> void selectSort(T[] array)
    {
        for (int a = 0; a < array.length - 1; ++a) {
            int min = a;

            for (int b = a + 1; b < array.length; ++b) {
                if (array[b].compareTo(array[min]) < 0) {
                    min = b;
                }
            }

            if (a != min) {
                T temp = array[a];
                array[a] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        selectSort(array);

        for (int a = 0; a < array.length; ++a) {
            System.out.print(array[a] + " ");
        }
    }
}

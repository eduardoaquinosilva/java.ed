package lista_03;

public class ShellSort {
    public static <T extends Comparable<T>> void shellSort(T[] array)
    {
        int h = 0;
        while (h < array.length) {
            h = 3 * h + 1;
        }

        while (h > 1) {
            h /= 3;

            for (int a = h; a < array.length; ++a) {
                T elected = array[a];
                int b = a - h;

                while (b >= 0 && elected.compareTo(array[b]) < 0) {
                    array[b + h] = array[b];
                    b -= h;
                }

                array[b + h] = elected;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        shellSort(array);

        for (int a = 0; a < array.length; ++a) {
            System.out.print(array[a] + " ");
        }
    }
}

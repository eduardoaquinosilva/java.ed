package lista_03;

public class QuickSort {
    public static <T extends Comparable<T>> void quickSort(T[] array, int startArray, int endingArray)
    {
        int start = startArray;
        int ending = endingArray;
        T pivot = array[(start + ending) / 2];

        while (start < ending) {
            while (array[start].compareTo(pivot) < 0) {
                ++start;
            }

            while (array[ending].compareTo(pivot) > 0) {
                --ending;
            }

            if (start <= ending) {
                T temp = array[start];
                array[start] = array[ending];
                array[ending] = temp;
                ++start;
                --ending;
            }
        }

        if (ending > startArray) {
            quickSort(array, startArray, ending);
        }

        if (start < endingArray) {
            quickSort(array, start, endingArray);
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        quickSort(array, 0, 9);

        for (int a = 0; a < array.length; ++a) {
            System.out.print(array[a] + " ");
        }
    }
}

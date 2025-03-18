package lista_03;

public class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(T[] array, T element)
    {
        int start = 0;
        int ending = array.length - 1;

        while (start <= ending) {
            int middle = (start + ending) / 2;
            int compare = element.compareTo(array[middle]);

            if (compare < 0) {
                ending = middle - 1;
            } else if (compare > 0) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Posição do 9: " + binarySearch(array, 9));
    }
}

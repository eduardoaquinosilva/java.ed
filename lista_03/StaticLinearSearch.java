package lista_03;

public class StaticLinearSearch {
    public static <E> int staticLinearSearch(E[] array, E element) {
        for (int a = 0; a < array.length; ++a) {
            if (array[a].equals(element)) {
                return a; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        System.out.println("Posição do 0: " + staticLinearSearch(array, 0));
    }
}

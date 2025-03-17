package lista_03;

public class InsertSort {
    public static void insertSort(int[] array)
    {
        for (int a = 1; a < array.length; ++a) {
            
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        insertSort(array);

        for (int a = 0; a < array.length; ++a) {
            System.out.print(array[a] + " ");
        }
    }
}

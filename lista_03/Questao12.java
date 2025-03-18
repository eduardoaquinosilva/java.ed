package lista_03;

public class Questao12 {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 9, 4, 6, 8, 2, 3, 0};

        long start = System.nanoTime();
        BubbleSort.bubbleSort(array);
        long finish = System.nanoTime();
        System.out.println("Bubble Sort: " + ((finish - start) / 1_000_000.0) + "ms");

        start = System.nanoTime();
        SelectSort.selectSort(array);
        finish = System.nanoTime();
        System.out.println("Select Sort: " + ((finish - start) / 1_000_000.0) + "ms");

        start = System.nanoTime();
        InsertSort.insertSort(array);
        finish = System.nanoTime();
        System.out.println("Insertion Sort: " + ((finish - start) / 1_000_000.0) + "ms");

        start = System.nanoTime();
        QuickSort.quickSort(array, 0, 9);
        finish = System.nanoTime();
        System.out.println("Quick Sort: " + ((finish - start) / 1_000_000.0) + "ms");

        start = System.nanoTime();
        ShellSort.shellSort(array);
        finish = System.nanoTime();
        System.out.println("Shell Sort: " + ((finish - start) / 1_000_000.0) + "ms");
    }
}

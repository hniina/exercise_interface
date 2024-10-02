public class Sorter {
    public <T extends Comparable<T>> void sort(T[] array) {
        // Bubble Sort to sort the array, works for any Comparable type
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }}
        }}}

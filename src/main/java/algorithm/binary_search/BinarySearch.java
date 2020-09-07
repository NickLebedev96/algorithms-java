package algorithm.binary_search;

public class BinarySearch {

    /**
     * Метод, реализующий алгоритм бинарного поиска.
     *
     * @param key - искомое число
     * @param arr - массив чисел
     * @return индекс искомого числа в массиве, если числа
     * в массиве нет - ответом будет -1
     */
    public static int rank(int key, int[] arr) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == key) {
                return middleIndex;
            } else if (arr[middleIndex] < key) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}

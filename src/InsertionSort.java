public class InsertionSort {
    public static <T extends Comparable<T>>
    T[] insertionSort(T[] data)
    {
        for (int index = 1; index < data.length; index++)
        {
            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position-1].compareTo(key) > 0)
            {
                data[position] = data[position-1];
                position--;
            }

            data[position] = key;
        }
        return data;
    }
}

package oy.tol.tra;

/**
 * A simple array of student grades to be used in testing
 * misbehaving algorithm for reversing the array.
 */

public class Algorithms {

    private Integer [] array = null;

    public static <T extends Comparable<T>> int binarySearch(T aValue, T [] fromArray, int fromIndex, int toIndex) {
        // TODO: you will implement this in step 2 below.
        if (aValue.compareTo(fromArray[fromIndex]) < 0 || aValue.compareTo(fromArray[toIndex]) > 0) {
            return -1;
        }
        // 找中间值
        int mid = (fromIndex + toIndex) / 2;

        if (fromArray[mid].equals(aValue)) {
            return mid;
        } else if (fromArray[mid].compareTo(aValue) > 0) {
            //如果中间值大于要找的值则从左边一半继续递归
            return binarySearch(aValue, fromArray, fromIndex, mid-1);
        } else {
            //如果中间值小于要找的值则从右边一半继续递归
            return binarySearch(aValue, fromArray, mid + 1, toIndex);
        }
    }

    public Algorithms(Integer [] array) {
        this.array = new Integer [array.length];
        for (int counter = 0; counter < array.length; counter++) {
            this.array[counter] = array[counter];
        }
    }

    /**
     * The method to reverse the internal Java int array.
     */
    public static <T extends Comparable<T>> void reverse(T[] array) {
        int length = array.length;
        for(int i = 0; i < length/2; i++){
            T temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }
    }

    /**
     * Sorts the array to ascending order.
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        int length = array.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length-1-i; j++){
                T x1 = array[j];
                T x2 = array[j+1];
                if(x1.compareTo(x2) > 0){
                    array[j+1] = x1;
                    array[j] = x2;
                }
            }
        }
    }

    /**
     * Returns the plain Java int [] array for investigation.
     * @return The int array.
     */
    public Integer [] getArray() {
        return array;
    }

}



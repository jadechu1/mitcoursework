package com.mitcoursework.sort;

/**
 * Created by chutungyu11 on 2/5/17.
 */
public class Selection {

    int[] sortArray;

    Selection(){
        // empty
    }

    public int[] getSortArray() {
        return sortArray;
    }

    public void setSortArray(int[] sortArray) {
        this.sortArray = sortArray;
    }

    public void printSortArray(){
        for (int i=0; i<sortArray.length; i++)
            System.out.print(sortArray[i]+" ");
        System.out.println();
    }

    public void selectionSort(){
        System.out.println("Sorting list now.");

        for (int i=0; i<sortArray.length; i++) {
            int minIndex = i;
            boolean swap=false;

            for (int j=i; j<sortArray.length; j++) {

                if (sortArray[j] < sortArray[minIndex]) {
                    minIndex = j;
                    swap=true;
                }

            }

            if (!swap) {
                // nothing swapped
                System.out.println("Nothing swapped so lets get out of here. i="+i);
                return;
            }

            //swap them
            int smallGuy = sortArray[minIndex];
            sortArray[minIndex] = sortArray[i];
            sortArray[i] = smallGuy;
        }

    }


    /*
        main()

     */
    public static void main(String[] args) {
        System.out.println("Let's play");
        Selection s = new Selection();
        s.setSortArray(new int[]{ 0, 1, 3, 5, 7});
        s.printSortArray();
        s.selectionSort();
        s.printSortArray();

        s.setSortArray(new int[]{ 100, 91, 3, 99, 43, 1,45,444,6, 58, 7});
        s.printSortArray();
        s.selectionSort();
        s.printSortArray();

        s.setSortArray(new int[]{ 1000, 30, 15, 3, 56, 7});
        s.printSortArray();
        s.selectionSort();
        s.printSortArray();


    }
}

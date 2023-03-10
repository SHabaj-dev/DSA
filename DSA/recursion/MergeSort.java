package recursion;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int a[], int s, int e) {
        if (s >= e)
            return;
        int mid = (s + e) / 2;
        mergeSort(a, s, mid);
        mergeSort(a, mid + 1, e);
        merge(a, s, e);

    }



    static void merge(int a[], int s, int e) {

        int mid = (s + e) / 2;
        //find length
        int len1 = mid - s + 1;
        int len2 = e - mid;
        int a1[] = new int[len1];
        int a2[] = new int[len2];


        int originalArrayIndex = s;
        //copy elements
        for (int i = 0; i < len1; i++) {
            a1[i] = a[originalArrayIndex];
            originalArrayIndex++;
        }
        for (int i = 0; i < len2; i++) {
            a2[i] = a[originalArrayIndex];
            originalArrayIndex++;
        }

        //merge two sorted array
        int index1 = 0;
        int index2 = 0;
        originalArrayIndex = s;

        while (index1 < len1 && index2 < len2) {
            if (a1[index1] < a2[index2]) {
                a[originalArrayIndex] = a1[index1];
                originalArrayIndex++;
                index1++;
            } else {
                a[originalArrayIndex] = a2[index2];
                originalArrayIndex++;
                index2++;
            }
        }
        while (index1 < len1) {
            a[originalArrayIndex] = a1[index1];
            originalArrayIndex++;
            index1++;

        }
        while (index2 < len2) {
            a[originalArrayIndex] = a2[index2];
            originalArrayIndex++;
            index2++;

        }
    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 12323, 12};
        mergeSort(a, 0, a.length - 1);
//        ms(a, 0, a.length - 1);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}

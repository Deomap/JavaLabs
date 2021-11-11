package java.labs.lab6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public void swap(Student [] arr, int a, int b){
        Student tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public int partition(Student [] arr, int l, int r){
        Student v = arr[(int)(l+r)/2];
        int i = l;
        int j = r;
        while(i <= j){
            while(compare(arr[i], v) > 0) i++;
            while(compare(arr[j], v) < 0) j--;
            if(i >= j) break;
            swap(arr, i++, j--);
        }
        return j;
    }

    public void quickSort(Student [] arr, int l, int r){
        if(l < r){
            int q = partition(arr, l, r);
            quickSort(arr, l, q);
            quickSort(arr, q+1, r);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getScore(), o2.getScore());
    }
}

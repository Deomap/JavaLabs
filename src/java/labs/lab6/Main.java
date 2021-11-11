package java.labs.lab6;

public class Main {

    public static void insertionSort(Student [] arr){
        for(int i = 0; i < arr.length; i++){
            int j = i - 1;
            Student key = arr[i];
            while(j >= 0 && arr[j].getScore() > key.getScore()){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void merge(Student [] a, int left, int mid, int right) {
        int it1 = 0, it2 = 0;
        Student [] result = new Student[right-left];

        while(left + it1 < mid && mid + it2 < right) {
            if (a[left + it1].getScore() < a[mid + it2].getScore()) {
                result[it1 + it2] = a[left + it1];
                it1 += 1;
            }
            else {
                result[it1 + it2] = a[mid + it2];
                it2 += 1;
            }
        }

        while (left + it1 < mid) {
            result[it1 + it2] = a[left + it1];
            it1 += 1;
        }

        while (mid + it2 < right) {
            result[it1 + it2] = a[mid + it2];
            it2 += 1;
        }

        for(int i = 0; i < it1 + it2; i++) {
            a[left + i] = result[i];
        }
    }

    public static void mergeSortRecursive(Student [] a, int left, int right) {
        if (left + 1 >= right) return;
        int mid = (left + right) / 2;
        mergeSortRecursive(a, left, mid);
        mergeSortRecursive(a, mid, right);
        merge(a, left, mid, right);
    }

    public static void main(String[] args) {

        //1
        Student [] iDNumber = new Student[] {
                new Student(5),
                new Student(2),
                new Student(1)  };

        insertionSort(iDNumber);
        for (Student student : iDNumber) {
            System.out.print(student + " ");
        }
        System.out.println();

        //2
        Student [] iDNumber2 = new Student[] {
                new Student(11),
                new Student(2),
                new Student(7)  };

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(iDNumber2, 0, iDNumber2.length - 1);
        for (Student student : iDNumber2){
            System.out.print(student + " ");
        }
        System.out.println();

        //3
        Student [] a = new Student[iDNumber.length + iDNumber2.length];
        System.arraycopy(iDNumber, 0, a, 0, iDNumber.length);
        System.arraycopy(iDNumber2, 0, a, iDNumber.length, iDNumber2.length);
        mergeSortRecursive(a, 0, a.length);
        for (Student student : a){
            System.out.print(student + " ");
        }
    }
}
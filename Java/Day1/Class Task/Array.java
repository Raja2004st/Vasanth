public class Array{
    public static void main(String[] args) {
        //Creating an array with default values
        int arr1[] = new int[5];  
        System.out.println("Array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(); 

        //Creating an array with specified values
        int arr2[] = {10, 20, 30, 40, 50};
        System.out.println("Array 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(); 

        // Another way to create an array with specified values
        int arr3[] = new int[] {10, 20, 30, 40, 50};  
        System.out.println("Array 3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}

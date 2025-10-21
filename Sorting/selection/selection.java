import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eneter the elements of the array in space seperated :");
        String st = sc.nextLine();
        String[] words = st.split(" ");


        int[] arr = new int[words.length];
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(words[i]);
        }

        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));


        sc.close();

        
    }

    public static void selectionSort(int[] nums){
        
    }
}
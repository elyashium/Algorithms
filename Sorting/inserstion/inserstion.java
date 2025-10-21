import java.util.*;

class solution{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the array with space seperated");

        String line = sc.nextLine();
        String[] word = line.split(" ");

        //populatiing and parsing the string into the current datd structure
        int arr[] = new int[word.length];
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(word[i]);

        }
        inserstionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));


        sc.close();
    }

    // Use 'void' for functions that modify the input array directly ("in-place")
    public static void inserstionSort(int[] nums){

        int n = nums.length;
        int j;

        for(int i =0; i<n; i++){
            j =i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;

                j--;
            }
        }

        
    }
}

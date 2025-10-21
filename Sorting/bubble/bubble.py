# No imports are needed for this simple case

def bubble_sort(nums: list[int]) -> None:
   
    n = len(nums)
    # Traverse through all array elements
    for i in range(n - 1):
        swapped = False
        # Last i elements are already in place
        for j in range(0, n - i - 1):
            # Traverse the array from 0 to n-i-1
            # Swap if the element found is greater than the next element
            if nums[j] > nums[j + 1]:
                # This is the Pythonic way to swap two variables.
                # It uses tuple packing and unpacking.
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
                swapped = True
        
        # If no two elements were swapped by inner loop, then the list is sorted
        if not swapped:
            break

def main():
   
    print("Enter numbers separated by spaces (e.g., 5 2 8 1):")
    line = input()

    #Parse the input string into a list of integers
    # We use a list comprehension for a clean, one-line conversion.
    # We also add a try-except block for robustness in case of bad input.
    try:
        numbers = [int(num_str) for num_str in line.split()]
    except ValueError:
        print("Invalid input. Please enter only integers separated by spaces.")
        return

    bubble_sort(numbers)

  
    print(f"Sorted Array: {numbers}")

# This is a standard Python construct to ensure main() runs only
# when the script is executed directly.
if __name__ == "__main__":
    main()
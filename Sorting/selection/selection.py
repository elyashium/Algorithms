from typing import List

def selection_sort(nums: List[int]) -> None:
    """
    Sorts a list of integers in-place using the Selection Sort algorithm.
    """
    n = len(nums)
    # Traverse through all array elements
    for i in range(n - 1):
        # Find the minimum element in the remaining unsorted array
        min_index = i
        for j in range(i + 1, n):
            if nums[j] < nums[min_index]:
                min_index = j

        # Swap the found minimum element with the first element of the unsorted part
        # using Python's tuple unpacking for a clean swap.
        nums[i], nums[min_index] = nums[min_index], nums[i]

def main():
    """
    Main function to run the program.
    """
    # 1. Get input from the user
    print("Enter numbers separated by spaces (e.g., 64 25 12 22 11):")
    line = input()

    # 2. Parse the string into a list of integers
    try:
        numbers = [int(s) for s in line.split()]
    except ValueError:
        print("Invalid input. Please enter only integers.")
        return

    # 3. Call the sorting function
    selection_sort(numbers)

    # 4. Print the sorted list
    print(f"Sorted Array: {numbers}")

if __name__ == "__main__":
    main()
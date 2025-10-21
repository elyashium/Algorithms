from typing import List

def merge_sort(nums: List[int]) -> List[int]:
   
    n = len(nums)
    # Base case: A list with 0 or 1 element is already sorted.
    if n <= 1:
        return nums

    # 1. Divide: Python's slicing is very clean for this.
    mid = n // 2
    left_half = nums[:mid]
    right_half = nums[mid:]

    # 2. Conquer: Recursively sort both halves.
    sorted_left = merge_sort(left_half)
    sorted_right = merge_sort(right_half)

    # 3. Combine: Merge the sorted halves.
    return merge(sorted_left, sorted_right)

def merge(left: List[int], right: List[int]) -> List[int]:
   
    result = []
    i, j = 0, 0 # Pointers for left and right lists

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    
    # After the loop, one list may have remaining elements.
    # The .extend() method is a Pythonic way to add all remaining items.
    result.extend(left[i:])
    result.extend(right[j:])
    
    return result


def main():
    """
    Main function to handle I/O.
    """
    print("Enter numbers separated by spaces (e.g., 38 27 43 3 9 82 10):")
    line = input()

    try:
        numbers = [int(s) for s in line.split()]
    except ValueError:
        print("Invalid input.")
        return

    # Call the sorting function and store the new sorted list.
    sorted_numbers = merge_sort(numbers)

    print(f"Sorted Array: {sorted_numbers}")


if __name__ == "__main__":
    main()
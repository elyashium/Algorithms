package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

// mergeSort recursively divides the slice and merges the sorted results.
// It returns a new, sorted slice.
func mergeSort(nums []int) []int {
	n := len(nums)
	// Base case
	if n <= 1 {
		return nums
	}

	// 1. Divide
	mid := n / 2
	left := nums[:mid]
	right := nums[mid:]

	// 2. Conquer (recursive calls)
	// Note: We need to make copies to ensure we don't modify the underlying array
	// of slices higher up in the recursion stack in unexpected ways.
	leftCopy := make([]int, len(left))
	copy(leftCopy, left)
	rightCopy := make([]int, len(right))
	copy(rightCopy, right)
	
	sortedLeft := mergeSort(leftCopy)
	sortedRight := mergeSort(rightCopy)

	// 3. Combine
	return merge(sortedLeft, sortedRight)
}

// merge combines two sorted slices into a single sorted slice.
func merge(left, right []int) []int {
	// Pre-allocate the result slice with the final size for efficiency
	result := make([]int, 0, len(left)+len(right))
	i, j := 0, 0 // Pointers for left and right slices

	for i < len(left) && j < len(right) {
		if left[i] <= right[j] {
			result = append(result, left[i])
			i++
		} else {
			result = append(result, right[j])
			j++
		}
	}

	// Append any remaining elements. The '...' unpacks the slice.
	result = append(result, left[i:]...)
	result = append(result, right[j:]...)

	return result
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Enter numbers separated by spaces (e.g., 38 27 43 3 9 82 10):")
	
	line, _ := reader.ReadString('\n')
	line = strings.TrimSpace(line)
	stringNumbers := strings.Split(line, " ")
	numbers := make([]int, 0, len(stringNumbers))

	for _, s := range stringNumbers {
		num, err := strconv.Atoi(s)
		if err != nil {
			fmt.Println("Error: Invalid input.")
			return
		}
		numbers = append(numbers, num)
	}

	sortedNumbers := mergeSort(numbers)
	fmt.Println("Sorted Array:", sortedNumbers)
}
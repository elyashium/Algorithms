package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

// selectionSort sorts a slice of integers in-place.
func selectionSort(nums []int) {
	n := len(nums)
	for i := 0; i < n-1; i++ {
		// Find the minimum element in the unsorted part of the slice
		minIndex := i
		for j := i + 1; j < n; j++ {
			if nums[j] < nums[minIndex] {
				minIndex = j
			}
		}
		// Swap the found minimum with the first element of the unsorted part
		nums[i], nums[minIndex] = nums[minIndex], nums[i]
	}
}

func main() {
	// 1. Set up the reader
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Enter numbers separated by spaces (e.g., 64 25 12 22 11):")
	
	line, _ := reader.ReadString('\n')
	line = strings.TrimSpace(line)

	// 2. Parse the input string into a slice of integers
	stringNumbers := strings.Split(line, " ")
	numbers := make([]int, 0, len(stringNumbers)) // Initialize with capacity for efficiency

	for _, s := range stringNumbers {
		num, err := strconv.Atoi(s)
		if err != nil {
			fmt.Println("Error: Invalid input. Please enter only integers.")
			return
		}
		numbers = append(numbers, num)
	}

	// 3. Call the sorting function
	selectionSort(numbers)

	// 4. Print the result
	fmt.Println("Sorted Array:", numbers)
}
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

// insertionSort sorts a slice of integers in-place.
func insertionSort(nums []int) {
	// Start from the second element (index 1)
	for i := 1; i < len(nums); i++ {
		j := i
		// While the current element is smaller than the one to its left, swap them.
		// The `for` keyword is used for while-style loops in Go.
		for j > 0 && nums[j-1] > nums[j] {
			// Go's multi-assignment makes swapping simple
			nums[j-1], nums[j] = nums[j], nums[j-1]
			j--
		}
	}
}

func main() {
	// 1. Set up a buffered reader for console input
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Enter numbers separated by spaces (e.g., 5 2 8 1 9 4):")
	
	line, _ := reader.ReadString('\n')
	line = strings.TrimSpace(line)

	// 2. Parse the string into a slice of integers
	stringNumbers := strings.Split(line, " ")
	numbers := make([]int, len(stringNumbers)) // Pre-allocate the slice with the correct size

	for i, s := range stringNumbers {
		num, err := strconv.Atoi(s)
		if err != nil {
			fmt.Println("Error: Please enter only valid integers.", err)
			return
		}
		numbers[i] = num
	}

	// 3. Call the sorting function
	insertionSort(numbers)

	// 4. Print the sorted slice
	fmt.Println("Sorted Array:", numbers)
}
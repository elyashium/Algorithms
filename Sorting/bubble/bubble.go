package main

import (
	"bufio"   // For efficient reading
	"fmt"     // For printing
	"os"      // To access standard input
	"strconv" // To convert strings to integers
	"strings" // To split the input line
)

// bubbleSort sorts a slice of integers in-place.
// In Go, slices are reference types, so modifications inside
// the function will affect the original slice.
func bubbleSort(nums []int) {
	n := len(nums)
	for i := 0; i < n-1; i++ {
		swapped := false
		for j := 0; j < n-i-1; j++ {
			if nums[j] > nums[j+1] {
				// Go also allows for clean, one-line swaps.
				nums[j], nums[j+1] = nums[j+1], nums[j]
				swapped = true
			}
		}
		if !swapped {
			break
		}
	}
}

func main() {
	// 1. Set up a reader to get input from the console
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Enter numbers separated by spaces (e.g., 5 2 8 1):")
	
	// Read a single line, until the newline character
	line, _ := reader.ReadString('\n')
	// Trim whitespace (like the newline character) from the line
	line = strings.TrimSpace(line)

	// 2. Parse the input string into a slice of integers
	stringNumbers := strings.Split(line, " ")
	// Create a slice of integers with the correct size
	numbers := make([]int, 0, len(stringNumbers))

	for _, s := range stringNumbers {
		// strconv.Atoi returns the integer and an error
		num, err := strconv.Atoi(s)
		if err != nil {
			fmt.Println("Invalid input. Please enter only integers. Error:", err)
			return // Exit if there's an error
		}
		numbers = append(numbers, num)
	}

	// 3. Call the sorting function
	bubbleSort(numbers)

	// 4. Print the result
	// fmt.Println automatically formats slices in a readable way
	fmt.Println("Sorted Array:", numbers)
}
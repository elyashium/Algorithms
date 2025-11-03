package main

import (
	"fmt"
)

func allPossibleSubseq(s string, current string, index int) {
	// base condition
	if index == len(s) {
		fmt.Println(current)
		return
	}

	// include current character
	allPossibleSubseq(s, current+string(s[index]), index+1)

	// exclude current character
	allPossibleSubseq(s, current, index+1)
}

func main() {
	var input string
	fmt.Println("Enter the string:")
	fmt.Scanln(&input)

	fmt.Println("The possible substrings are:")
	allPossibleSubseq(input, "", 0)
}

package main

import (
	"fmt"
)

// Stack-based solution
func removeOuterParenthesesStack(s string) string {
	stack := []rune{}
	result := []rune{}

	for _, ch := range s {
		if ch == '(' {
			if len(stack) > 0 {
				result = append(result, ch)
			}
			stack = append(stack, ch)
		} else { // ')'
			stack = stack[:len(stack)-1]
			if len(stack) > 0 {
				result = append(result, ch)
			}
		}
	}
	return string(result)
}

// Counter-based solution
func removeOuterParenthesesCounter(s string) string {
	count := 0
	result := []rune{}

	for _, ch := range s {
		if ch == '(' {
			if count > 0 {
				result = append(result, ch)
			}
			count++
		} else { // ')'
			count--
			if count > 0 {
				result = append(result, ch)
			}
		}
	}
	return string(result)
}

func main() {
	fmt.Println(removeOuterParenthesesStack("(()())(())"))   // ()()()
	fmt.Println(removeOuterParenthesesCounter("(()())(())")) // ()()()
}

package main

import (
	"fmt"
	"strings"
)

func rotate(s, goal string) bool {
	if len(s) != len(goal) {
		return false
	}
	doubled := s + s
	return strings.Contains(doubled, goal)
}

func main() {
	fmt.Println(rotate("abcde", "cdeab")) // true
	fmt.Println(rotate("abcde", "abced")) // false
}

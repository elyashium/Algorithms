package main

import (
	"fmt"
	"sort"
	"strings"
)

func isAnagramSort(s, t string) bool {
	if len(s) != len(t) {
		return false
	}

	sArr := strings.Split(s, "")
	tArr := strings.Split(t, "")

	sort.Strings(sArr)
	sort.Strings(tArr)

	return strings.Join(sArr, "") == strings.Join(tArr, "")
}

func main() {
	fmt.Println(isAnagramSort("anagram", "nagaram")) // true
	fmt.Println(isAnagramSort("rat", "car"))         // false
}

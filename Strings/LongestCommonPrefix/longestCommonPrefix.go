package main

import "fmt"

func isIsomorphic(s, t string) bool {
	if len(s) != len(t) {
		return false
	}

	mapS := make(map[byte]byte)
	mapT := make(map[byte]byte)

	for i := 0; i < len(s); i++ {
		cs, ct := s[i], t[i]

		if val, ok := mapS[cs]; ok {
			// 			//In Go, when you look up a key in a map, you can get two values:

			// The value itself (val).

			// A boolean (ok) that tells you whether the key existed.
			if val != ct {
				return false
			}
		} else {
			mapS[cs] = ct
		}

		if val, ok := mapT[ct]; ok {
			if val != cs {
				return false
			}
		} else {
			mapT[ct] = cs
		}
	}

	return true
}

func main() {
	fmt.Println(isIsomorphic("egg", "add"))     // true
	fmt.Println(isIsomorphic("foo", "bar"))     // false
	fmt.Println(isIsomorphic("paper", "title")) // true
}

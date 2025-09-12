package main

import (
    "fmt"
)

func largestOddNumber(num string) string {
    for i := len(num) - 1; i >= 0; i-- {
        digit := num[i] - '0'     // convert byte to int (ASCII trick)
        if digit%2 == 1 {
            return num[:i+1]      // return prefix
        }
    }
    return ""
}

func main() {
    fmt.Println(largestOddNumber("7542356")) // "754235"
    fmt.Println(largestOddNumber("4206"))    // ""
}

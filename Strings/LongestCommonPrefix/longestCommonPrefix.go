import (
    "sort"
)

func longestCommonPrefix(strs []string) string {
    sort.Strings(strs)
    start, end := strs[0], strs[len(strs)-1]
    count := 0

    for count < len(start) && count < len(end) {
        if start[count] == end[count] {
            count++
        } else {
            break
        }
    }
    return start[:count]
}

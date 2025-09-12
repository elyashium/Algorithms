function isAnagramSort(s: string, t: string): boolean {
    if (s.length !== t.length) return false;
    return s.split("").sort().join("") === t.split("").sort().join("");
}

// Example usage
console.log(isAnagramSort("anagram", "nagaram")); // true
console.log(isAnagramSort("rat", "car"));         // false

function rotate(s: string, goal: string): boolean {
    if (s.length !== goal.length) {
        return false;
    }
    let doubled = s + s;
    return doubled.includes(goal);
}

// Example usage
console.log(rotate("abcde", "cdeab")); // true
console.log(rotate("abcde", "abced")); // false

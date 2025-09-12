function frequencySort(s: string): string {
    const freq = new Map<string, number>();

    // Count frequencies
    for (const ch of s) {
        freq.set(ch, (freq.get(ch) || 0) + 1);
    }

    // Sort characters by decreasing frequency
    const sortedChars = Array.from(freq.keys()).sort(
        (a, b) => (freq.get(b) as number) - (freq.get(a) as number)
    );

    // Build result
    let answer = "";
    for (const ch of sortedChars) {
        answer += ch.repeat(freq.get(ch)!);
    }

    return answer;
}

// Example
console.log(frequencySort("tree"));   // "eetr" or "eert"
console.log(frequencySort("cccaaa")); // "cccaaa" or "aaaccc"

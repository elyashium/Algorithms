from collections import Counter

class Solution:
    def frequencySort(self, s: str) -> str:
        # Count frequencies
        freq = Counter(s)
        
        # Sort characters by decreasing frequency
        sorted_chars = sorted(freq.keys(), key=lambda c: -freq[c])
        
        # Build result
        answer = []
        for c in sorted_chars:
            answer.append(c * freq[c])
        
        return "".join(answer)


# Example
print(Solution().frequencySort("tree"))   # "eetr" or "eert"
print(Solution().frequencySort("cccaaa")) # "cccaaa" or "aaaccc"

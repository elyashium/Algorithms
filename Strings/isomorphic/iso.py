class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #you cant use sort directely becasuse strings in python are immuatable
        #sorted(s) → which returns a list of sorted characters.
        return sorted(s) == sorted(t)


# Example
sol = Solution()
print(sol.isAnagram("anagram", "nagaram"))  # True
print(sol.isAnagram("rat", "car"))          # False

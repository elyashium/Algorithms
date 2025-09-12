class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        strs.sort()  # important step
        start, end = strs[0], strs[-1]
        count = 0
        
        while count < len(start) and count < len(end):
            if start[count] == end[count]:
                count += 1
            else:
                break
        return start[:count]

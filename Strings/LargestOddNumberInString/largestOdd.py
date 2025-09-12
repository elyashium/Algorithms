class Solution:
    def largestOddNumber(self, num: str) -> str:
        for i in range(len(num) - 1, -1, -1):  # loop from right to left
            if int(num[i]) % 2 == 1:          # check if odd
                return num[:i+1]              # return prefix up to i
        return ""                             # no odd digit

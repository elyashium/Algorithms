class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_s, map_t = {}, {}

        if len(s) != len(t):
            return False

        for cs, ct in zip(s, t):
            if cs in map_s:
                if map_s[cs] != ct:
                    return False
            else:
                map_s[cs] = ct

            if ct in map_t:
                if map_t[ct] != cs:
                    return False
            else:
                map_t[ct] = cs

        return True


# Example
sol = Solution()
print(sol.isIsomorphic("egg", "add"))  # True
print(sol.isIsomorphic("foo", "bar"))  # False
print(sol.isIsomorphic("paper", "title"))  # True

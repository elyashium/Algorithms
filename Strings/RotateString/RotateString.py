def rotate(s: str, goal: str) -> bool:
    if len(s) != len(goal):
        return False
    doubled = s + s
    return goal in doubled


# Example usage
print(rotate("abcde", "cdeab"))  # True
print(rotate("abcde", "abced"))  # False

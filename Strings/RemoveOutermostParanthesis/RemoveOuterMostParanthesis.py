# Stack-based solution
def removeOuterParenthesesStack(s: str) -> str:
    stack = []
    result = []

    for ch in s:
        if ch == '(':
            if stack:
                result.append(ch)
            stack.append(ch)
        else:
            stack.pop()
            if stack:
                result.append(ch)

    return "".join(result)


# Counter-based solution
def removeOuterParenthesesCounter(s: str) -> str:
    count = 0
    result = []

    for ch in s:
        if ch == '(':
            if count > 0:
                result.append(ch)
            count += 1
        else:
            count -= 1
            if count > 0:
                result.append(ch)

    return "".join(result)


# Example usage
print(removeOuterParenthesesStack("(()())(())"))   # ()()()
print(removeOuterParenthesesCounter("(()())(())")) # ()()()

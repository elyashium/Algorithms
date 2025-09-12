function removeOuterParentheses(s: string): string {
    let stack: string[] = [];
    let result: string[] = [];

    for (let ch of s) {
        if (ch === "(") {
            if (stack.length > 0) {
                result.push(ch);
            }
            stack.push(ch);
        } else {
            stack.pop();
            if (stack.length > 0) {
                result.push(ch);
            }
        }
    }

    return result.join("");
}

// Example usage
console.log(removeOuterParentheses("(()())(())")); // output: ()()()

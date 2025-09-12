// Stack-based solution
function removeOuterParenthesesStack(s: string): string {
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

// Counter-based solution
function removeOuterParenthesesCounter(s: string): string {
    let count = 0;
    let result: string[] = [];

    for (let ch of s) {
        if (ch === "(") {
            if (count > 0) {
                result.push(ch);
            }
            count++;
        } else {
            count--;
            if (count > 0) {
                result.push(ch);
            }
        }
    }

    return result.join("");
}

// Example usage
console.log(removeOuterParenthesesStack("(()())(())"));   // ()()()
console.log(removeOuterParenthesesCounter("(()())(())")); // ()()()

function longestCommonPrefix(strs: string[]): string {
    strs.sort();
    const start = strs[0];
    const end = strs[strs.length - 1];
    let count = 0;

    while (count < start.length && count < end.length) {
        if (start[count] === end[count]) {
            count++;
        } else {
            break;
        }
    }
    return start.substring(0, count);
}

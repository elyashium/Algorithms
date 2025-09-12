function isIsomorphic(s: string, t: string): boolean {
    if (s.length !== t.length) return false;

    const mapS = new Map<string, string>();
    const mapT = new Map<string, string>();

    for (let i = 0; i < s.length; i++) {
        const cs = s[i], ct = t[i];

        if (mapS.has(cs)) {
            if (mapS.get(cs) !== ct) return false;
        } else {
            mapS.set(cs, ct);
        }

        if (mapT.has(ct)) {
            if (mapT.get(ct) !== cs) return false;
        } else {
            mapT.set(ct, cs);
        }
    }

    return true;
}

// Example usage
console.log(isIsomorphic("egg", "add"));   // true
console.log(isIsomorphic("foo", "bar"));   // false
console.log(isIsomorphic("paper", "title")) // true

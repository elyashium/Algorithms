def all_possible_subseq(s, current="", index=0):
    # base condition
    if index == len(s):
        print(current)
        return

    # include current character
    all_possible_subseq(s, current + s[index], index + 1)

    # exclude current character
    all_possible_subseq(s, current, index + 1)


# main
if __name__ == "__main__":
    s = input("Enter the string: ")
    print("The possible substrings are:")
    all_possible_subseq(s)

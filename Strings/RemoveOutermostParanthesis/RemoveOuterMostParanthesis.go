import {
	fmt
}

func RemoveOuterParanthesis(s string ): string{

	stack:= []rune{}
	result:= []rune{}
	for _, ch := range s {
		if ch == '(' {
			if len(stack) > 0 {
				result = append(result, ch)
			}
			stack = append(stack, ch)
		} else { // ')'
			stack = stack[:len(stack)-1]
			if len(stack) > 0 {
				result = append(result, ch)
			}
		}
	}
	return string(result)

}
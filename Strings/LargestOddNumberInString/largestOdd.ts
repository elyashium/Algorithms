function largestODD(num:string):string{
    for(let i =num.length-1; i>= 0; i--){
         if (parseInt(num[i]) % 2 === 1) {   // convert char → number
            return num.substring(0, i + 1);
        }
    }
    return ""
}
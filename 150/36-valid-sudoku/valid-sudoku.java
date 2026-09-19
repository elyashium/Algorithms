class Solution {
    public boolean isValidSudoku(char[][] board) {
        

         //we can run row and colums and then have a set check if they exist or not

        Set<Character> [] row = new HashSet[9];
        Set<Character> [] col = new HashSet[9];
        Set<Character> [] box = new HashSet[9];

        // the reason we use Set rather then writting the HashSet becasue we want 
        // it to depend on the interface(Set) rather then the implemenatation (HashSet)
        // so laater we can do somethnig like Set<Integer> set = new TreeSet<>(); etc


        for(int i =0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }


        for(int r =0; r<9; r++){
            for(int c =0; c<9; c++){
                if(board[r][c]=='.'){
                    continue;
                }
                char value = board[r][c];
                int boxindex = (r/3) * 3 + (c/3);
                
                if(row[r].contains(value) || col[c].contains(value) || box[boxindex].contains(value)){
                    return false;
                }

                row[r].add(value);
                col[c].add(value);
                box[boxindex].add(value);
            }
        }
        return true;
        
    }
}
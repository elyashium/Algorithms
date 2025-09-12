class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        int length = s.length();

        if (length != t.length()) {
            return false; 
        }

        

        for(int i =0; i<length; i++){

            char Sm = s.charAt(i);
            char Tm = t.charAt(i);

            //mapping s -> t

            if(mapS.containsKey(Sm)){
                if(mapS.get(Sm) != Tm){
                    return false;
                }
            }
            else{
                mapS.put(Sm, Tm);
            }


            //mapping t -> s

            if(mapT.containsKey(Tm)){
                if(mapT.get(Tm) != Sm){
                    return false;
                }
            }
            else{
                mapT.put(Tm, Sm);
            }
        }

        return true;
    }
}
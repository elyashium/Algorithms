class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        
        StringBuilder answer = new StringBuilder();

        char[] n = s.toCharArray();

        for(char c: n){
           if(map.containsKey(c)){
            map.put(c, map.get(c)+1);
           }
           else{
            map.put(c, 1);
           }

        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());

        //sorting in decreasing order 
        list.sort((ob1, ob2) -> map.get(ob2) - map.get(ob1));
        for(char c : list){
            for (int i =0; i< map.get(c); i++){
                answer.append(c);
            }
        }

        return answer.toString();


    }
}
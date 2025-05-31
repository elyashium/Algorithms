package two pointers;

class Solution {
    public int numFriendRequests(int[] ages) {
        int len = ages.length;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
    
        for(int age: ages){
            map.put(age, map.getOrDefault(age,0)+1);
        }
        for(Integer x : map.keySet()){
            for(Integer y: map.keySet()){

                if(request(x,y)){
                    int countX = map.get(x);
                    int countY = map.get(y);

                    if(x == y){
                        count = count + countX * (countX-1);
                    }
                    else{
                        count = count + countX*countX;
                    }

                }
            }
        }
        return count;
        
    }

    private boolean request(int x, int y){
        return !(y<=0.5*x+7 || y>x || (y>100 && x<100));
    }
}
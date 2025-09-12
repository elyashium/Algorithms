import java.util*;
class solution{
    public boolean rotate(String s, String goal){

        int n = s.length();
        int m = s.length();

        if(m!=n){return false;}

        for(int i =0; i<m; i++){
            if(s.toCharArray(i) == goal.toCharArray(i)){
                return true;
            }
            else{return false;}
        }
        

    }
}
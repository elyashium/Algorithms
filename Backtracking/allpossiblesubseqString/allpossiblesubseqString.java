import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        
        System.out.println("the possible substrings are" + allpossiblesubseq(input, "" , 0));
        sc.close();
    }

    public static void allpossiblesubseq(String s, String current, int index){

        //base condition
        if(index == s.length()){
           
            System.out.println(current);
             return;
        }

        //including the current letter 
        allpossiblesubseq(s, current + s.charAt(index), index+1);

        //excluding the current letter
        allpossiblesubseq(s, current, index+1);

    }

}
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInteger(String str){
        Map<Character,Integer> m = new HashMap<Character,Integer>();

        m.put('I',1);
        m.put('V',5);
        m.put('X',20);
        m.put('C',100);
        m.put('L',50);
        m.put('D',500);
        m.put('M',1000);

        int ans=0;

        for(int i=0; i<str.length(); i++){
            if(i<str.length()-1 && m.get(str.charAt(i))<m.get(str.charAt(i+1))){
                ans-=m.get(str.charAt(i));
            }else{
                ans+=m.get(str.charAt(i));
            }

        }
        return ans;

    }

    public static  void main(String[] args){
        System.out.println(romanToInteger("VI"));
    }
}

//create the map data structure
//put all the roman values into map
//initiate the variable answer to zero
//for loop to go through each element in the given string
//check condition if the smaller element appears in-front of the bigger one then subtract the smaller with bigger one else add them
//check above condition till last but one element coz there is no next element to compare the last element
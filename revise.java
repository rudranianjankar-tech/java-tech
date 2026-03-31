import java.util.*;
public class revise {
    public static void main(String[] args) {

        //reverse a string -1
       // Scanner sc = new Scanner (System.in);
       // String s = sc.nextLine();   
       /* String rev = " ";//empty string to store reserved value

        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);*/

        //count frequency using hashmap
        //hashmap stores data in key,value pairs
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no. of elements");
        int n = sc.nextInt();  

        /*HashMap<Character,Integer> map = new HashMap<>();//{}

        for (char c : ss.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);*/

        //list - allows duplicates,set - removes duplicates automatically
        //remove duplicates using set

        List <Integer> list = new ArrayList<>();// create empty list
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        

        
    }
    
}

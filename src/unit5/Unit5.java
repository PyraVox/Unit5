import java.util.ArrayList;
public class Unit5 {

   static ArrayList al = new ArrayList();
    public static void main(String[] args) {
        
        al.add("A");
        al.add(0,"B");
        al.add("BANANA");
        al.add("PEAR");
        al.add(1,"ORANGE");
        show();
        //change banana to kiwi
        System.out.println("BANANA is at: "+ al.indexOf("BANANA"));
        al.set(3, "KIWI");
        //remove "B" and "A"
        al.remove(0);
        al.remove("A");
        al.sort(null);
    }
    public static void show(){
        for(int x=0;x<al.size();x++){
            String letter = String.valueOf(al.get(x));
            System.out.println("Location "+x+" -> "+letter);
        }
    }
    
}

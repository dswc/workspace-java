import java.util.ArrayList;

public class MyArrayList {
    public void run() {
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
        
        arrList.add(new ArrayList<Integer>());
        arrList.get(0).add(100);
        System.out.println(arrList.get(0).get(0));
        
        
        
//        for (Integer c: arrList)
//            System.out.println(c);
    }
}

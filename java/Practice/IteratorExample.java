import java.util.ArrayList;
import java.util.Iterator;

class IteratorExample {
  
    
    public static void main(String[] args) {
        

        ArrayList<Integer> list =  new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            
            int num = (Integer)itr.next();

            if(num%2 !=0){
                itr.remove();
            }

        }

        System.out.println(list);

    }

}

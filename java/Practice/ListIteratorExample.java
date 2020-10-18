import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ListIterator itr = list.listIterator();

        while (itr.hasNext()) {

            int num = (Integer) itr.next();

            if (num % 2 != 0) {
                itr.remove();
            }

        }

        itr.add(52);

        System.out.println(list);

    }

}

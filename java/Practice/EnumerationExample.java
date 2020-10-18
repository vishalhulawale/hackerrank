import java.util.Enumeration;
import java.util.Vector;

class EnumerationExample {

    public static void main(String[] args) {

        Vector<Integer> vect =  new Vector<Integer>();


        for (int i = 0; i < 10; i++) {
            vect.add(i);
        }

        Enumeration<Integer> en =  vect.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }

}

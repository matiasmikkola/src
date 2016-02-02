package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by matiasmikkola on 1/13/16.
 */

    public class Sets {

        public static void main(String[] args) {

            // happy path

            int count[] = {34,22,10,60,30,22};
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i<5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            // nasty path

            int count2[] = {1,2,3,4,5,5,5};
            Set<Integer> set2 = new HashSet<Integer>();
            for(int i = 0; i<5; i++) {
                set2.add(count2[i]);

                System.out.println(set2);
            }

            // collections.CarBean stuff

            TreeSet Cars = new TreeSet();

            CarBean armando = new CarBean("Pontiac", 1998, "Grand AM", "Red", "2-door");
            CarBean matias = new CarBean("VW", 2014, "Jetta", "White", "4-door");

            Cars.add(armando.toString());
            Cars.add(matias.toString());

            System.out.println(Cars);

        }
    }

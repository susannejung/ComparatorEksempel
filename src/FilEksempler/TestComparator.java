package FilEksempler;

import java.util.*;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 = new Circle(5);
        GeometricObject g3 = new Rectangle(100, 5);

        ArrayList<GeometricObject> tabel = new ArrayList();
        tabel.add(g3);
        tabel.add(g2);
        tabel.add(g1);

        GeometricObjectComparator gComparator = new GeometricObjectComparator();

        Collections.sort(tabel,gComparator);

        System.out.println(tabel.get(0));
        System.out.println(tabel.get(1));
        System.out.println(tabel.get(2));




    /*    GeometricObject g =
                max(g1, g2, new GeometricObjectComparator());

        System.out.println("The area of the larger object is " +
                g.getArea());
    }

    public static GeometricObject max(GeometricObject g1,
                                      GeometricObject g2, Comparator<GeometricObject> c) {
        if (c.compare(g1, g2) > 0)
            return g1;
        else
            return g2;
    }*/
    }
}



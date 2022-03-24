package FilEksempler;

import java.util.Comparator;

    class PerimeterComparator implements Comparator<GeometricObject> {

        public int compare(GeometricObject o1, GeometricObject o2) {
            double c1 = o1.getPerimeter();
            double c2 = o2.getPerimeter();

            if (c1<c2)
                return -1;
            else if (c1==c2)
                return 0;
            else
                return 1;
        }
    }


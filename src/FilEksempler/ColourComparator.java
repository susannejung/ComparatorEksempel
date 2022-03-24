package FilEksempler;

import java.util.Comparator;

public class ColourComparator implements Comparator<GeometricObject> {

    public int compare(GeometricObject o1, GeometricObject o2) {
        String c1 = o1.getColor();
        String c2 = o2.getColor();

        if (c1.compareTo(c2)<0)
            return -1;
        else if (c1.compareTo(c2)==0)
            return 0;
        else
            return 1;
    }
}



package jeudedes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        De de1 = new De();
        De de2 = new De();
        De de3 = new De();

        List<De> nbDes = new ArrayList<>(Arrays.asList(de1, de2, de3));
        Gobelet gob = new Gobelet(nbDes);

        gob.afficher_score();
    }
}

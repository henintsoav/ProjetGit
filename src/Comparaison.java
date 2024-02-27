import java.util.Collections;
import java.util.Comparator;

import static java.lang.CharSequence.compare;

public class Comparaison implements Comparator<String> {
    private String nom;

    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }

    public void trierContactsParNom() {

    }
}

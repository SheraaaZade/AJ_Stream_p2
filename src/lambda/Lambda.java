package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

    /**
     * Retourne une liste contenant uniquement les Integer qui correspondent
     * au predicat match
     *
     * @param list  La liste d'Integer originale
     * @param match le predicat à respecter
     * @return une liste contenant les integer qui respectent match
     */
    public static List<?> allMatches(List<?> list, Predicate<Integer> match) {
        //TODO
        List <Object> listMatch = new ArrayList<>();
        for (Object val : list) {
            if(match.test((Integer) val))
                listMatch.add(val);
        }
        return listMatch;
    }

    /**
     * Retourne une liste contenant tous les éléments de la liste originale, transformés
     * par la fonction transform
     *
     * @param list      La liste d'Integer originale
     * @param transform la fonction à appliquer aux éléments
     * @return une liste contenant les integer transformés par transform
     */
    public static List<?> transformAll(List<?> list, Function<Integer, Integer> transform) {
        //TODO

        for (Object val : list) {
            transform.apply((Integer) val);
        }
        return list;
    }


}

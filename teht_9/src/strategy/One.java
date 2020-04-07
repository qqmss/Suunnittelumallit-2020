package strategy;

import java.util.Iterator;
import java.util.List;

public enum One implements ListConverter {
    INSTANCE;

    @Override
    public String listToString(List list) {
        String s = "";
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            s =  s.concat(iterator.next() + "%n");
        }
        return s;
    }

    public static One getInstance() {
        return INSTANCE;
    }
}

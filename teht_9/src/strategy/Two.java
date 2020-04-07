package strategy;

import java.util.List;

public enum Two implements ListConverter {
    INSTANCE;
    
    @Override
    public String listToString(List list) {
        Object[] objects = list.toArray();
        String s = "";
        for(int i = 0; i < objects.length; i++){
            if((i + 1) % 2 == 0 || i == objects.length - 1){
                s = s.concat(objects[i].toString() + "%n");
            } else {
                s = s.concat(objects[i].toString());
            }
        }
        return s;
    }

    public static Two getInstance() {
        return INSTANCE;
    }
}

package strategy;

import java.util.List;

public enum Three implements ListConverter {
    INSTANCE;

    @Override
    public String listToString(List list) {
        String s = "";
        for(int i = 0; i < list.size(); i++){
            if((i + 1) % 3 == 0 || i == list.size() - 1){
                s = s.concat(list.get(i).toString() + "%n");
            } else {
                s = s.concat(list.get(i).toString());
            }
        }
        return s;
    }

    public static Three getInstance() {
        return INSTANCE;
    }
}

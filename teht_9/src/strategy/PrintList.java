package strategy;

import java.util.List;

public class PrintList {
    private ListConverter converter;

    public PrintList(ListConverter converter) {
        this.converter = converter;
    }

    public void setConverter(ListConverter converter){
        this.converter = converter;
    }

    public void print(List list){
        System.out.format(converter.listToString(list));
    }
}

package decorator;

import java.util.Scanner;

public class accessControlDecorator extends TextDecorator {

    public accessControlDecorator(Text textToBeDecorated) {
        super(textToBeDecorated);
    }

    @Override
    public void print() {
        if (askPermission()) {
            super.print();
        }
    }

    private boolean askPermission(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have permission to look this text? (y/n)");
        boolean b = scanner.nextLine().equals("y");
        scanner.close();
        return b;
    }
}

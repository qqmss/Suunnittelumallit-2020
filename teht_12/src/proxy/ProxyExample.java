package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProxyExample {
    private static List<Image> ImageFolder = new ArrayList<>();

    static {
        ImageFolder.add(new ProxyImage("HiRes_10MB_Photo1"));
        ImageFolder.add(new ProxyImage("HiRes_10MB_Photo2"));
        ImageFolder.add(new ProxyImage("HiRes_10MB_Photo3"));
        ImageFolder.add(new ProxyImage("HiRes_10MB_Photo4"));
    }

    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        for (Image image : ImageFolder) {
            image.showData();
        }
        int i;
        Scanner scanner = new Scanner(System.in);
        do {
            i = scanner.nextInt();
            if (i >= 0 && i < ImageFolder.size()) {
                ImageFolder.get(i).displayImage();
            }
        } while (i != -1);
    }
}

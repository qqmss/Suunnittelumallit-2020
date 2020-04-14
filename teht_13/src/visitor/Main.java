package visitor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PokemonContext pokemonContext = new PokemonContext(new Charmeleon());
        PokemonVisitor pokemonBonusVisitor = PokemonBonusVisitor.getInstance();

        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            System.out.println("Pokemon: " + pokemonContext);
            System.out.println("1. Attack");
            System.out.println("2. Run");
            System.out.println("3. Bonus");
            System.out.println("4. Exit");
            s = scanner.nextLine();
            switch (s) {
                case "1":
                    pokemonContext.attack();
                    break;
                case "2":
                    pokemonContext.run();
                    break;
                case "3":
                    pokemonContext.accept(pokemonBonusVisitor);
            }
        } while (!s.equals("4"));
        scanner.close();
    }
}

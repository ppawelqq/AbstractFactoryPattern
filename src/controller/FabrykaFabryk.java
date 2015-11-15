package controller;

public class FabrykaFabryk {

    public static FabrykaAbstrakcyjna getFabryka(String typFabryki) {

        if (typFabryki.equalsIgnoreCase("FIGURY")) {
            return new FabrykaFigur();
        } else if (typFabryki.equalsIgnoreCase("KOLORY")) {
            return new FabrykaKolorow();
        }

        return null;
    }
}

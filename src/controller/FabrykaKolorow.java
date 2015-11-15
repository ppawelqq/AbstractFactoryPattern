package controller;

import kolory.Czerwony;
import kolory.Zielony;
import kolory.Zolty;
import service.FiguraService;
import service.KolorService;

public class FabrykaKolorow extends FabrykaAbstrakcyjna {

    @Override
    KolorService getKolor(String kolor) {
        if (kolor.equalsIgnoreCase("CZERWONY")) {
            return new Czerwony();
        } else if (kolor.equalsIgnoreCase("ZIELONY")) {
            return new Zielony();
        } else if (kolor.equalsIgnoreCase("ZOLTY")) {
            return new Zolty();
        }
        return null;
    }

    @Override
    FiguraService getFigura(String figura) {
        return null;
    }

}

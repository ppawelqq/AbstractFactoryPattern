package controller;

import figury.Kolo;
import figury.Kwadrat;
import figury.Prostokat;
import service.FiguraService;
import service.KolorService;

public class FabrykaFigur extends FabrykaAbstrakcyjna {

    @Override
    KolorService getKolor(String kolor) {
        return null;
    }

    @Override
    FiguraService getFigura(String typFigury) {
        if (typFigury.equalsIgnoreCase("PROSTOKAT")) {
            return new Prostokat();
        } else if (typFigury.equalsIgnoreCase("KWADRAT")) {
            return new Kwadrat();
        } else if (typFigury.equalsIgnoreCase("KOLO")) {
            return new Kolo();
        }
        return null;
    }

}

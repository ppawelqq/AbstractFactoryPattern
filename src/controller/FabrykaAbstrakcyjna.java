package controller;

import service.FiguraService;
import service.KolorService;

public abstract class FabrykaAbstrakcyjna {
    abstract KolorService getKolor(String kolor);
    abstract FiguraService getFigura(String figura);
}

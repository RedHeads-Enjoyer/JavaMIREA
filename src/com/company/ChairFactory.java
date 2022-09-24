package com.company;

public class ChairFactory implements AbsctractChairFactory{

    @Override
    public VictorianChair createVictorianChair() {
        VictorianChair victorianChair;
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}

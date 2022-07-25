package coreJava;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {

    public static void main(String[] args) {
        //Interface - class
        //Interface will have methods but not body
        CentralTraffic a = new AustralianTraffic();
        a.redStop();
        a.flashYellow();
        a.greenGO();

        AustralianTraffic at = new AustralianTraffic();
        ContinentTraffic ct = new AustralianTraffic();
        at.walkOnSymbol();
        ct.trainSymbol();

    }

    @Override
    public void greenGO() {
        //code
        System.out.println("greengo implementation");
    }

    @Override
    public void redStop() {
        //code
        System.out.println("redstop implementation");

    }

    public void walkOnSymbol() {
        System.out.println("walking");
    }

    @Override
    public void flashYellow() {
        System.out.println("flashyellow implementation");

    }

    @Override
    public void trainSymbol() {
        System.out.println("Train");
    }


}


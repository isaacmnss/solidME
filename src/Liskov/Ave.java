package Liskov;

import jdk.jshell.spi.ExecutionControl;

public class Ave {
    void voar(){
        System.out.println("voando");
    }
}

class Penguin extends Ave{
    void voar(){
        throw new UnsupportedOperationException("Penguim não voa");
    }
}


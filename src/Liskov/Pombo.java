package Liskov;

interface ave{

}

interface voador{
    void voar();
}

class Pombo implements ave, voador{
    @Override
    public void voar() {
        System.out.println("voando");
    }
}

class Pinguim implements ave{

}

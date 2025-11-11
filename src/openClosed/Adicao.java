package openClosed;

public class Adicao implements Operacao{
    private double a;
    private double b;
    private double resultado = 0D;

    @Override
    public void executar(){
        resultado = a + b;
    }

    public Adicao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

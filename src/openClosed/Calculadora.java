package openClosed;

public class Calculadora {
    public void calcular(Operacao operacao){
        if (operacao instanceof Adicao){
            Adicao adicao = (Adicao) operacao;
        }
    }
}

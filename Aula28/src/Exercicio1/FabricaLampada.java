package Exercicio1;

public class FabricaLampada {
    public Object construir(String tipoLampada) {
        if (tipoLampada.equals("1") || tipoLampada.equals("incandescente")) {
            return new Incandescente();
        } else if (tipoLampada.equals("2") || tipoLampada.equals("fluorescente")) {
            return new Fluorescente();
        } else {
            return null;
        }
    }
}

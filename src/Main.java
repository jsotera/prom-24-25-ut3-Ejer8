public class Main {
    public static void main(String[] args) {

        String tamano = "grande";
        String tipoMasa = "gruesa";
        String ingredientes = "queso, tomate, mozarela, pepperoni, roquefort";

        Pizza cuatroQuesos = new Pizza(tamano, tipoMasa, ingredientes);

        boolean estaOK = cuatroQuesos.validarPedido();
        if(estaOK){
            System.out.println("Pedido correctamente realizado");
        } else {
            System.out.println("Revisa tu pedido, por favor, algo no esta bien");
        }
    }
}
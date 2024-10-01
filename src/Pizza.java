public class Pizza {

    public String tamano;
    public String tipoMasa;
    public String ingredientes;

    public Pizza(String tamano, String tipoMasa, String ingredientes) {
        this.tamano = tamano;
        this.tipoMasa = tipoMasa;
        this.ingredientes = ingredientes;
    }

    public boolean validarPedido(){
        boolean elPedidoEsCorrecto = false;
        if(this.tamano.contains("grande") || this.tamano.contains("mediana")){
            if(this.tipoMasa.contains("gruesa")){
                if(this.ingredientes.contains("pepperoni")
                        && this.ingredientes.contains("tomate")
                        && this.ingredientes.contains("queso")){
                    // Si, se pueden poner todas las condiciones en un IF mas grande
                    elPedidoEsCorrecto = true;
                }
            }
        }
        return elPedidoEsCorrecto;
    }
}

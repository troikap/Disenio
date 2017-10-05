
package main;

public class ComboItem {
    
    private String clave;
    private String valor;

    public ComboItem(String clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return clave;
    }

    public String getKey() {
        return clave;
    }

    public String getValue() {
        return valor;
    
    }
}

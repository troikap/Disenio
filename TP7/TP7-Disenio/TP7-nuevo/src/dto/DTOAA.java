
package dto;

public class DTOAA {
    
    private String codigo;
    private String nombre;
    private int orden;

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
    

    /**
     * @return the codigoAtributoAdicional
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigoAtributoAdicional the codigoAtributoAdicional to set
     */
    public void setCodigo(String codigoAtributoAdicional) {
        this.codigo = codigoAtributoAdicional;
    }

    /**
     * @return the nombreAtributoAdicional
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombreAtributoAdicional the nombreAtributoAdicional to set
     */
    public void setNombre(String nombreAtributoAdicional) {
        this.nombre = nombreAtributoAdicional;
    }
    
}

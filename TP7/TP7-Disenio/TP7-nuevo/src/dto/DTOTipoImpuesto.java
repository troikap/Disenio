
package dto;

public class DTOTipoImpuesto {
    
    private String codigoDTOTipoImpuesto;
    private boolean eliminar;
    private String nombreDTOTipoImpuesto;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    /**
     * @return the codigoDTOTipoImpuesto
     */
    public String getCodigoDTOTipoImpuesto() {
        return codigoDTOTipoImpuesto;
    }

    /**
     * @param codigoDTOTipoImpuesto the codigoDTOTipoImpuesto to set
     */
    public void setCodigoDTOTipoImpuesto(String codigoDTOTipoImpuesto) {
        this.codigoDTOTipoImpuesto = codigoDTOTipoImpuesto;
    }

    /**
     * @return the eliminar
     */
    public boolean isEliminar() {
        return eliminar;
    }

    /**
     * @param eliminar the eliminar to set
     */
    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }

    /**
     * @return the nombreDTOTipoImpuesto
     */
    public String getNombreDTOTipoImpuesto() {
        return nombreDTOTipoImpuesto;
    }

    /**
     * @param nombreDTOTipoImpuesto the nombreDTOTipoImpuesto to set
     */
    public void setNombreDTOTipoImpuesto(String nombreDTOTipoImpuesto) {
        this.nombreDTOTipoImpuesto = nombreDTOTipoImpuesto;
    }
    
}

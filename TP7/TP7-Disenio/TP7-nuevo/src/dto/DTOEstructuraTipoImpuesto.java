
package dto;

import java.util.ArrayList;
import java.util.List;

public class DTOEstructuraTipoImpuesto {
    
    private String codigoDTOTipoImpuesto;
    private String nombreDTOTipoImpuesto;
    private List<DTOAtributoAdicional> dtoAtributoAdicionalList = new ArrayList<>();

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

    /**
     * @return the DTOAtributoAdicionalList
     */
    public List<DTOAtributoAdicional> getDTOAtributoAdicionalList() {
        return dtoAtributoAdicionalList;
    }

    /**
     * @param DTOAtributoAdicionalList the DTOAtributoAdicionalList to set
     */
    public void setDTOAtributoAdicionalList(List<DTOAtributoAdicional> dtoAtributoAdicionalList) {
        this.dtoAtributoAdicionalList = dtoAtributoAdicionalList;
    }
    public void addDTOAtributoAdicionalList(DTOAtributoAdicional nuevoAtributo) {
        dtoAtributoAdicionalList.add(nuevoAtributo);
    }
}

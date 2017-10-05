
package entidades;

import java.util.Date;
import java.util.*;
public class TipoImpuesto extends Entidad {
    
    private String codigoTipoImpuesto;
    private String fechaInhabilitacionTI;
    private List<NumeracionAtributo> numeracionAtributoList = new ArrayList<>();
    private String nombreTipoImpuesto;
    
    public TipoImpuesto ()
    {
    }
    
    public String getCodigoTipoImpuesto()
    {
        return codigoTipoImpuesto;
    }
    
    public void setCodigoTipoImpuesto(String codigoTipoImpuesto)
    {
        this.codigoTipoImpuesto = codigoTipoImpuesto;
    }
    
    public String getFechaInhabilitacionTI()
    {
        return fechaInhabilitacionTI;
    }
    
    public void setFechaInhabilitacionTI(String fechaInhabilitacionTI)
    {
        this.fechaInhabilitacionTI = fechaInhabilitacionTI;
    }
    
    public String getNombreTipoImpuesto()
    {
        return nombreTipoImpuesto;
    }
    
    public void setNombreTipoImpuesto(String nombreTipoImpuesto)
    {
        this.nombreTipoImpuesto = nombreTipoImpuesto;
    }
    
    public List<NumeracionAtributo> getNumeracionAtributoList ()
    {
        return numeracionAtributoList;
    }
    
    public void setNumeracionAtributoList (List<NumeracionAtributo> numeracionAtributoList)
    {
        this.numeracionAtributoList = numeracionAtributoList;
    }

    public void addNumeracionAtributoList (NumeracionAtributo numeracionAtributo)
    {
        numeracionAtributoList.add(numeracionAtributo);
    }
    
}

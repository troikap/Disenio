package entidades;

import java.util.Date;
import java.util.*;

public class TipoImpuesto extends Entidad
{

    private String codigoTipoImpuesto;
    private Date fechaInhabilitacionTI;
    private String nombreTipoImpuesto;
    private List<NumeracionAtributo> numeracionAtributoList = new ArrayList<>();

    public TipoImpuesto ()
    {
    }

    public String getCodigoTipoImpuesto ()
    {
        return codigoTipoImpuesto;
    }

    public void setCodigoTipoImpuesto (String codigo)
    {
        this.codigoTipoImpuesto = codigo;
    }
    
    public String getNombreTipoImpuesto ()
    {
        return nombreTipoImpuesto;
    }

    public void setNombreTipoImpuesto (String nombre)
    {
        this.nombreTipoImpuesto = nombre;
    }

    public Date getFechaInhabilitacionTI ()
    {
        return fechaInhabilitacionTI;
    }

    public void setFechaInhabilitacionTI (Date fechaInhabilitacion)
    {
        this.fechaInhabilitacionTI = fechaInhabilitacion;
    }

    public List<NumeracionAtributo> getNumeracionAtributoList ()
    {
        return numeracionAtributoList;
    }

    public void setDetalleReposicionList (List<NumeracionAtributo> numeracionAtributoList)
    {
        this.numeracionAtributoList = numeracionAtributoList;
    }

    public void addNumeracionAtributoList (NumeracionAtributo numeracionAtributo)
    {
        numeracionAtributoList.add(numeracionAtributo);
    }

}

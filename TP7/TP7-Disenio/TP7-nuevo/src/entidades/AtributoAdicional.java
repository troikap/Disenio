package entidades;

import java.util.Date;

public class AtributoAdicional extends Entidad
{

    private String codigoAtributoAdicional;
    private Date fechaInhabilitacionAA;
    private int longitud;
    private String nombreAtributoAdicional;
    
    public AtributoAdicional ()
    {
    }
    
    public String getCodigoAtributoAdicional()
    {
        return codigoAtributoAdicional;
    }
    
    public void setCodigoAtributoAdicional(String codigoAtributoAdicional)
    {
        this.codigoAtributoAdicional = codigoAtributoAdicional;
    }
    
    public Date getFechaInhabilitacionAA()
    {
        return fechaInhabilitacionAA;
    }
    
    public void setFechaInhabilitacionAA(Date fechaInhabilitacionAA)
    {
        this.fechaInhabilitacionAA = fechaInhabilitacionAA;
    }
    
    public int getLongitud()
    {
        return longitud;
    }
    
    public void setLongitud(int longitud)
    {
        this.longitud = longitud;
    }
    
    public String getNombreAtributoAdicional()
    {
        return nombreAtributoAdicional;
    }
    
    public void setNombreAtributoAdicional(String nombreAtributoAdicional)
    {
        this.nombreAtributoAdicional = nombreAtributoAdicional;
    }

}
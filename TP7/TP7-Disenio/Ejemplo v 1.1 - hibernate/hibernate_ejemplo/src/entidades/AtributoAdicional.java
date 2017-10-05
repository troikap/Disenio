package entidades;

import java.util.Date;

public class AtributoAdicional extends Entidad
{

    private int longitud;
    private String nombreAtributoAdicional;
    private String codigoAtributoAdicional;
    private Date fechaInhabilitacionAA;
    
    public AtributoAdicional ()
    {
    }

    public int getLongitud ()
    {
        return longitud;
    }

    public void setLongitud (int longitud)
    {
        this.longitud = longitud;
    }

    public String getNombreAtributoAdicional ()
    {
        return nombreAtributoAdicional;
    }

    public void setNombreAtributoAdicional (String nombre)
    {
        this.nombreAtributoAdicional = nombre;
    }
    
    public String getCodigoAtributoAdicional ()
    {
        return codigoAtributoAdicional;
    }

    public void setCodigoAtributoAdicional (String codigo)
    {
        this.codigoAtributoAdicional = codigo;
    }
    
    public Date getFechaInhabilitacionAA ()
    {
        return fechaInhabilitacionAA;
    }

    public void setFechaInhabilitacionAA (Date fecha)
    {
        this.fechaInhabilitacionAA = fecha;
    }

}

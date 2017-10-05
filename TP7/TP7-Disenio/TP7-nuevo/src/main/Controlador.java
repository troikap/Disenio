package main;
import java.util.*;
import dto.*;
import java.text.ParseException;
public class Controlador
{

    private Experto experto = (Experto) FabricaExpertos.getInstancia().crearExperto("CU1");

    public List<DTOTipoImpuesto> BuscarTipoImpuesto(String a,boolean b) 
    {
        
        return experto.BuscarTipoImpuesto(a,b);
    }

    public void EliminarTipoImpuesto(DTOImpuestoSeleccionado a) 
    {
        experto.EliminarTipoImpuesto(a);
       
    }
    
    public List<DTOAA> ObtenerAributoAdicional()
    {
        return experto.ObtenerAributoAdicional();
    }
    
    public void GuardarTipoImpuestoAA(DTOEstructuraTipoImpuesto dtoEst, boolean Agregar)
    {
        experto.GuardarTipoImpuestoAA(dtoEst, Agregar);
    }
    
    public DTOEstructuraTipoImpuesto TraerEstructuraTI( DTOTipoImpuesto dtoTI)
    {
       return experto.TraerEstructuraTI(dtoTI); 
    }
    
    public DTOEstructuraTipoImpuesto TraerEstructuraTI( DTOImpuestoSeleccionado dtoTI)
    {
       return experto.TraerEstructuraTI(dtoTI); 
    }
    
    /*public void ModificarEstructuraTipoImpuesto(DTOImpuestoSeleccionado dtoIS)
    {
        experto.ModificarEstructuraTipoImpuesto(dtoIS);
    }*/
}

package main;

import entidades.TipoImpuesto;
import java.util.List;
import java.util.ArrayList;
import dto.*;
import java.text.ParseException;
public class Decorador extends Experto
{

    //@Override
    public List<DTOTipoImpuesto> BuscarTipoImpuesto (String a, boolean b) 
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        List<DTOTipoImpuesto> lista = super.BuscarTipoImpuesto(a, b);
        FachadaInterna.getInstance().finalizarTransaccion();
        return lista;
    }
    
    public void EliminarTipoImpuesto(DTOImpuestoSeleccionado a) 
    {
        
        FachadaInterna.getInstance().iniciarTransaccion();
        super.EliminarTipoImpuesto(a);
        FachadaInterna.getInstance().finalizarTransaccion();
    }

    public List<DTOAA> ObtenerAributoAdicional()
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        List<DTOAA> a = super.ObtenerAributoAdicional();
        FachadaInterna.getInstance().finalizarTransaccion();
        return a;
    }
    
    public void GuardarTipoImpuestoAA(DTOEstructuraTipoImpuesto dtoEst, boolean Agregar)
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        super.GuardarTipoImpuestoAA(dtoEst, Agregar);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    
    public DTOEstructuraTipoImpuesto TraerEstructuraTI( DTOTipoImpuesto dtoTI)
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        DTOEstructuraTipoImpuesto q = super.TraerEstructuraTI(dtoTI); 
        FachadaInterna.getInstance().finalizarTransaccion();
        return q;
    }
    
    public DTOEstructuraTipoImpuesto TraerEstructuraTI( DTOImpuestoSeleccionado dtoTI)
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        DTOEstructuraTipoImpuesto w = super.TraerEstructuraTI(dtoTI); 
        FachadaInterna.getInstance().finalizarTransaccion();
        return w;
    }
    
    /*public void ModificarEstructuraTipoImpuesto(DTOImpuestoSeleccionado dtoIS)
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        super.ModificarEstructuraTipoImpuesto(dtoIS);
        FachadaInterna.getInstance().finalizarTransaccion();
        
    }*/
    
    
    
}


 package main;

import entidades.*;
import java.util.*;

public class Experto
{

    public void Metodo ()
    {
        TipoImpuesto nueva = new TipoImpuesto();
        nueva.setFechaInhabilitacionTI(new Date());
        nueva.setCodigoTipoImpuesto("7");
        nueva.setNombreTipoImpuesto("holis");
        FachadaPersistencia.getInstance().guardar(nueva);
        /*List<DTOCriterio> criterioList = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("numero");
        criterio1.setOperacion("=");
        criterio1.setValor(3);
        criterioList.add(criterio1);

        TipoImpuesto reposicion = (TipoImpuesto) FachadaPersistencia.getInstance().buscar("Reposicion", criterioList).get(0);

        //Acá se realizan los gets que no afectan en nada
        
        for (NumeracionAtributo detalleReposicion : reposicion.getDetalleReposicionList())
        {
            detalleReposicion.getCantidad();
            AtributoAdicional articulo = detalleReposicion.getArticulo();
            articulo.getCodigo();
        }

        TipoImpuesto nueva = new TipoImpuesto();
        nueva.setFecha(new Date());
        nueva.setNumero(7);

        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("codigo");
        criterio2.setOperacion("=");
        criterio2.setValor(1);
        criterioList.clear();
        criterioList.add(criterio2);

        

        

        NumeracionAtributo nuevoDetalle = new NumeracionAtributo();
        nuevoDetalle.setCantidad(5);

        DTOCriterio criterio3 = new DTOCriterio();
        criterio3.setAtributo("codigo");
        criterio3.setOperacion("=");
        criterio3.setValor(5);
        criterioList.clear();
        criterioList.add(criterio3);

        AtributoAdicional a = (AtributoAdicional) FachadaPersistencia.getInstance().buscar("Articulo", criterioList).get(0);

        nuevoDetalle.setArticulo(a);
        reposicion.addDetalleReposicionList(nuevoDetalle);

        
        
        
        FachadaPersistencia.getInstance().guardar(nueva);
        FachadaPersistencia.getInstance().guardar(nuevoDetalle);
                */
    }

}

package main;

import entidades.*;
import java.util.*;
import dto.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Experto
{
    private TipoImpuesto tipoImpuesto;
    public String nuevaFecha()
        {
            String algo= "";
            try {
                //para agregar fecha nueva en formato my sql
                Date nuevoDia= new Date();
                SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
            
                Object date = dt.parse(DateFormat.getDateInstance().format(nuevoDia));
                SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
                algo=dt1.format(date);
                //System.out.println(algo);
                } catch (ParseException ex) 
                    {
                    Logger.getLogger(Experto.class.getName()).log(Level.SEVERE, null, ex);
                    }
            return algo;
        }
    
    public List<DTOTipoImpuesto> BuscarTipoImpuesto (String nombre,boolean habilitado) 
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("fechaInhabilitacionTI");
            criterio1.setOperacion("isNull");
            criterio1.setValor(null);
            criterioList.clear();
            if (habilitado) {criterioList.add(criterio1);}
            DTOCriterio criterio2 = new DTOCriterio();
            criterio2.setAtributo("nombreTipoImpuesto");
            criterio2.setOperacion("LIKE");
            criterio2.setValor(nombre);
            if (nombre != null)criterioList.add(criterio2);
            List<Object> busqueda = FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList);
            List<DTOTipoImpuesto> listdtoTI1 = new ArrayList<>();
            for (Object entidad : busqueda) {
                DTOTipoImpuesto dto = new DTOTipoImpuesto();
                dto.setCodigoDTOTipoImpuesto(((TipoImpuesto)entidad).getCodigoTipoImpuesto());
                dto.setNombreDTOTipoImpuesto(((TipoImpuesto)entidad).getNombreTipoImpuesto());
                dto.setEliminar(false);
                String f = ((TipoImpuesto)entidad).getFechaInhabilitacionTI();
                if (f!=null){
                dto.setFecha(f);
                }
                else dto.setFecha("SI");
                listdtoTI1.add(dto);
            }
            return listdtoTI1;
        }   
    
    public void GuardarTipoImpuestoAA(DTOEstructuraTipoImpuesto dtoEst, boolean Agregar)
        {
            if (Agregar == true)
            {
                System.out.println("AGREGAR");
                TipoImpuesto nuevoTipoImpuesto = new TipoImpuesto();
                nuevoTipoImpuesto.setCodigoTipoImpuesto(dtoEst.getCodigoDTOTipoImpuesto());
                nuevoTipoImpuesto.setNombreTipoImpuesto(dtoEst.getNombreDTOTipoImpuesto());
                nuevoTipoImpuesto.setFechaInhabilitacionTI(null);
                List<DTOAtributoAdicional> listaAA = dtoEst.getDTOAtributoAdicionalList();
                int contador = 0;
                for(DTOAtributoAdicional Aa : listaAA)
                        {
                            int contadordemierda = 0;
                            for(DTOAtributoAdicional AA : listaAA)
                            {
                                if (contadordemierda!=0) break;
                                if ( Aa != AA )
                                {
                                    int orden = AA.getOrden();
                                    if (Aa.getOrden() == orden){
                                        JOptionPane.showMessageDialog(null, "Orden "+orden+" Repetido.                  1/1");                           //orden REPETIDO
                                        contador+=1;
                                        contadordemierda+=1;
                                    }
                                    String atributo = AA.getCodigoAtributoAdicional();
                                    String atributo2 = Aa.getCodigoAtributoAdicional();
                                    if (atributo2.equals(atributo)){
                                        JOptionPane.showMessageDialog(null, "Atributo "+atributo+" Repetido.                    2/1");                      //atributo REPETIDO
                                        contador+=1;
                                        contadordemierda+=1;
                                    }
                                }
                            }
                            if (contador!=0) break;
                        }
                if (contador == 0){
                for (DTOAtributoAdicional dtoAA : listaAA)
                    {
                        List<DTOCriterio> criterioList2 = new ArrayList<>();
                        DTOCriterio criterio2 = new DTOCriterio();
                        criterio2.setAtributo("codigoAtributoAdicional");
                        criterio2.setOperacion("LIKEFULL");
                        criterio2.setValor(dtoAA.getCodigoAtributoAdicional());
                        criterioList2.clear();
                        criterioList2.add(criterio2);
                        AtributoAdicional AtAd= (AtributoAdicional)FachadaPersistencia.getInstance().buscar("AtributoAdicional", criterioList2).get(0);
                        NumeracionAtributo numAt = new NumeracionAtributo();
                        numAt.setOrden(dtoAA.getOrden());
                        numAt.setAtributoAdicional(AtAd);
                        nuevoTipoImpuesto.addNumeracionAtributoList(numAt);
                        FachadaPersistencia.getInstance().guardar(numAt);
                    }
                    FachadaPersistencia.getInstance().guardar(nuevoTipoImpuesto);
                }
            }
            else
            {
                System.out.println("MODIFICAR");
                int contador = 0;
                List<DTOAtributoAdicional> listaAA = dtoEst.getDTOAtributoAdicionalList();
                for(DTOAtributoAdicional Aa : listaAA)
                        {
                            int contadorctm=0;
                            for(DTOAtributoAdicional AA : listaAA)
                            {
                                if (contadorctm!=0) break;
                                if ( Aa != AA )
                                {
                                    int orden = AA.getOrden();
                                    if (Aa.getOrden() == orden){
                                        JOptionPane.showMessageDialog(null, "Orden "+orden+" Repetido.                      1/2");                               //orden REPETIDO
                                        System.out.println("1 error en  "+orden);
                                        contador+=1;
                                        contadorctm+=1;
                                        
                                    }
                                    String atributo = AA.getCodigoAtributoAdicional();
                                    String atributo2 = Aa.getCodigoAtributoAdicional();
                                    if (atributo2.equals(atributo)){
                                        JOptionPane.showMessageDialog(null, "Atributo "+atributo+" Repetido.                        2/2");                         //atributo REPETIDO
                                        System.out.println("2 error en  "+atributo);
                                        contador+=1;
                                        contadorctm+=1;
                                    }
                                }
                                
                            }
                            if (contador != 0) break;
                        }
                    List<DTOCriterio> criterioList = new ArrayList<>();                                                             //busqueda de la instancia TipoImpuesto
                    DTOCriterio criterio1 = new DTOCriterio();
                    criterio1.setAtributo("codigoTipoImpuesto");
                    criterio1.setOperacion("LIKEFULL");
                    criterio1.setValor(dtoEst.getCodigoDTOTipoImpuesto());
                    criterioList.clear();
                    criterioList.add(criterio1);
                    TipoImpuesto TipoImp = (TipoImpuesto)FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList).get(0);
                    List<NumeracionAtributo> controlNumeracion = TipoImp.getNumeracionAtributoList();    
                    int contador1=0;
                    int contador2=0;
                    for (NumeracionAtributo numA : controlNumeracion)
                    {
                        contador1+=1;
                    }
                    for (DTOAtributoAdicional Aa : listaAA)
                    {
                        contador2+=1;
                    }
                    int contadorOrden = 0;
                    if (contador1 == contador2)
                    {
                        for (NumeracionAtributo controlNum : controlNumeracion)                                                     //para controlar que la modificacion sea nula
                        {
                            contadorOrden+=1;
                            for (DTOAtributoAdicional Aa : listaAA)
                            {
                                if(controlNum.getOrden() == Aa.getOrden())
                                {
                                    String atributoA = controlNum.getAtributoAdicional().getCodigoAtributoAdicional();
                                    String atributoB = Aa.getCodigoAtributoAdicional();
                                    if(atributoA.equals(atributoB)) 
                                    {
                                        if (contadorOrden==contador1) 
                                        {
                                            contador+=1;
                                        }
                                        break;
                                    }}}}
                    }    
                if (contador == 0){
                    List<NumeracionAtributo> ListNA = new ArrayList<>();
                    List<DTOAtributoAdicional> ListAA = dtoEst.getDTOAtributoAdicionalList();
                    TipoImp.setNombreTipoImpuesto(dtoEst.getNombreDTOTipoImpuesto());
                    for(DTOAtributoAdicional dtoAtrAdi : ListAA)
                        {
                            NumeracionAtributo nuevoNA = new NumeracionAtributo();
                            nuevoNA.setOrden(dtoAtrAdi.getOrden());
                            List<DTOCriterio> criterioList3 = new ArrayList<>();
                    
                            DTOCriterio criterio3 = new DTOCriterio();
                            criterio3.setAtributo("codigoAtributoAdicional");
                            criterio3.setOperacion("LIKEFULL");
                            criterio3.setValor(dtoAtrAdi.getCodigoAtributoAdicional());
                            criterioList3.clear();
                            criterioList3.add(criterio3);
                            AtributoAdicional atributoadicional= (AtributoAdicional)FachadaPersistencia.getInstance().buscar("AtributoAdicional", criterioList3).get(0);
                            nuevoNA.setAtributoAdicional(atributoadicional);
                            ListNA.add(nuevoNA);
                            FachadaPersistencia.getInstance().guardar(nuevoNA);
                        }    
                    TipoImp.setNumeracionAtributoList(ListNA);
                    FachadaPersistencia.getInstance().guardar(TipoImp); 
                }
                else {
                    System.out.println("Modificacion anulada por no haber ninguna modificacion");
                }}}
   
    public void EliminarTipoImpuesto(DTOImpuestoSeleccionado dtoTipoImpSeleccionado)
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoTipoImpuesto");
            criterio1.setOperacion("LIKE");
            criterio1.setValor(dtoTipoImpSeleccionado.getCodigo());
            criterioList.clear();
            criterioList.add(criterio1);
            TipoImpuesto eliminarTI = (TipoImpuesto)FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList).get(0);
            String alfa = nuevaFecha();
            eliminarTI.setFechaInhabilitacionTI(alfa);
            FachadaPersistencia.getInstance().guardar(eliminarTI);
        }
    
    public List<DTOAA> ObtenerAributoAdicional()
        {
            //List<DTOAA> listAA = new ArrayList<>(); 
            List<DTOCriterio> criterioList2 = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("fechaInhabilitacionAA");
            criterio1.setOperacion("isNull");
            criterio1.setValor(null);
            criterioList2.clear();
            criterioList2.add(criterio1); 
            List<Object> busqueda = FachadaPersistencia.getInstance().buscar("AtributoAdicional", criterioList2);
            List<DTOAA> listdtoAA1 = new ArrayList<>();
            for (Object entidad : busqueda) 
                {
                    DTOAA dtoAA = new DTOAA();
                    dtoAA.setCodigo(((AtributoAdicional)entidad).getCodigoAtributoAdicional());
                    dtoAA.setNombre(((AtributoAdicional)entidad).getNombreAtributoAdicional());
                    listdtoAA1.add(dtoAA);
                }
            return listdtoAA1;
        }
    
    public DTOEstructuraTipoImpuesto TraerEstructuraTI( DTOImpuestoSeleccionado dtoIS)
        {
            DTOEstructuraTipoImpuesto dtoEstTI= new DTOEstructuraTipoImpuesto();
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoTipoImpuesto");
            criterio1.setOperacion("LIKE");
            criterio1.setValor(dtoIS.getCodigo());
            criterioList.clear();
            criterioList.add(criterio1);
            TipoImpuesto TI= (TipoImpuesto)FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList).get(0);
            dtoEstTI.setCodigoDTOTipoImpuesto(TI.getCodigoTipoImpuesto());
            dtoEstTI.setNombreDTOTipoImpuesto(TI.getNombreTipoImpuesto());
            List<NumeracionAtributo> NA = new ArrayList<>();
            NA = TI.getNumeracionAtributoList();
            for (NumeracionAtributo NumAt : NA)
            {
                DTOAtributoAdicional dtoAtrAdi2 = new DTOAtributoAdicional();
                dtoAtrAdi2.setOrden(NumAt.getOrden());
                dtoAtrAdi2.setCodigoAtributoAdicional( NumAt.getAtributoAdicional().getCodigoAtributoAdicional());
                dtoAtrAdi2.setNombreAtributoAdicional( NumAt.getAtributoAdicional().getNombreAtributoAdicional());
           
                dtoEstTI.addDTOAtributoAdicionalList(dtoAtrAdi2);
            }
        return dtoEstTI; 
    }
    
    public DTOEstructuraTipoImpuesto TraerEstructuraTI( DTOTipoImpuesto dtoTI)
        {
            DTOEstructuraTipoImpuesto dtoEstTI2= new DTOEstructuraTipoImpuesto();
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoTipoImpuesto");
            criterio1.setOperacion("LIKE");
            criterio1.setValor(dtoTI.getCodigoDTOTipoImpuesto());
            criterioList.clear();
            criterioList.add(criterio1);
            TipoImpuesto TI2= (TipoImpuesto)FachadaPersistencia.getInstance().buscar("TipoImpuesto", criterioList).get(0);
            dtoEstTI2.setCodigoDTOTipoImpuesto(TI2.getCodigoTipoImpuesto());
            dtoEstTI2.setNombreDTOTipoImpuesto(TI2.getNombreTipoImpuesto());
            List<NumeracionAtributo> NA = new ArrayList<>();
            NA = TI2.getNumeracionAtributoList();
            for (NumeracionAtributo NumAt2 : NA)
            {
                DTOAtributoAdicional dtoAtrAdi3 = new DTOAtributoAdicional();
                dtoAtrAdi3.setOrden(NumAt2.getOrden());
                dtoAtrAdi3.setCodigoAtributoAdicional( NumAt2.getAtributoAdicional().getCodigoAtributoAdicional());
                dtoAtrAdi3.setNombreAtributoAdicional( NumAt2.getAtributoAdicional().getNombreAtributoAdicional());
                dtoEstTI2.addDTOAtributoAdicionalList(dtoAtrAdi3);
            }
        return dtoEstTI2; 
    }
    
    public void SalirABM()
        {
        
        }
    
    public TipoImpuesto getTipoImpuesto() 
        {
        return tipoImpuesto;
        }
    public void setTipoImpuesto(TipoImpuesto tipoImpuesto) 
        {
            this.tipoImpuesto = tipoImpuesto;
        }
    }
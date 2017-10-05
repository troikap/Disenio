package main;

import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.*;

public class FachadaInterna
{

    private static FachadaInterna fachadaInterna;

    public FachadaInterna ()
    {
    }

    public static FachadaInterna getInstance ()
    {
        if (fachadaInterna == null)
        {
            fachadaInterna = new FachadaInterna();
        }
        return fachadaInterna;
    }

    public List<Object> buscar (String claseABuscar, List<DTOCriterio> criterioList)
    {
        Criteria cr = null;
        try
        {
            cr = HibernateUtil.getSession().createCriteria(Class.forName("entidades." + claseABuscar), claseABuscar.toLowerCase());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error creating criteria. " + e);
        }
        if (criterioList != null)
        {
            for (DTOCriterio criterio : criterioList)
            {
                String atributo = criterio.getAtributo();
                String operacion = criterio.getOperacion();
                Object valor = criterio.getValor();

                switch (operacion)
                {
                    case "=":
                        cr.add(Restrictions.conjunction(Restrictions.eq(atributo, valor)));
                        break;
                    
                    case "<":
                        cr.add(Restrictions.conjunction(Restrictions.lt(atributo, valor)));
                        break;
                    case ">":
                        cr.add(Restrictions.conjunction(Restrictions.gt(atributo, valor)));
                        break;
                    case "<=":
                        cr.add(Restrictions.conjunction(Restrictions.le(atributo, valor)));
                        break;
                    case ">=":
                        cr.add(Restrictions.conjunction(Restrictions.ge(atributo, valor)));
                        break;
                    case "<>":
                        cr.add(Restrictions.conjunction(Restrictions.ne(atributo, valor)));

                        break;
                    case "contains":
                        //Todos las colecciones deben empezar de la siguiente manera: claseColeccionList
                        //Generamos el nombre de esa colección a partir del atributo
                        String lista = String.valueOf(atributo.charAt(0))
                                .toLowerCase() + atributo.substring(1) + "List"; //materiaList, detalleReposicionList
                        cr.createAlias(lista, "lista")
                                .add(Restrictions.conjunction(Restrictions.eq("lista.OID" + claseABuscar, ((entidades.Entidad) valor).getOID())));
                        break;
                    //mios
                    case "LIKE":
                        String t= valor.toString();
                        cr.add(Restrictions.conjunction(Restrictions.like(atributo, t, MatchMode.ANYWHERE)));
                        
                        break;
                    case "LIKEFULL":
                        String r= valor.toString();
                        cr.add(Restrictions.conjunction(Restrictions.like(atributo, r, MatchMode.EXACT)));
                        
                        break;
                    case "ILIKE":
                        String e= valor.toString();
                        cr.add(Restrictions.conjunction(Restrictions.ilike(atributo, e, MatchMode.ANYWHERE)));
                        
                        break;
                    case "ILIKEFULL":
                        String f= valor.toString();
                        cr.add(Restrictions.conjunction(Restrictions.ilike(atributo, f, MatchMode.EXACT)));
                        
                        break;
                    case "isNull":
                        cr.add(Restrictions.conjunction(Restrictions.isNull(atributo)));
                        break;       
                    case "isNotNull":
                        cr.add(Restrictions.conjunction(Restrictions.isNotNull(atributo)));
                        break;  
                }

            }
        }
       

        return cr.list();

    }

    public void guardar (Object objeto)
    {
        HibernateUtil.getSession().saveOrUpdate(objeto);
    }

    public void iniciarTransaccion ()
    {
        HibernateUtil.getSession().beginTransaction();
    }

    public void finalizarTransaccion ()
    {
        HibernateUtil.getSession().getTransaction().commit();
        HibernateUtil.getSession().close();
        HibernateUtil.getSessionFactory().close();
    }

}

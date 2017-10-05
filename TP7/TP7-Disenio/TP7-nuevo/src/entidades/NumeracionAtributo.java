
package entidades;

public class NumeracionAtributo extends Entidad {
   
    private int orden;
    private AtributoAdicional atributoAdicional;
    
    public NumeracionAtributo ()
    {
    }
    
    public int getOrden()
    {
        return orden;
    }
    
    public void setOrden(int orden)
    {
        this.orden = orden;
    }
    
    public AtributoAdicional getAtributoAdicional()
    {
        return atributoAdicional;
    }
    
    public void setAtributoAdicional(AtributoAdicional atributoAdicional)
    {
        this.atributoAdicional = atributoAdicional;
    }
    
}

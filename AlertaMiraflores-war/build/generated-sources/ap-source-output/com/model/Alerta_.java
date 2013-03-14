package com.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-13T18:25:18")
@StaticMetamodel(Alerta.class)
public class Alerta_ { 

    public static volatile SingularAttribute<Alerta, Integer> id;
    public static volatile SingularAttribute<Alerta, String> terminalcrea;
    public static volatile SingularAttribute<Alerta, String> titulo;
    public static volatile SingularAttribute<Alerta, Date> fechacreacion;
    public static volatile SingularAttribute<Alerta, String> descripcion;
    public static volatile SingularAttribute<Alerta, Long> desLatitud;
    public static volatile SingularAttribute<Alerta, Long> desLongitud;
    public static volatile SingularAttribute<Alerta, Date> fechamodifica;
    public static volatile SingularAttribute<Alerta, String> terminalmodifica;

}
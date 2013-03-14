/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO 05
 */
@Entity
@Table(name = "alerta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alerta.findAll", query = "SELECT a FROM Alerta a"),
    @NamedQuery(name = "Alerta.findById", query = "SELECT a FROM Alerta a WHERE a.id = :id"),
    @NamedQuery(name = "Alerta.findByTitulo", query = "SELECT a FROM Alerta a WHERE a.titulo = :titulo"),
    @NamedQuery(name = "Alerta.findByDescripcion", query = "SELECT a FROM Alerta a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Alerta.findByDesLatitud", query = "SELECT a FROM Alerta a WHERE a.desLatitud = :desLatitud"),
    @NamedQuery(name = "Alerta.findByDesLongitud", query = "SELECT a FROM Alerta a WHERE a.desLongitud = :desLongitud"),
    @NamedQuery(name = "Alerta.findByFechacreacion", query = "SELECT a FROM Alerta a WHERE a.fechacreacion = :fechacreacion"),
    @NamedQuery(name = "Alerta.findByFechamodifica", query = "SELECT a FROM Alerta a WHERE a.fechamodifica = :fechamodifica"),
    @NamedQuery(name = "Alerta.findByTerminalcrea", query = "SELECT a FROM Alerta a WHERE a.terminalcrea = :terminalcrea"),
    @NamedQuery(name = "Alerta.findByTerminalmodifica", query = "SELECT a FROM Alerta a WHERE a.terminalmodifica = :terminalmodifica")})
public class Alerta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "desLatitud")
    private long desLatitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "desLongitud")
    private long desLongitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_modifica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamodifica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Terminal_crea")
    private String terminalcrea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Terminal_modifica")
    private String terminalmodifica;

    public Alerta() {
    }

    public Alerta(Integer id) {
        this.id = id;
    }

    public Alerta(Integer id, String titulo, String descripcion, long desLatitud, long desLongitud, Date fechacreacion, Date fechamodifica, String terminalcrea, String terminalmodifica) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.desLatitud = desLatitud;
        this.desLongitud = desLongitud;
        this.fechacreacion = fechacreacion;
        this.fechamodifica = fechamodifica;
        this.terminalcrea = terminalcrea;
        this.terminalmodifica = terminalmodifica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getDesLatitud() {
        return desLatitud;
    }

    public void setDesLatitud(long desLatitud) {
        this.desLatitud = desLatitud;
    }

    public long getDesLongitud() {
        return desLongitud;
    }

    public void setDesLongitud(long desLongitud) {
        this.desLongitud = desLongitud;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechamodifica() {
        return fechamodifica;
    }

    public void setFechamodifica(Date fechamodifica) {
        this.fechamodifica = fechamodifica;
    }

    public String getTerminalcrea() {
        return terminalcrea;
    }

    public void setTerminalcrea(String terminalcrea) {
        this.terminalcrea = terminalcrea;
    }

    public String getTerminalmodifica() {
        return terminalmodifica;
    }

    public void setTerminalmodifica(String terminalmodifica) {
        this.terminalmodifica = terminalmodifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alerta)) {
            return false;
        }
        Alerta other = (Alerta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Alerta[ id=" + id + " ]";
    }
    
}

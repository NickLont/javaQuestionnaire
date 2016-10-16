/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hua.gr.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "inputs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inputs.findAll", query = "SELECT i FROM Inputs i"),
    @NamedQuery(name = "Inputs.findByA1", query = "SELECT i FROM Inputs i WHERE i.a1 = :a1"),
    @NamedQuery(name = "Inputs.findByA2", query = "SELECT i FROM Inputs i WHERE i.a2 = :a2"),
    @NamedQuery(name = "Inputs.findByA3", query = "SELECT i FROM Inputs i WHERE i.a3 = :a3"),
    @NamedQuery(name = "Inputs.findByA4", query = "SELECT i FROM Inputs i WHERE i.a4 = :a4"),
    @NamedQuery(name = "Inputs.findByA5", query = "SELECT i FROM Inputs i WHERE i.a5 = :a5"),
    @NamedQuery(name = "Inputs.findByA6", query = "SELECT i FROM Inputs i WHERE i.a6 = :a6"),
    @NamedQuery(name = "Inputs.findByIndexId", query = "SELECT i FROM Inputs i WHERE i.indexId = :indexId")})
public class Inputs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 2)
    @Column(name = "A1")
    private String a1;
    @Size(max = 2)
    @Column(name = "A2")
    private String a2;
    @Size(max = 2)
    @Column(name = "A3")
    private String a3;
    @Size(max = 2)
    @Column(name = "A4")
    private String a4;
    @Size(max = 2)
    @Column(name = "A5")
    private String a5;
    @Size(max = 2)
    @Column(name = "A6")
    private String a6;
    @Size(max = 2)
    @Column(name = "A7")
    private String a7;
    @Size(max = 2)
    @Column(name = "A8")
    private String a8;
    @Size(max = 2)
    @Column(name = "A9")
    private String a9;
    @Size(max = 2)
    @Column(name = "A10")
    private String a10;
    @Size(max = 2)
    @Column(name = "A11")
    private String a11;
    @Size(max = 2)
    @Column(name = "A12")
    private String a12;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IndexId")
    private Integer indexId;

    public Inputs() {
    }

    public Inputs(Integer indexId) {
        this.indexId = indexId;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }
    

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexId != null ? indexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inputs)) {
            return false;
        }
        Inputs other = (Inputs) object;
        if ((this.indexId == null && other.indexId != null) || (this.indexId != null && !this.indexId.equals(other.indexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hua.gr.entities.Inputs[ indexId=" + indexId + " ]";
    }

}

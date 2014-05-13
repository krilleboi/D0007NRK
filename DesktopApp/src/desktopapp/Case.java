/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desktopapp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Kristoffer
 */
@Entity
@Table(name = "Case", catalog = "d0007nrk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Case.findAll", query = "SELECT c FROM Case c"),
    @NamedQuery(name = "Case.findByCaseId", query = "SELECT c FROM Case c WHERE c.caseId = :caseId"),
    @NamedQuery(name = "Case.findByBudgetedTime", query = "SELECT c FROM Case c WHERE c.budgetedTime = :budgetedTime"),
    @NamedQuery(name = "Case.findByCreated", query = "SELECT c FROM Case c WHERE c.created = :created"),
    @NamedQuery(name = "Case.findByStatus", query = "SELECT c FROM Case c WHERE c.status = :status"),
    @NamedQuery(name = "Case.findByCategory", query = "SELECT c FROM Case c WHERE c.category = :category"),
    @NamedQuery(name = "Case.findByCreatedBy", query = "SELECT c FROM Case c WHERE c.createdBy = :createdBy"),
    @NamedQuery(name = "Case.findByComment", query = "SELECT c FROM Case c WHERE c.comment = :comment"),
    @NamedQuery(name = "Case.findByStartTime", query = "SELECT c FROM Case c WHERE c.startTime = :startTime"),
    @NamedQuery(name = "Case.findByEndTime", query = "SELECT c FROM Case c WHERE c.endTime = :endTime"),
    @NamedQuery(name = "Case.findByAttested", query = "SELECT c FROM Case c WHERE c.attested = :attested"),
    @NamedQuery(name = "Case.findByDescription", query = "SELECT c FROM Case c WHERE c.description = :description")})
public class Case implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CaseId")
    private Integer caseId;
    @Basic(optional = false)
    @Column(name = "BudgetedTime")
    private String budgetedTime;
    @Basic(optional = false)
    @Column(name = "Created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @Column(name = "Category")
    private String category;
    @Basic(optional = false)
    @Column(name = "CreatedBy")
    private String createdBy;
    @Column(name = "Comment")
    private String comment;
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "Attested")
    private Boolean attested;
    @Column(name = "Description")
    private String description;

    public Case() {
    }

    public Case(Integer caseId) {
        this.caseId = caseId;
    }

    public Case(Integer caseId, String budgetedTime, Date created, String status, String category, String createdBy) {
        this.caseId = caseId;
        this.budgetedTime = budgetedTime;
        this.created = created;
        this.status = status;
        this.category = category;
        this.createdBy = createdBy;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        Integer oldCaseId = this.caseId;
        this.caseId = caseId;
        changeSupport.firePropertyChange("caseId", oldCaseId, caseId);
    }

    public String getBudgetedTime() {
        return budgetedTime;
    }

    public void setBudgetedTime(String budgetedTime) {
        String oldBudgetedTime = this.budgetedTime;
        this.budgetedTime = budgetedTime;
        changeSupport.firePropertyChange("budgetedTime", oldBudgetedTime, budgetedTime);
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        Date oldCreated = this.created;
        this.created = created;
        changeSupport.firePropertyChange("created", oldCreated, created);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        String oldCreatedBy = this.createdBy;
        this.createdBy = createdBy;
        changeSupport.firePropertyChange("createdBy", oldCreatedBy, createdBy);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        String oldComment = this.comment;
        this.comment = comment;
        changeSupport.firePropertyChange("comment", oldComment, comment);
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        Date oldStartTime = this.startTime;
        this.startTime = startTime;
        changeSupport.firePropertyChange("startTime", oldStartTime, startTime);
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        Date oldEndTime = this.endTime;
        this.endTime = endTime;
        changeSupport.firePropertyChange("endTime", oldEndTime, endTime);
    }

    public Boolean getAttested() {
        return attested;
    }

    public void setAttested(Boolean attested) {
        Boolean oldAttested = this.attested;
        this.attested = attested;
        changeSupport.firePropertyChange("attested", oldAttested, attested);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caseId != null ? caseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Case)) {
            return false;
        }
        Case other = (Case) object;
        if ((this.caseId == null && other.caseId != null) || (this.caseId != null && !this.caseId.equals(other.caseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "desktopapp.Case[ caseId=" + caseId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

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
@Table(name = "Task", catalog = "d0007nrk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t"),
    @NamedQuery(name = "Task.findByTaskId", query = "SELECT t FROM Task t WHERE t.taskId = :taskId"),
    @NamedQuery(name = "Task.findByTask", query = "SELECT t FROM Task t WHERE t.task = :task"),
    @NamedQuery(name = "Task.findByCreated", query = "SELECT t FROM Task t WHERE t.created = :created"),
    @NamedQuery(name = "Task.findByStatus", query = "SELECT t FROM Task t WHERE t.status = :status"),
    @NamedQuery(name = "Task.findByCategory", query = "SELECT t FROM Task t WHERE t.category = :category"),
    @NamedQuery(name = "Task.findByComment", query = "SELECT t FROM Task t WHERE t.comment = :comment"),
    @NamedQuery(name = "Task.findByCompletedBy", query = "SELECT t FROM Task t WHERE t.completedBy = :completedBy"),
    @NamedQuery(name = "Task.findByStartTime", query = "SELECT t FROM Task t WHERE t.startTime = :startTime"),
    @NamedQuery(name = "Task.findByEndTime", query = "SELECT t FROM Task t WHERE t.endTime = :endTime"),
    @NamedQuery(name = "Task.findByCost", query = "SELECT t FROM Task t WHERE t.cost = :cost"),
    @NamedQuery(name = "Task.findByDescription", query = "SELECT t FROM Task t WHERE t.description = :description"),
    @NamedQuery(name = "Task.findByStaffStaffId", query = "SELECT t FROM Task t WHERE t.staffStaffId = :staffStaffId"),
    @NamedQuery(name = "Task.findByCaseCaseId", query = "SELECT t FROM Task t WHERE t.caseCaseId = :caseCaseId")})
public class Task implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TaskId")
    private Integer taskId;
    @Basic(optional = false)
    @Column(name = "Task")
    private String task;
    @Basic(optional = false)
    @Column(name = "Created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @Column(name = "Category")
    private String category;
    @Column(name = "Comment")
    private String comment;
    @Column(name = "CompletedBy")
    private String completedBy;
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "Cost")
    private String cost;
    @Column(name = "Description")
    private String description;
    @Column(name = "Staff_StaffId")
    private Integer staffStaffId;
    @Basic(optional = false)
    @Column(name = "Case_CaseId")
    private int caseCaseId;

    public Task() {
    }

    public Task(Integer taskId) {
        this.taskId = taskId;
    }

    public Task(Integer taskId, String task, Date created, String status, int caseCaseId) {
        this.taskId = taskId;
        this.task = task;
        this.created = created;
        this.status = status;
        this.caseCaseId = caseCaseId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        Integer oldTaskId = this.taskId;
        this.taskId = taskId;
        changeSupport.firePropertyChange("taskId", oldTaskId, taskId);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        String oldTask = this.task;
        this.task = task;
        changeSupport.firePropertyChange("task", oldTask, task);
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        String oldComment = this.comment;
        this.comment = comment;
        changeSupport.firePropertyChange("comment", oldComment, comment);
    }

    public String getCompletedBy() {
        return completedBy;
    }

    public void setCompletedBy(String completedBy) {
        String oldCompletedBy = this.completedBy;
        this.completedBy = completedBy;
        changeSupport.firePropertyChange("completedBy", oldCompletedBy, completedBy);
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        String oldCost = this.cost;
        this.cost = cost;
        changeSupport.firePropertyChange("cost", oldCost, cost);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public Integer getStaffStaffId() {
        return staffStaffId;
    }

    public void setStaffStaffId(Integer staffStaffId) {
        Integer oldStaffStaffId = this.staffStaffId;
        this.staffStaffId = staffStaffId;
        changeSupport.firePropertyChange("staffStaffId", oldStaffStaffId, staffStaffId);
    }

    public int getCaseCaseId() {
        return caseCaseId;
    }

    public void setCaseCaseId(int caseCaseId) {
        int oldCaseCaseId = this.caseCaseId;
        this.caseCaseId = caseCaseId;
        changeSupport.firePropertyChange("caseCaseId", oldCaseCaseId, caseCaseId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskId != null ? taskId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.taskId == null && other.taskId != null) || (this.taskId != null && !this.taskId.equals(other.taskId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "desktopapp.Task[ taskId=" + taskId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

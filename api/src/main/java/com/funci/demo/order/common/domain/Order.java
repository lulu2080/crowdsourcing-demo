package com.funci.demo.order.common.domain;

import com.ouyeel.xplat.core.domain.XAuditable;
import java.io.Serializable;
import java.util.Date;

public class Order extends XAuditable implements Serializable {
    private String orderId;

    private String name;

    private String recCreator;

    private Date recCreateTime;

    private String recRevisor;

    private Date recReviseTime;

    private String recFlag;

    private String tenantId;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecCreator() {
        return recCreator;
    }

    public void setRecCreator(String recCreator) {
        this.recCreator = recCreator;
    }

    public Date getRecCreateTime() {
        return recCreateTime;
    }

    public void setRecCreateTime(Date recCreateTime) {
        this.recCreateTime = recCreateTime;
    }

    public String getRecRevisor() {
        return recRevisor;
    }

    public void setRecRevisor(String recRevisor) {
        this.recRevisor = recRevisor;
    }

    public Date getRecReviseTime() {
        return recReviseTime;
    }

    public void setRecReviseTime(Date recReviseTime) {
        this.recReviseTime = recReviseTime;
    }

    public String getRecFlag() {
        return recFlag;
    }

    public void setRecFlag(String recFlag) {
        this.recFlag = recFlag;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRecCreator() == null ? other.getRecCreator() == null : this.getRecCreator().equals(other.getRecCreator()))
            && (this.getRecCreateTime() == null ? other.getRecCreateTime() == null : this.getRecCreateTime().equals(other.getRecCreateTime()))
            && (this.getRecRevisor() == null ? other.getRecRevisor() == null : this.getRecRevisor().equals(other.getRecRevisor()))
            && (this.getRecReviseTime() == null ? other.getRecReviseTime() == null : this.getRecReviseTime().equals(other.getRecReviseTime()))
            && (this.getRecFlag() == null ? other.getRecFlag() == null : this.getRecFlag().equals(other.getRecFlag()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRecCreator() == null) ? 0 : getRecCreator().hashCode());
        result = prime * result + ((getRecCreateTime() == null) ? 0 : getRecCreateTime().hashCode());
        result = prime * result + ((getRecRevisor() == null) ? 0 : getRecRevisor().hashCode());
        result = prime * result + ((getRecReviseTime() == null) ? 0 : getRecReviseTime().hashCode());
        result = prime * result + ((getRecFlag() == null) ? 0 : getRecFlag().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", name=").append(name);
        sb.append(", recCreator=").append(recCreator);
        sb.append(", recCreateTime=").append(recCreateTime);
        sb.append(", recRevisor=").append(recRevisor);
        sb.append(", recReviseTime=").append(recReviseTime);
        sb.append(", recFlag=").append(recFlag);
        sb.append(", tenantId=").append(tenantId);
        sb.append("]");
        return sb.toString();
    }
}
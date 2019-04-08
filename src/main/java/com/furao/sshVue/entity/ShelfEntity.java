package com.furao.sshVue.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_shelf")
public class ShelfEntity implements Serializable {

    private static final long serialVersionUID = -1271623950675794843L;
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "time_uuid")
    private String timeUuid;

    @Column(name = "shelf_no")
    private String shelfNo;

    @Column(name = "shelf_desc")
    private String shelfDesc;

    @Column(name = "shelf_status")
    private String shelfStatus;

    @Column(name = "shelf_qty")
    private Integer shelfQty;

    @Column(name = "stock_id")
    private Integer stockId;

    @Column(name = "go_pos")
    private String goPos;

    @Column(name = "go_category")
    private String goCategory;

    @Column(name = "go_key")
    private Integer goKey;

    @Column(name = "go_size")
    private String goSize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTimeUuid() {
        return timeUuid;
    }

    public void setTimeUuid(String timeUuid) {
        this.timeUuid = timeUuid;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }

    public String getShelfDesc() {
        return shelfDesc;
    }

    public void setShelfDesc(String shelfDesc) {
        this.shelfDesc = shelfDesc;
    }

    public String getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(String shelfStatus) {
        this.shelfStatus = shelfStatus;
    }

    public Integer getShelfQty() {
        return shelfQty;
    }

    public void setShelfQty(Integer shelfQty) {
        this.shelfQty = shelfQty;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getGoPos() {
        return goPos;
    }

    public void setGoPos(String goPos) {
        this.goPos = goPos;
    }

    public String getGoCategory() {
        return goCategory;
    }

    public void setGoCategory(String goCategory) {
        this.goCategory = goCategory;
    }

    public Integer getGoKey() {
        return goKey;
    }

    public void setGoKey(Integer goKey) {
        this.goKey = goKey;
    }

    public String getGoSize() {
        return goSize;
    }

    public void setGoSize(String goSize) {
        this.goSize = goSize;
    }

    @Override
    public String toString() {
        return "ShelfEntity{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", timeUuid='" + timeUuid + '\'' +
                ", shelfNo='" + shelfNo + '\'' +
                ", shelfDesc='" + shelfDesc + '\'' +
                ", shelfStatus='" + shelfStatus + '\'' +
                ", shelfQty=" + shelfQty +
                ", stockId=" + stockId +
                ", goPos='" + goPos + '\'' +
                ", goCategory='" + goCategory + '\'' +
                ", goKey=" + goKey +
                ", goSize='" + goSize + '\'' +
                '}';
    }
}

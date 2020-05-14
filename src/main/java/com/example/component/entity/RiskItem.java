package com.example.component.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ndoctor_risk_item")
public class RiskItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column
    private String score;

    @Column(name = "positive_id")
    private String positiveId;

    @Column(name = "create_at",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createTime;

    @Column(name = "update_at",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp updateTime;

    @Column(name = "effect_at")
    private Timestamp resultTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPositiveId() {
        return positiveId;
    }

    public void setPositiveId(String positiveId) {
        this.positiveId = positiveId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getResultTime() {
        return resultTime;
    }

    public void setResultTime(Timestamp resultTime) {
        this.resultTime = resultTime;
    }

    @Override
    public String toString() {
        return "RiskItem{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", score='" + score + '\'' +
                ", positiveId='" + positiveId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", resultTime='" + resultTime + '\'' +
                '}';
    }
}

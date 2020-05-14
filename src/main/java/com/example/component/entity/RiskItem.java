package com.example.component.entity;

import javax.persistence.*;

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

    @Column(name = "create_at")
    private String createTime;

    @Column(name = "update_at")
    private String updateTime;

    @Column(name = "effect_at")
    private String resultTime;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getResultTime() {
        return resultTime;
    }

    public void setResultTime(String resultTime) {
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

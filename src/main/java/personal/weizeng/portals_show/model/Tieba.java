package personal.weizeng.portals_show.model;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/3/12.
 */

@Entity
public class Tieba {
    private String uuid;

    private String tiebaName;

    private String superCategory;

    private String lowCategory;

    private String url;

    private int focus;

    private int postTotal;

    private int postSuperior;

    private int picNum;

    private int groups;

    private int groupMember;

    private String crawlDate;

    @Id
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTiebaName() {
        return tiebaName;
    }

    public void setTiebaName(String tiebaName) {
        this.tiebaName = tiebaName;
    }

    public String getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(String superCategory) {
        this.superCategory = superCategory;
    }

    public String getLowCategory() {
        return lowCategory;
    }

    public void setLowCategory(String lowCategory) {
        this.lowCategory = lowCategory;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    public int getPostTotal() {
        return postTotal;
    }

    public void setPostTotal(int postTotal) {
        this.postTotal = postTotal;
    }

    public int getPostSuperior() {
        return postSuperior;
    }

    public void setPostSuperior(int postSuperior) {
        this.postSuperior = postSuperior;
    }

    public int getPicNum() {
        return picNum;
    }

    public void setPicNum(int picNum) {
        this.picNum = picNum;
    }

    public int getGroups() {
        return groups;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }

    public int getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(int groupMember) {
        this.groupMember = groupMember;
    }

    public String getCrawlDate() {
        return crawlDate;
    }

    public void setCrawlDate(String crawlDate) {
        this.crawlDate = crawlDate;
    }

    @Override
    public String toString() {
        return "Tieba{" +
                "uuid='" + uuid + '\'' +
                ", tiebaName='" + tiebaName + '\'' +
                ", superCategory='" + superCategory + '\'' +
                ", lowCategory='" + lowCategory + '\'' +
                ", url='" + url + '\'' +
                ", focus=" + focus +
                ", postTotal=" + postTotal +
                ", postSuperior=" + postSuperior +
                ", picNum=" + picNum +
                ", groups=" + groups +
                ", groupMember=" + groupMember +
                ", crawlDate='" + crawlDate + '\'' +
                '}';
    }
}

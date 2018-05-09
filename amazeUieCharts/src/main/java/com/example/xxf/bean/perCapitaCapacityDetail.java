package com.example.xxf.bean;

/**
 * 人均产能详细表
 */
public class perCapitaCapacityDetail {

    public String FContract;
    public String FPlateNum;
    public String FContractTime;
    public String money;
    public String department;
    public String saleman;
    public String FDividendRatio;
    public String FQuoType;
    public String yesterday;
    public String newman;
    public String ktbd;
    public String target_sale;
    public String target_salemoney;
    public String man_count;
    public String FAddTime;
    public String FPost;

    public String getFContract() {
        return FContract;
    }

    public void setFContract(String FContract) {
        this.FContract = FContract;
    }

    public String getFPlateNum() {
        return FPlateNum;
    }

    public void setFPlateNum(String FPlateNum) {
        this.FPlateNum = FPlateNum;
    }

    public String getFContractTime() {
        return FContractTime;
    }

    public void setFContractTime(String FContractTime) {
        this.FContractTime = FContractTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman;
    }

    public String getFDividendRatio() {
        return FDividendRatio;
    }

    public void setFDividendRatio(String FDividendRatio) {
        this.FDividendRatio = FDividendRatio;
    }

    public String getFQuoType() {
        return FQuoType;
    }

    public void setFQuoType(String FQuoType) {
        this.FQuoType = FQuoType;
    }

    public String getYesterday() {
        return yesterday;
    }

    public void setYesterday(String yesterday) {
        this.yesterday = yesterday;
    }

    public String getNewman() {
        return newman;
    }

    public void setNewman(String newman) {
        this.newman = newman;
    }

    public String getKtbd() {
        return ktbd;
    }

    public void setKtbd(String ktbd) {
        this.ktbd = ktbd;
    }

    public String getTarget_sale() {
        return target_sale;
    }

    public void setTarget_sale(String target_sale) {
        this.target_sale = target_sale;
    }

    public String getTarget_salemoney() {
        return target_salemoney;
    }

    public void setTarget_salemoney(String target_salemoney) {
        this.target_salemoney = target_salemoney;
    }

    public String getMan_count() {
        return man_count;
    }

    public void setMan_count(String man_count) {
        this.man_count = man_count;
    }

    public String getFAddTime() {
        return FAddTime;
    }

    public void setFAddTime(String FAddTime) {
        this.FAddTime = FAddTime;
    }

    public String getFPost() {
        return FPost;
    }

    public void setFPost(String FPost) {
        this.FPost = FPost;
    }

    @Override
    public String toString() {
        return "perCapitaCapacity{" +
                "FContract='" + FContract + '\'' +
                ", FPlateNum='" + FPlateNum + '\'' +
                ", FContractTime='" + FContractTime + '\'' +
                ", money='" + money + '\'' +
                ", department='" + department + '\'' +
                ", saleman='" + saleman + '\'' +
                ", FDividendRatio='" + FDividendRatio + '\'' +
                ", FQuoType='" + FQuoType + '\'' +
                ", yesterday='" + yesterday + '\'' +
                ", newman='" + newman + '\'' +
                ", ktbd='" + ktbd + '\'' +
                ", target_sale='" + target_sale + '\'' +
                ", target_salemoney='" + target_salemoney + '\'' +
                ", man_count='" + man_count + '\'' +
                ", FAddTime='" + FAddTime + '\'' +
                ", FPost='" + FPost + '\'' +
                '}';
    }
}
package com.domain;

public class UserSalary {
    private int id;
    private String accountName;
    private String realName;
    private int YEAR;
    private int MONTH;
    private int salary;
    private String salaryDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getYEAR() {
        return YEAR;
    }

    public void setYEAR(int YEAR) {
        this.YEAR = YEAR;
    }

    public int getMONTH() {
        return MONTH;
    }

    public void setMONTH(int MONTH) {
        this.MONTH = MONTH;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(String salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "Id=" + id +
                ", accountName='" + accountName + '\'' +
                ", realName='" + realName + '\'' +
                ", YEAR=" + YEAR + '\'' +
                ", MONTH=" + MONTH + '\'' +
                ", salary=" + salary + '\'' +
                ", date=" + salaryDate + '\'' +
                '}';
    }
}

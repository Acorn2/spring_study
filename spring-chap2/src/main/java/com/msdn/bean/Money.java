package com.msdn.bean;

/**
 * @author hresh
 * @date 2019/12/30 14:42
 * @description
 */
public class Money {
    private String classification;
    private Person person;

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Money{" +
                "classification='" + classification + '\'' +
                ", person=" + person.getName() +
                '}';
    }
}

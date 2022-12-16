package ru.ke3ran.metod2.lab11.ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BetterStudent {

    private Long id;
    private String name;
    private Integer totalScore;

    private Date birthDate;

    public BetterStudent(Long id, String name, Integer totalScore, Date birthDate) {
        this.id = id;
        this.name = name;
        this.totalScore = totalScore;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(int format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // short
        switch (format) {
            case 0:
                dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); // long
                break;
            case 1:
                dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy"); // medium
                break;
            case -1:
                dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // short
                break;
        }
        return "BetterStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalScore=" + totalScore +
                ", birthDate=" + dateFormat.format(birthDate) +
                '}';
    }
}


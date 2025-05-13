package com.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Country")
public class Country {
    @Id
    @Column(name="countryName", nullable=false)
    private String countryName;

    @Column(name="currency", nullable=false)
    private String currency;

    @Column(name="capital", nullable=false)
    private String capital;

    @OneToMany(mappedBy="country", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<State> statelist = new ArrayList<>();

    // Getters and setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<State> getStatelist() {
        return statelist;
    }

    public void setStatelist(List<State> statelist) {
        this.statelist = statelist;
    }
}

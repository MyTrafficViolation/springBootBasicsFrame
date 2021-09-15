package com.example.mydemo.bean;

import java.util.HashSet;
import java.util.Set;

public class Dicinfo {
    public Dicinfo(String mod, String name) {
        this.mod = mod;
        this.name = name;
    }
    public Dicinfo(){
        super();
    }

    private String mod;

    private String name;

    private Set<Herodictionary> herodictionaries = new HashSet<>();

    public Set<Herodictionary> getHerodictionaries() {
        return herodictionaries;
    }

    public void setHerodictionaries(Set<Herodictionary> herodictionaries) {
        this.herodictionaries = herodictionaries;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

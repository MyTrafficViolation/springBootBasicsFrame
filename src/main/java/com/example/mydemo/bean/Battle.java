package com.example.mydemo.bean;

import java.util.Set;

public class Battle {
    public Battle(Juese makeMoveJuese, Juese targetJuese) {
        this.makeMoveJuese = makeMoveJuese;
        this.targetJuese = targetJuese;
    }

    public Battle(Juese makeMoveJuese, Juese targetJuese, String makeJuesejineng) {
        this.makeMoveJuese = makeMoveJuese;
        this.targetJuese = targetJuese;
        this.makeJuesejineng = makeJuesejineng;
    }

    public Battle(Juese makeMoveJuese, Juese targetJuese, String makeJuesejineng, Set<Integer> makeMoveZdactions, Set<Integer> targetZdactions) {
        this.makeMoveJuese = makeMoveJuese;
        this.targetJuese = targetJuese;
        this.makeJuesejineng = makeJuesejineng;
        this.makeMoveZdactions = makeMoveZdactions;
        this.targetZdactions = targetZdactions;
    }

    private Juese makeMoveJuese;//出招人
    private Juese targetJuese;//目标人
    private String makeJuesejineng;//出招技能
    private Set<Integer> makeMoveZdactions;//出招人状态
    private Set<Integer> targetZdactions;//目标人状态

    public Juese getMakeMoveJuese() {
        return makeMoveJuese;
    }

    public void setMakeMoveJuese(Juese makeMoveJuese) {
        this.makeMoveJuese = makeMoveJuese;
    }

    public Juese getTargetJuese() {
        return targetJuese;
    }

    public void setTargetJuese(Juese targetJuese) {
        this.targetJuese = targetJuese;
    }

    public String getMakeJuesejineng() {
        return makeJuesejineng;
    }

    public void setMakeJuesejineng(String makeJuesejineng) {
        this.makeJuesejineng = makeJuesejineng;
    }

    public Set<Integer> getMakeMoveZdactions() {
        return makeMoveZdactions;
    }

    public void setMakeMoveZdactions(Set<Integer> makeMoveZdactions) {
        this.makeMoveZdactions = makeMoveZdactions;
    }

    public Set<Integer> getTargetZdactions() {
        return targetZdactions;
    }

    public void setTargetZdactions(Set<Integer> targetZdactions) {
        this.targetZdactions = targetZdactions;
    }
}

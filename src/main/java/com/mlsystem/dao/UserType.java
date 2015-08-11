/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.dao;

/**
 *
 * @author Marcin
 */
public enum UserType {


    /**
     *
     */
    NONE(0), Technolog(5), Kosztorysant(1), Inzynier(2), Admin(100), Dyrektor(3), Projektant(4);

    private final int value;
    private UserType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
/*
    public int getUserType() {
        UserType tax = UserType.NONE; // Or whatever
        return tax.getValue();
    }
    */
}
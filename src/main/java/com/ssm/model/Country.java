package com.ssm.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Country implements Serializable {
    /**
     *
     */
    private String code;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Object continent;

    /**
     *
     */
    private String region;

    /**
     *
     */
    private Double surfaceArea;

    /**
     *
     */
    private Short indepYear;

    /**
     *
     */
    private Integer population;

    /**
     *
     */
    private Double lifeExpectancy;

    /**
     *
     */
    private Double gnp;

    /**
     *
     */
    private Double gNPOld;

    /**
     *
     */
    private String localName;

    /**
     *
     */
    private String governmentForm;

    /**
     *
     */
    private String headOfState;

    /**
     *
     */
    private Integer capital;

    /**
     *
     */
    private String code2;

    private static final long serialVersionUID = 1L;
}


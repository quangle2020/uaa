package com.quanglv.type;

public enum ProductStatusTypes {
    ACTIVE("ACTIVE", 1),
    DE_ACTIVE("DEACTIVE", 2);

    ProductStatusTypes(String name, Integer code) {
        this.code = code;
        this.name = name;
    }

    private String name;

    private Integer code;

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}

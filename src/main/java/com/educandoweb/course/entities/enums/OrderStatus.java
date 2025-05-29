package com.educandoweb.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT (1),
    PAID (2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // esse metodo statico serve para mostrar o nome do status e não o codigo.
    public static OrderStatus valueOf(int code){
        for (OrderStatus status : OrderStatus.values()){
            if (status.getCode() == code){
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
    
}

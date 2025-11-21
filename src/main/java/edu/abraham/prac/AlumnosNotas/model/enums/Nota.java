package edu.abraham.prac.AlumnosNotas.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Nota {
    CERO("0"), UNO("1"), DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"), SIETE("7"), OCHO("8"), NUEVE("9"), DIEZ("10");

    private final String valor;

    private Nota(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @JsonValue
    public String toValor() {
        return valor;
    }

    public static Nota fromValor(String valor) {
        for(Nota n : values()) {
            if(n.toValor().equals(valor)) {
                return n;
            }
        }
        throw new IllegalArgumentException("Valor no válido: " + valor);
    }
}

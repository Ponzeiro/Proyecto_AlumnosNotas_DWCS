package edu.abraham.prac.AlumnosNotas.model.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public final class FechaNacimiento {

    private final Integer day;
    private final Integer month;
    private final Integer year;

    public FechaNacimiento(Integer day, Integer month, Integer year) {

        if(day == null || month == null || year == null) {
            throw new IllegalArgumentException("Fecha de nacimiento inválida");
        } if (day < 0 || day > 31) {
            throw new IllegalArgumentException("Día inválido");
        } if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Mes inválido");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((day == null) ? 0 : day.hashCode());
        result = prime * result + ((month == null) ? 0 : month.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FechaNacimiento other = (FechaNacimiento) obj;
        if (day == null) {
            if (other.day != null)
                return false;
        } else if (!day.equals(other.day))
            return false;
        if (month == null) {
            if (other.month != null)
                return false;
        } else if (!month.equals(other.month))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        return true;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "FechaNacimiento [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    
}

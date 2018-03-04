/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaut3;

/**
 *
 * @author usuario
 */
public class Reloj {

    private int HH;
    private int MM;
    private int SS;
    private int mes;
    private int dia;
    
    //Constructor con parámetros
    public Reloj(int hora, int minuto, int segundo) {
        this.HH = hora;
        this.MM = minuto;
        this.SS = segundo;
    }
    //Métodos para asignar valores a los atributos hora, minuto y segundo
    
    public void asignarHora(int hora) {
        this.HH = hora;
    }

    public void asignarMinuto(int minuto) {
        this.MM = minuto;
    }

    
    public void asignarSegundo(int segundo) {    
        this.SS = segundo;
    }
 //Métodos para devolver valores de los atributos hora, minuto y segundo

    public int obtenerHora() {
        return HH;
    }

    public int obtenerMinuto() {
        return MM;
    }

    public int obtenerSegundo() {
        return SS;
    }
    
    //Método que incrementa 1 segundo la hora
    public void incrementa() {
        boolean cambio_m, cambio_h;
        cambio_m = (SS + 1 > 59) ? true : false;
        cambio_h = ((cambio_m) && (MM + 1 > 59)) ? true : false;
        MM = (cambio_m) ? MM + 1 : MM;
        MM = (MM > 59) ? 0 : MM;
        HH = (cambio_h) ? HH + 1 : HH;
        HH = (HH > 23) ? 0 : HH;
        SS = (SS + 1 > 59) ? 0 : SS + 1;
    }
    //Método que decrementa un segundo la hora
    public void decrementa() {
        boolean cambio_m, cambio_h;

        cambio_m = (SS - 1 < 0) ? true : false;
        cambio_h = ((cambio_m) && (MM - 1 < 0)) ? true : false;

        MM = (cambio_m) ? MM - 1 : MM;
        MM = (MM < 0) ? 59 : MM;
        HH = (cambio_h) ? HH - 1 : HH;
        HH = (HH < 0) ? 23 : HH;

        SS = (SS - 1 < 0) ? 59 : SS - 1;

    }
    //Método que da la hora en formato 12H
    public String hora12() {
        
        String mediodia, cadena;
        int hora12;
        mediodia = (HH >= 12) ? "PM" : "AM";
        hora12 = (HH > 12) ? HH - 12 : HH;

    //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora12 + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        cadena += " " + mediodia;
        return cadena;

    }
    //Método que da la hora en formato 24H
    public String hora24() {
        
        String cadena;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = HH + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        return cadena;

    }

    /**
     * @return the HH
     */
    private int getHH() {
        return HH;
    }

    /**
     * @param HH the HH to set
     */
    private void setHH(int HH) {
        this.HH = HH;
    }

    /**
     * @return the MM
     */
    private int getMM() {
        return MM;
    }

    /**
     * @param MM the MM to set
     */
    private void setMM(int MM) {
        this.MM = MM;
    }

    /**
     * @return the SS
     */
    private int getSS() {
        return SS;
    }

    /**
     * @param SS the SS to set
     */
    private void setSS(int SS) {
        this.SS = SS;
    }

    /**
     * @return the mes
     */
    private int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    private void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the dia
     */
    private int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    private void setDia(int dia) {
        this.dia = dia;
    }
}

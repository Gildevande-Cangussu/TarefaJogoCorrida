/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDeCorrida;

/**
 *
 * @author Admin
 */
public class Veiculo {
    Imotor Motor;
    Veiculo (Imotor m){
        
        this.Motor = m;
    }
    public String acelerar(){
        return this.Motor.acelerar();
    }
}

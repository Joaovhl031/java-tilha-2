/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author joaoh
 */
public class SistemaIbge {

    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            System.out.print(e.getSigla()+" - "+e.getNome());
        }
        EstadosBrasileiros eb = EstadosBrasileiros.MINAS_GERAIS;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}

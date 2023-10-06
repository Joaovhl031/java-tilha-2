/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

/**
 *
 * @author joaoh
 */
public class SistemaCadastro {
    public static void main (String[] args) {
        Pessoa juan = new Pessoa("Juan ","123-987.12");
        juan.setSobrenome("Silva");
        juan.getCpf();
        juan.getNome();
        juan.getSobrenome();
        juan.getEndereco();
        System.out.print(juan.getNome()+juan.getSobrenome()+" "+juan.getCpf());
    }
}

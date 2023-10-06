/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolateste;

/**
 *
 * @author joaoh
 */
public class Escola {

    public static void main(String[] args) {
       Aluno joao = new Aluno();
       joao.setNome("Joao Henrique");
       joao.setIdade(18);
       
       System.out.println("O aluno "+joao.getNome()+" tem "+joao.getIdade()+" anos.");
    }
}

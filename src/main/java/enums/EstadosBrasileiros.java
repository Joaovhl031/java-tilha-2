/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author joaoh
 */
public enum EstadosBrasileiros {
    SAO_PAULO("SP", "Sao Paulo",11),
    RIO_JANEIRO("RJ", "Rio de Janeiro",12),
    MINAS_GERAIS("MG", "Minas Gerais",15);

    private final String nome;
    private final String sigla;
    private final int ibge;

    private EstadosBrasileiros(String nome, String sigla,int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

/**
 *
 * @author paulo
 */
public class Aluno {
    
    String nome; 
    int matricula; 

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return  nome;
    }

    public int getMatricula() {
        return  matricula;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
    
    
}

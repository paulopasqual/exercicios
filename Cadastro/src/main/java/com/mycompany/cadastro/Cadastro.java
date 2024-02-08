/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro;
 import java.util.Scanner;             
/**
 *
 * @author paulo
 */
public class Cadastro {

    public static void main(String[] args) {
        
        Aluno[] alunoVet = new Aluno [10];
        Scanner  leitor = new Scanner(System.in);
        String nome;
        int matricula, i=0;
        
        
        while (i < 3) {
            
        System.out.println("Digite o nome do aluno");
        nome = leitor.nextLine();
        
        System.out.println("Digite a matricula do aluno");
        matricula = leitor.nextInt();
        
        leitor.nextLine();
        
        Aluno aluno = new Aluno(nome, matricula);
        
        alunoVet[i] = aluno;
        i++;
            
            
        }
        
        System.out.println("Os alunos cadastrados são:" );
        for (1=0;i<3;i++ ) {
                
            System.out.println(alunoVet[i].getNome()+" " + alunoVet[i].getMatricula());
            System.out.println();
                              
        }
        
        
        
        
    }
}

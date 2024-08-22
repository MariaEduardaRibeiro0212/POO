/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;
/*Crie um programa que receba como dados de entrada duas notas de um aluno e mostre com resultado se o aluno foi
aprovado ou reprovado, onde média menor que 7 é reprovado e média maior ou igual a 7 aprovado
*/
public class MediaAluno {
    private double nota1;
    private double nota2;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }
    
    public double CalcularMedia(){
        this.media = (this.nota1 + this.nota2)/ 2;
        return this.media;
    }
    
    
}

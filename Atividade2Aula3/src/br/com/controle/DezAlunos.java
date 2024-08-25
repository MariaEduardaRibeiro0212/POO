/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/*Faça um programa que receba como dados de entrada duas notas de 10 alunos e mostre como resultado:
a) Qual foi a maior média da turma;
b) Qual foi a menor média da turma;
c) Qual foi a média da turma;*/
 
public class DezAlunos {
    private double nota1;
    private double nota2;
    private double mediaA;
    private double mediaT;
    private double maiorMedia;
    private double menorMedia;

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
        int cont = 0;
        
        this.nota2 = nota2;
        this.mediaA = (this.nota1 + this.nota2)/2;
        this.mediaT+=this.mediaA;
         
        if(cont == 1){
        
        this.maiorMedia = this.mediaA;
        this.menorMedia = this.mediaA;
        
    }else if (this.mediaA < this.menorMedia){
            this.menorMedia = this.mediaA;
            
        }else if(this.mediaA > this.maiorMedia ){
            this.maiorMedia = this.mediaA;
        }
        
        cont++;
    }

    public double getMediaA(){
        return mediaA;
    }

    public double getMediaT() {
        return mediaT;
    }

    public double getMaiorMedia() {
        return maiorMedia;
    }

    public double getMenorMedia() {
        return menorMedia;
    }
      
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Compras {
    private double compras;
    private double soma;
    private int NumComprasRegistradas;
    private int qtdCompras;

    public double getCompras() {
        return compras;
    }

    public void setCompras(double compras) {
        this.compras = compras;
        
          if(this.compras >= 500 && this.compras <= 700){
            qtdCompras += 1;
          }
          
        this.soma += this.compras;
        
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public int getQtdCompras() {
        return qtdCompras;
    }

    public void setQtdCompras(int qtdCompras) {
        this.qtdCompras = qtdCompras;
      
    }    

    public int getNumComprasRegistradas() {
        return NumComprasRegistradas;
    }

    public void setNumComprasRegistradas(int NumComprasRegistradas) {
        this.NumComprasRegistradas = NumComprasRegistradas;
    }

    
    
}

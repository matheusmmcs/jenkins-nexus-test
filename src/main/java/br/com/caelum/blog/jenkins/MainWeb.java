/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.blog.jenkins;

/**
 *
 * @author matheusmmcs
 */
public class MainWeb {
    
    private Imposto imposto;
    private Orcamento orcamento;
    
    public void main(){
        imposto = new Imposto();
        orcamento = new Orcamento(2d);
        imposto.calculaTest(orcamento);
    }
    
}

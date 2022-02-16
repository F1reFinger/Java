package com.base;

import java.math.BigDecimal;

/*
* @author Helder Lourenço ded Abreu Marques
* @version 1.0.0
* @see BigDecimal
* @since 1.0.0
*/

public class Orider{

    private final String code;
    private final BigDecimal totalValue;

    /**
     * construtor da classe 
     *  @param code         codigo do pedido
     *  @param totalValue   valor total do pedido
     */

    public Orider(String code, double totalValue){
        this.code = code;  
        this.totalValue = totalValue;
    }

    @Override
    public String toString(){
        return "Order={" + "code='" + code + "'" + "}";
    }

    /**
     * calcula o valor total do pedido se o valor maior que 100 uma taxa será cobrada
     * 
     * @return  retorna o valor do pedido com as taxas 
     * @throws RuntimeException lança excessão caso o valor seja menor que 100  
     */
    public double calculateFee (){
        if(this.totalValue.signum() < 0){
            throw new RuntimeException("O pedido não pode ter valor negativo");
        }
        if(this.totalValuecompareTo(new BigDecimal("00.00") > 100 )){
            return this.totalValue.multiply(new BigDecimal("00.00"));
        }
        return this.totalValue;
    }
}
/*
 * Atividade de teste de utilização WSDL
 * Arquivo utilizado:
 * http://www.dneonline.com/calculator.asmx?WSDL
*/
package com.org;

import com.org.calc.Calculator;
import com.org.calc.CalculatorSoap;

/**
 *
 * @author XXP
 */
public class Arquitetura_BackEnd1 {

    public static void main(String[] args) {
        try { // Call Web Service Operation
            Calculator service = new Calculator();
            CalculatorSoap port = service.getCalculatorSoap();
            // TODO initialize WS operation arguments here
            int intA = 8;
            int intB = 4;
            // TODO process result here
            int resultADD = port.add(intA, intB);
            System.out.println("Resultado da Soma SOAP = "+resultADD);
            
            int resultSUBTRACT = port.subtract(intA, intB);
            System.out.println("Resultado da Subtração SOAP = "+resultSUBTRACT);
            
            double resultMULTIPLY = port.multiply(intA, intB);
            System.out.println("Resultado da Multiplicação SOAP = "+resultMULTIPLY);
            
            double resultDIVIDE = port.divide(intA, intB);
            System.out.println("Resultado da Divisão SOAP = "+resultDIVIDE);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }
}

package br.edu.utfpr.bankapi.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Calculadora de juros
 */
public class InterestCalculator {

        /**
        * Calcula o valor do juros
        * @param value valor
        * @param rate taxa de juros
        * @param months dias
        * @return valor do juros
        */
        public double calculateJustInterest(double value, double rate, int months) {
                float decimalRate = (float) rate / 100;

                double interest = value * Math.pow(1 + decimalRate, months) - value;

                return new BigDecimal(interest).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

}

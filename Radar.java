/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stefa
 */
package com.mycompany.radarrodoviario;

public class Radar {

    public double calcularVelocidade(double freqCarro) {
        return ((1.0 / freqCarro) - 1) * 300;
    }

    public double calcularPercentual(double velocidade, double limite) {
        return ((velocidade - limite) / limite) * 100;
    }

    public String classificarInfracao(double velocidade, double limite) {

        if (velocidade <= limite) {
            return "Dentro do limite de velocidade";
        }

        double percentual = calcularPercentual(velocidade, limite);

        if (percentual <= 20) {
            return "Infracao MEDIA (4 pontos) - R$ 130,16";
        } 
        else if (percentual <= 50) {
            return "Infracao GRAVE (5 pontos) - R$ 195,23";
        } 
        else {
            return "Infracao GRAVISSIMA (7 pontos) - R$ 880,41";
        }
    }
}
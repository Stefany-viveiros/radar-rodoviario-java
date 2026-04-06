/*
 * Projeto: Radar Rodoviario
 * Disciplina: Programação Orientada a Objetos
 */

package com.mycompany.radarrodoviario;

import java.util.Scanner;
import java.util.Locale;

public class RadarRodoviario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Radar radar = new Radar();

        double freqCarro;
        double limite;
        double velocidade;

        System.out.println("=========================================");
        System.out.println("        RADAR ELETRONICO - DETRAN        ");
        System.out.println("=========================================");

        System.out.print("Digite a frequencia do carro: ");
        freqCarro = sc.nextDouble();

        System.out.print("Digite o limite de velocidade (km/h): ");
        limite = sc.nextDouble();

        // Agora usando a classe Radar
        velocidade = radar.calcularVelocidade(freqCarro);

        System.out.println("\n-----------------------------------------");
        System.out.printf("Velocidade detectada: %.1f km/h\n", velocidade);
        System.out.printf("Limite da via: %.1f km/h\n", limite);
        System.out.println("-----------------------------------------");

        String resultado = radar.classificarInfracao(velocidade, limite);

        System.out.println("Resultado: " + resultado);

        System.out.println("=========================================");
        System.out.println("        FIM DO REGISTRO DO RADAR         ");
        System.out.println("=========================================");

        sc.close();
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner	read = new Scanner(System.in);
		float base, altura;
		System.out.println("Insira o valor da base: ");
		base = read.nextFloat();
		System.out.println("Insira o valor da altura: ");
		altura = read.nextFloat();
		Retangulo retangulo1 = new Retangulo(base,altura);
		System.out.printf("Perímetro: %.2f \nÁrea: %.2f",retangulo1.calcPerimetro(),retangulo1.calcArea());
    }
}

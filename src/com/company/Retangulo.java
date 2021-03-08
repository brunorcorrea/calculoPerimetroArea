package com.company;

public class Retangulo {

	//declarações
		private float base, altura;

	//constructor
		public Retangulo(float base, float altura){
			this.setBase(base);
			this.setAltura(altura);
		}

	//cálculos
		public float calcPerimetro(){
			return 2*(base+altura);
		}

		public float calcArea(){
			return base*altura;
		}

	//getters
		public float getBase(){
			return this.base;
		}

		public float getAltura(){
			return this.altura;
		}

	//setters
		public void setBase(float base){
			if((base >= 1) && (base <= 20)) this.base = base;
			else this.base = 1;
		}

		public void setAltura(float altura){
			if((altura >= 1) && (altura<=20)) this.altura = altura;
		}
}

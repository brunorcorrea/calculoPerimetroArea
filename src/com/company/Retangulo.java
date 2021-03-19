package com.company;

public class Retangulo {

	//declarações
		private float base;
		private float altura;

	//constructors
		public Retangulo(){
			this.base = 1;
			this.altura = 1;
		}

		public Retangulo(float base, float altura){
			if((base >= 1) && (base <= 20)) this.base = base;
			else this.base = 1;
			if((altura >= 1) && (altura<=20)) this.altura = altura;
			else this.altura = 1;
		}

	//cálculos
		public float calcPerimetro(){
			return 2*(this.base+this.altura);
		}

		public float calcArea(){
			return this.base*this.altura;
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
			else this.altura = 1;
		}
}

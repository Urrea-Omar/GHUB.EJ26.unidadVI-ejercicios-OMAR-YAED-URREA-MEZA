Algoritmo NumerosParesImpares
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 09/05/2025
	// proceso: Leer un arreglo de numeros y contar
	// cuantos son pares e impares.
	Definir n, i, num Como Entero
	Definir pares, impares Como Entero
	pares <- 0
	impares <- 0
	Escribir 'Cuantos numeros desea colocar:'
	Leer n
	Dimensionar numeros(n)
	Para i<-1 Hasta n Hacer
		Escribir 'Ingresa el numero ', i, ':'
		Leer numeros[i]
		num <- numeros[i]
		Si num MOD 2=0 Entonces
			pares <- pares+1
		SiNo
			impares <- impares+1
		FinSi
	FinPara
	Escribir 'Cantidad de numeros pares: ', pares
	Escribir 'Cantidad de numeros impares: ', impares
FinAlgoritmo

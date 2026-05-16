Algoritmo MayorMenor
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 08/05/2026
	// Proceso: Leer un arreglo de enteros y encontrar el numero mayor y el numero menor.
	Definir n, i Como Entero
	Definir may, men Como Entero
	Escribir 'Cuantos numeros va a colocar:'
	Leer n
	Dimensionar num(n)
	Para i<-1 Hasta n Hacer
		Escribir 'Ingresa el numero ', i, ':'
		Leer num[i]
	FinPara
	may <- num[1]
	men <- num[1]
	Para i<-1 Hasta n Hacer
		Si num[i]>may Entonces
			may <- num[i]
		FinSi
		Si num[i]<men Entonces
			men <- num[i]
		FinSi
	FinPara
	Escribir 'El numero mayor es: ', may
	Escribir 'El numero menor es: ', men
FinAlgoritmo

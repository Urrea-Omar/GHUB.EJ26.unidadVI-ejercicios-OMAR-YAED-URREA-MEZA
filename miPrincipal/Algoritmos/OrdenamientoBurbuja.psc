Algoritmo OrdenamientoBurbuja
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 09/05/2026
	// Proposito: Ordenar un arreglo usando el algoritmo de burbuja
	Definir n, i, j, temp Como Entero
	Definir arreglo Como Entero
	Escribir 'Ingrese la cantidad de elementos'
	Leer n
	Si n<=0 Entonces
		Escribir 'La cantidad debe ser mayor a 0'
	SiNo
		Dimensionar arreglo(n)
		Para i<-1 Hasta n Hacer
			Escribir 'Ingrese el elemento ', i
			Leer arreglo[i]
		FinPara
		Para i<-1 Hasta n-1 Hacer
			Para j<-1 Hasta n-i Hacer
				Si arreglo[j]>arreglo[j+1] Entonces
					temp <- arreglo[j]
					arreglo[j] <- arreglo[j+1]
					arreglo[j+1]<-temp
				FinSi
			FinPara
		FinPara
		Escribir 'Arreglo ordenado:'
		Para i<-1 Hasta n Hacer
			Escribir arreglo[i], ' '
		FinPara
	FinSi
FinAlgoritmo

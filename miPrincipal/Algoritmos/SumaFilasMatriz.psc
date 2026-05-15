Algoritmo SumaFilasMatriz
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 11/05/2026
	// Proposito: Elaborar un algoritmo que lea una matriz y sume los valores de cada fila
	Definir nFilas, nCols, i, j, numSuma Como Entero
	Escribir 'Ingrese el número de filas: '
	Leer nFilas
	Escribir 'Ingrese el número de columnas: '
	Leer nCols
	Si nFilas<=0 O nCols<=0 Entonces
		Escribir 'Error: Las dimensiones deben ser mayores a 0.'
	FinSi
	Dimensionar matriz(nFilas,nCols)
	Escribir 'Ingrese los elementos de la matriz:'
	Para i<-1 Hasta nFilas Con Paso 1 Hacer
		Para j<-1 Hasta nCols Con Paso 1 Hacer
			Escribir 'Elemento [', i, ',', j, ']: '
			Leer matriz[i,j]
		FinPara
	FinPara
	Escribir ''
	Escribir ' Suma de cada fila '
	Para i<-1 Hasta nFilas Con Paso 1 Hacer
		numSuma <- 0
		Para j<-1 Hasta nCols Con Paso 1 Hacer
			numSuma <- numSuma+matriz[i,j]
		FinPara
		Escribir 'Suma de la fila ', i, ': ', numSuma
	FinPara
FinAlgoritmo

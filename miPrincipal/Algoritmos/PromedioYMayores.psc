Algoritmo PromedioYMayores
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 09/05/2026
	// Proposito: Crear un algoritmo que tenga una funcion que calcule el promedio e indique que numeros son mayor que el promedio
	Definir i, n, cont Como Entero
	Definir num, arreglo, suma, promedio Como Real
	Escribir 'Ingrese la cantidad de números: '
	Leer n
	Si n<=0 Entonces
		Escribir 'La cantidad debe ser mayor a 0.'
	FinSi
	Dimensionar arreglo(n)
	suma <- 0
	Escribir 'Ingrese los números reales: '
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir 'Número ', i, ': '
		Leer arreglo[i]
		suma <- suma+arreglo[i]
	FinPara
	promedio <- suma/n
	cont <- 0
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si arreglo[i]>promedio Entonces
			cont <- cont+1
		FinSi
	FinPara
	Escribir ''
	Escribir 'El promedio es: ', promedio
	Escribir 'La cantidad de valores mayores al promedio es: ', cont
FinAlgoritmo

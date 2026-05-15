Algoritmo BusquedaLineal
	Definir n, i, valorBus, posicion Como Entero
	Definir ValorE Como Lógico
	ValorE <- Falso
	posicion <- -1
	Escribir 'Ingrese el tamaño del arreglo: '
	Leer n
	Si n<=0 Entonces
		Escribir 'El tamaño debe ser mayor a 0.'
	FinSi
	Dimensionar arreglo(n)
	Escribir 'Ingrese los elementos en las posiciones:'
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir 'Posicion [', i, ']: '
		Leer arreglo[i]
	FinPara
	Escribir 'Ingrese el valor a buscar: '
	Leer valorBus
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si arreglo[i]==valorBus Entonces
			posicion <- i
			ValorE <- Verdadero
		FinSi
	FinPara
	Si ValorE=Verdadero Entonces
		Escribir 'El valor ', valorBus, ' se encontró en la posición: ', posicion
	SiNo
		Escribir 'El valor ', valorBus, ' NO se encontró en el arreglo.'
	FinSi
FinAlgoritmo

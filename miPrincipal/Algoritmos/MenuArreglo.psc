Algoritmo MenuArreglo
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 11/05/2026
	// Proposito: Elaborar un menu que te permita ingresar datos, mostrarlos y al final sacar el promedio.
	Definir n, i, opc, suma, promedio Como Real
	opc <- 0
	n <- 0
	Mientras opc<>4 Hacer
		Escribir '1. Capturar datos'
		Escribir '2. Mostrar datos'
		Escribir '3. Calcular promedio'
		Escribir '4. Salir'
		Escribir 'Seleccione una opción: '
		Leer opc
		Si opc=1 Entonces
			Escribir 'Ingrese el tamaño del arreglo: '
			Leer n
			Si n<=0 O n>100 Entonces
				Escribir ' El tamaño debe ser mayor a 0 y máximo 100.'
			SiNo
				Dimensionar arreglo(n)
				Para i<-1 Hasta n Con Paso 1 Hacer
					Escribir 'Ingrese valor para la posición ', i, ': '
					Leer arreglo[i]
				FinPara
				Escribir 'Datos capturados exitosamente.'
			FinSi
		FinSi
		Si opc=2 Entonces
			Si n>0 Entonces
				Escribir 'Datos del arreglo:'
				Para i<-1 Hasta n Con Paso 1 Hacer
					Escribir 'Posición ', i, ': ', arreglo[i]
				FinPara
			SiNo
				Escribir 'No hay datos capturados. Use la opción 1.'
			FinSi
		FinSi
		Si opc=3 Entonces
			Si n>0 Entonces
				suma <- 0
				Para i<-1 Hasta n Con Paso 1 Hacer
					suma <- suma+arreglo[i]
				FinPara
				promedio <- suma/n
				Escribir 'La suma total es: ', suma
				Escribir 'El promedio es: ', promedio
			SiNo
				Escribir 'No hay datos para calcular el promedio. Use la opción 1.'
			FinSi
		FinSi
		Si opc=4 Entonces
			Escribir 'Saliendo del programa...'
		FinSi
		Si opc<>1 Y opc<>2 Y opc<>3 Y opc<>4 Entonces
			Escribir 'Opción inválida. Intente nuevamente.'
		FinSi
	FinMientras
FinAlgoritmo

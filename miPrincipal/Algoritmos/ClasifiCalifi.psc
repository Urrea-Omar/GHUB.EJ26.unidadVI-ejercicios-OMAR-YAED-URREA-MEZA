Algoritmo ClasifiCalifi
	// Autor: Urrea Meza Omar Yaed
	// Fecha: 08/05/2026
	// Proposito:Elaborar un algoritmo que clasifique las calificaciones de los alumnos.
	Definir n, i, calif Como Entero
	Definir A, B, C, D, F Como Entero
	Escribir 'Cuantos alumnos son: '
	Leer n
	Dimensionar notas(n)
	A <- 0
	B <- 0
	C <- 0
	D <- 0
	F <- 0
	Para i<-1 Hasta n Hacer
		Escribir 'Ingresa la calificacion ', i, ' : '
		Leer notas[i]
		calif <- notas[i]
		Si calif>=90 Entonces
			A <- A+1
		SiNo
			Si calif>=80 Entonces
				B <- B+1
			SiNo
				Si calif>=70 Entonces
					C <- C+1
				SiNo
					Si calif>=60 Entonces
						D <- D+1
					SiNo
						F <- F+1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir 'La cantidad de alumnos por categoria son:'
	Escribir 'A: ', A
	Escribir 'B: ', B
	Escribir 'C: ', C
	Escribir 'D: ', D
	Escribir 'F: ', F
FinAlgoritmo

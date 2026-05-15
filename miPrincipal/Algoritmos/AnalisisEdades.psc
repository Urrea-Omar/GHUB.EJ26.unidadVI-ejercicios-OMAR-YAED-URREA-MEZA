Algoritmo AnalisisEdades
    Definir n, i, j, mayores, edad, maxFreq, prom, frecuencia como Entero
    Definir tieneMenor como logico
    Escribir "Ingrese el número de personas: "
    Leer n
    Si n <= 0 Entonces
        Escribir "El número debe ser mayor a 0."
    FinSi
	
    Dimensionar edades[n]
    Escribir "Ingrese las edades:"
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Escribir "Edad persona ", i, ": "
        Leer edades[i]
    FinPara
	
    mayores <- 0
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Si edades[i] >= 18 Entonces
            mayores <- mayores + 1
        FinSi
    FinPara
	
    maxFreq <- 0
    prom <- 0
    Para i <- 1 Hasta n Con Paso 1 Hacer
        edad <- edades[i]
        frecuencia <- 0
        Para j <- 1 Hasta n Con Paso 1 Hacer
            Si edades[j] == edad Entonces
                frecuencia <- frecuencia + 1
            FinSi
        FinPara
        Si frecuencia > maxFreq Entonces
            maxFreq <- frecuencia
            prom <- edad
        FinSi
    FinPara
	
    tieneMenor <- Falso
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Si edades[i] < 18 Entonces
            tieneMenor <- Verdadero
        FinSi
    FinPara
    
    Escribir ""
    Escribir "Resultados"
    Escribir "Mayores de edad (>= 18): ", mayores
    Escribir "Promedio de edad: ", prom
    Si tieneMenor Entonces
        Escribir "¿Hay menores de edad? Sí."
    Sino
        Escribir "¿Hay menores de edad? No."
    FinSi
FinAlgoritmo
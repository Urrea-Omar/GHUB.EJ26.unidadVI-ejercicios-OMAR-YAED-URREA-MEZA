Algoritmo Frecuencia
    Definir n, i, j, num, numV como Entero
    Definir p como Logico
    Escribir "Ingrese el tamaño del arreglo: "
    Leer n
    
Si n <= 0 Entonces
        Escribir "Error: El tamaño debe ser mayor a 0."
	Sino
        Dimension d[n]
        Dimension p[n]
		
        Para i <- 1 Hasta n Con Paso 1 Hacer
            p[i] <- Falso
        FinPara 
		
        Escribir "Ingrese los elementos del arreglo:"
        Para i <- 1 Hasta n Con Paso 1 Hacer
            Escribir "Elemento [", i, "]: "
            Leer d[i]
        FinPara
		
        Escribir "Su Frecuencia es:"
        
        Para i <- 1 Hasta n Con Paso 1 Hacer
            Si p[i] = Falso Entonces
                num <- d[i]
                numV <- 0
                
                Para j <- 1 Hasta n Con Paso 1 Hacer
                    Si d[j] == num Entonces
                        numV <- numV + 1
                        Si j <> i Entonces
                            p[j] <- Verdadero
                        FinSi
                    FinSi
                FinPara
                
                p[i] <- Verdadero
                
                Si numV = 1 Entonces
                    Escribir "El número ", num, " aparece 1 vez."
                Sino
                    Escribir "El número ", num, " aparece ", numV, " veces."
                FinSi
            FinSi
        FinPara
    FinSi
    
FinAlgoritmo
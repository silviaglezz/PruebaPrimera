# PruebaPrimera
Este proyecto en Java implementa un sistema de gestión de vehículos que incluye diferentes tipos de vehículos, como Coche y Camion. Cada vehículo hereda de una clase base llamada Vehículo y también implementa una interfaz Conducible, que define las acciones comunes que un vehículo puede realizar.

## 1. Clase Vehiculo
Este es un proyecto Java que define la clase abstracta Vehiculo.

### 1.1. Descripción
La clase Vehiculo representa un vehículo genérico y se utiliza como clase base para los diferentes vehículos. La clase tiene un atributo para conocer el número de ruedas de cada vehículo. Esta clase no tiene funcionalidades ya que estas son definidas en la interfaz. 

### 1.2. Uso
Para utilizar la clase Vehiculo, se tiene que crear una clase hija que extienda de Vehiculo para poder llamar al getNumRuedas() o usar el constructor.

### 1.3. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

## 2. Clase Conducible 
Este es un proyecto Java que define la interfaz Conducible.

### 2.1. Descripción
La interfaz Conducible define las acciones básicas de un vehículo. En la interfaz Conducible se definen los métodos conducir(), avanzar(int metros), retroceder(int metros) y parar(). Estos métodos se implementarán en aquellas clases que implementen esta interfaz. 

### 2.2. Uso
Para utilizar la interfaz Conducible, se tiene que crear una clase que implemente dicha interfaz para poder implementar los diferentes métodos definidos en Conducible.

### 2.3. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

## 3. Clase Coche
Este es un proyecto Java que define la clase Coche, que extiende de la clase Vehiculo y que implementa la interfaz Conducible.

### 3.1. Descripción
La clase Coche representa un vehículo y se utiliza para instanciar objetos que contienen información sobre el color y la matrícula del coche. Además de los métodos que provienen de la interfaz Conducible, esta clase también tiene un método para calcular la velocidad media del coche durante su trayecto.

### 3.2. Funcionalidades
La clase Coche tiene las siguientes funcionalidades:
Constructor: Crea una instancia de Coche con un color y una matrícula.
- conducir(): Arranca el coche y establece la hora de inicio del viaje. Si el coche ya está en marcha, muestra un mensaje de aviso.
- avanzar(int metros): Avanza el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso. 
- retroceder(int metros): Retrocede el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso.
- parar(): Para el coche y muestra el tiempo total del viaje. Si el coche no está en marcha, muestra un mensaje de aviso.
- calcularVelocidad(): Calcula la velocidad media al obtener el tiempo total del viaje y el espacio recorrido. Si el tiempo total del viaje es menor que 0 se muestra un mensaje de error.

### 3.3. Uso
Para utilizar la clase Coche, primero se debe instanciar un objeto pasando los argumentos adecuados al constructor. Luego, se puede llamar a los métodos descritos en las funcionalidades según sea necesario.

### 3.4. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

## 4. Clase Camion
Este es un proyecto Java que define la clase Camion, que extiende de la clase Vehiculo y que implementa la interfaz Conducible.

### 4.1. Descripción
La clase Camion representa un vehículo y se utiliza para instanciar objetos que contienen información sobre el tacómetro, que es una lista que guarda las velocidades. Esta clase solo implementa los métodos de la interfaz Conducible.

### 4.2. Funcionalidades
La clase Camion tiene las siguientes funcionalidades:
Constructor: Crea una instancia de Camion.
- conducir(): Arranca el camión y establece la hora de inicio del viaje. Si el camión ya está en marcha, muestra un mensaje de aviso.
- avanzar(int metros): Avanza el camión la cantidad de metros indicada. Se calcula la velocidad del tramo recorrido y se añade al tacómetro. Si el camión no está en marcha, muestra un mensaje de aviso. 
- retroceder(int metros): Retrocede el camión la cantidad de metros indicada. Se calcula la velocidad del tramo recorrido y se añade al tacómetro. Si el camión no está en marcha, muestra un mensaje de aviso. 
- parar(): Para el camión y muestra el tiempo total del viaje. Si el tacómetro tiene velocidades, se calcula la velocidad media y se muestran las velocidades máxima, mínima y media. Si el camión no está en marcha, muestra un mensaje de aviso. 

### 4.3. Uso
Para utilizar la clase Camion, primero se debe instanciar un objeto. Luego, se puede llamar a los métodos descritos en las funcionalidades según sea necesario.

### 4.4. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

## 5. Clase Main 
Este es un proyecto Java que define la clase principal Main.

### 5.1. Descripción
La clase Main es aquella donde se crean los diferentes objetos y se llaman a los métodos de estos. 

### 5.2. Funcionalidades
La clase Main tiene la siguiente funcionalidad:
- esperar(): Se hace una espera mediante un Thread.

### 5.3. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

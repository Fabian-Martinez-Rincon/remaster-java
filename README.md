Cree este repo para repasar un poco la logica de java para resolver una prueba tecnica

---

- [Link del un video con la prueba realizada](https://youtu.be/npfzSC8B3aM?si=MvKzdfPiAVr3kAoP)

### 1era Parte

Suponer un sistema de reserva de asientos para un anfiteatro. El teatro cuenta con **10 filas de 10 asientos cada una**.
Se necesita desarrollar un sistema (sin uso de bases de datos, únicamente manejo de datos de forma lógica) que permita llevar a cabo lo siguiente:

---

#### 1. Cargar el “mapa” de las filas y asientos

* Indicar con una **"X"** los asientos ocupados y con una **"L"** los asientos libres.
* Al iniciar el programa, todos los asientos deben estar libres.



---

#### 2. Manejar la **reserva de asientos**

Contemplando que un asiento **solo puede ser reservado** si se encuentra en estado **"L"**.
En caso de que esté en estado **"X"**, se deberá permitir al comprador elegir otro asiento.
Si se encuentra en estado **"L"**, deberá pasar automáticamente al estado **"X"**.

---

#### 3. Ingresar un valor para finalizar el programa

Para completar el programa, se debe ingresar un valor en particular.
Contemplar que no existe una cantidad exacta de veces que el programa se pueda ejecutar.

---

#### 4. Validaciones

* Contemplar que **solo existen 10 filas y 10 asientos**.
* No se pueden vender asientos fuera de esas numeraciones.
* No se permite “sobreventa”.

---

#### Consideraciones

* **No es necesaria implementación de IGU ni BD**.
* Se evaluará **100% la lógica del desarrollo de la aplicación**.

---

#### Extra

En caso de que un cliente solicite visualizar cuáles son los asientos libres, el sistema debe permitir **mostrar de forma gráfica el mapa de asientos**.
**No utilizar IGU para este caso.**
Utilizar **únicamente lógica** y la salida por consola.

---



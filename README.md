<h1>Conversor de Monedas</h1>

**Bienvenido/a al Conversor de Monedas**

Este proyecto es una aplicación Java que permite convertir valores entre diferentes monedas utilizando una API externa para obtener las tasas de conversión actualizadas.

---

## **Características Principales**

- **Interfaz de Usuario por Consola**: Permite al usuario seleccionar entre varias opciones de conversión.
- **API Externa**: Obtiene tasas de cambio actualizadas en tiempo real mediante la API `exchangerate-api`.
- **Diseño Modular**: El proyecto está organizado en tres paquetes principales: `Consultas`, `Modelos` y `Principal`.

---

## **Estructura del Proyecto**

### **Paquetes y Clases**

1. ### **Consultas**
   - **ConsultaConversor**: 
     - Conecta con la API para obtener las tasas de cambio según el código de moneda especificado.
   - **FiltroMoneda**:
     - (Actualmente sin implementación).

2. ### **Modelos**
   - **Moneda**:
     - Un `record` que representa los datos de la moneda, incluyendo el código de la moneda y su valor.

3. ### **Principal**
   - **Principal**:
     - Contiene el menú principal del programa, donde el usuario puede seleccionar opciones de conversión e ingresar los valores a convertir.

---

## **Flujo del Programa**

1. El usuario selecciona una opción de conversión desde un menú.
   ![Ejemplo de Menú](assets/menu-example.png)

2. El usuario ingresa el valor que desea convertir.

3. El programa consulta la API externa para obtener la tasa de cambio actual.

4. Muestra el resultado de la conversión en la consola.
   ![Resultado de Conversión](assets/conversion-example.png)


---

## **Requisitos del Sistema**

- **Java**: Versión 11 o superior.
- **Librerías Externas**:
  - [Gson](https://github.com/google/gson): Para manipulación de JSON.

---

## **Uso del Programa**

1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/usuario/conversor-monedas.git
   ```

2. **Compilar y Ejecutar**:
   ```bash
   cd conversor-monedas
   javac -d bin src/**/*.java
   java -cp bin Principal.Principal
   ```

3. **Interacción**:
   - Selecciona una opción del menú.
   - Ingresa el valor a convertir.
   - Consulta los resultados en la consola y en el archivo `ConversionDeMoneda.json`.

---

## **Notas Técnicas**

### **Configuración de la API**
La API utilizada es `exchangerate-api`. El enlace base para las consultas es:
```
https://v6.exchangerate-api.com/v6/15ebc6b3b2c181b3d979e4ae/latest/{codigoDeMoneda}
```
- Reemplaza `{codigoDeMoneda}` con el código de moneda deseado (por ejemplo, `USD` o `EUR`).

### **Extensiones Posibles**
- Implementar filtros personalizados en `FiltroMoneda`.
- Añadir soporte para más monedas.
- Mejorar la interfaz gráfica (por ejemplo, con JavaFX o Swing).

---

## **Autor**
Desarrollado por: Alder Somoza

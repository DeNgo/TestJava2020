## 🌐 Accede al Índice

Antes de realizar las pruebas, te recomindo acceder a la **página de índice** de la API para ver todos los detalles y ejemplos de consulta.  
La página de índice está disponible en:

[http://localhost:8080](http://localhost:8080)

En la página de índice encontrarás enlaces a los distintos ejemplos de consulta.


## 📋 Ejemplos de consulta

Consulta 1 http://localhost:8080/api/prices?applicationDate=2020-06-14-10.00.00&productId=35455&brandId=1

Consulta 2 http://localhost:8080/api/prices?applicationDate=2020-06-14-16.00.00&productId=35455&brandId=1

Consulta 3 http://localhost:8080/api/prices?applicationDate=2020-06-14-21.00.00&productId=35455&brandId=1

Consulta 4 http://localhost:8080/api/prices?applicationDate=2020-06-15-10.00.00&productId=35455&brandId=1

Consulta 5 http://localhost:8080/api/prices?applicationDate=2020-06-16-21.00.00&productId=35455&brandId=1

## 📄 Respuesta esperada

La respuesta será un objeto JSON con la siguiente estructura:

```json
{
  "id": 1,
  "brandId": 1,
  "startDate": "2020-06-14T00:00:00",
  "endDate": "2020-12-31T23:59:59",
  "priceList": 1,
  "productId": 35455,
  "priority": 0,
  "price": 35.5,
  "currency": "EUR"
}

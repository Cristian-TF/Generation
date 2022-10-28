/* 1) ----------------------------------------------------------------------------------
Respuesta: 
Definir variables = descuento: (Martes, jueves)
Definir variables = NoDescuento: (Lunes,Miercoles, Viernes, Sabado, Domingo)
Definir Productos = A, B, C, D.
Definir precioProducto = (A ==1000, B ==500, C==650, D==8000)

1)	Se aplica que la consola pregunte al usuario, di de compra en caso de ser martes o jueves. Aplicar descuento.. de lo contrario el no descuento.
Función condicional IF : { Si la compra se realiza el martes y jueves paga el 80% del valor (100%-20%); se escribe en consola “El producto tiene descuento del 20%” }
Return: se retorna el total final de la compra aplicando descuento del 20%. (con la sumatoria de los productos ((A,B,C,D) * 0.8%.))
{Else; (de lo contrario) se escribe en consola “El producto no tiene descuento por no ser dia martes o jueves” por lo que se muestra el 100% del valor.
Return: Se retorna el total de la compra sin aplicar descuento. ((A, B, C, D) * 1)

2)……………………………………………………………………………………….

Definir Productos = A, B, C, D.
Definir precioProducto = (A1 ==1000, B2 ==500, C3==650, D4==8000)
Se aplica que la consola pregunte al usuario cuantos productos va a comprar.
En caso de ser 3 o mas productos. Agregar esos productos.
Si la sumatoria de esos productos ingresados es mayor a 10.000 se produce descuento de lo contrario no se produce descuento.
Función condicional IF: SI Sumatoria de productos (a,b,c,d) > 10.000), se cumple la función y se aplica en consola “se cumple el descuento del 5%”
Return: Producto*precioProducto (según lo que haya indicado el usuario) y se realiza la sumatoria. Si pasa los 10.000. Se retorna el 10.000 * 0.95 (100%-5%). 
De lo contrario, Else se conserva el valor original. El retorno seria de 10.000 * 1.

3)---------------------------------------------------------------------------------------------------

Definir Productos = A, B, C, D.
Definir precioProducto = (A1 ==1000, B2 ==500, C3==650, D4==8000)
-Se le da la opción al usuario de escribir en consola, si el producto que va a ingresar es positivo o negativo. En caso de que sea negativo, mostrar en consola. Un error con el mensaje al usuario que vuelva a ingresar un numero positivo y luego hacer el bucle para que vuelva a preguntar hasta que muestre los números correctamente, asi la maquina no usara números negativos.
Se realiza una función verificadora, para saber si hay valores negativos. Si se cumple agregar mensaje de éxito. De lo contrario se retorna el error junto al valor negativo.
-Bucle Do While, el usuario debe ingresar un numero de un rango desde 0>100.000. Si no cumple con algún numero de ese rango le volverá a preguntar, hasta que si lo haga. 
-Luego aplicar la función if: Si se cumple que entrego un numero positivo, se entrega el mensaje en consola, que entrego número positivo.
Se retorna el número positivo en pantalla.
De lo contrario (else) se entrega en mensaje que de” error y que ingrese otro número que sea positivo”
Return: Se muestra número negativo.

------------------------------------------------------------------------------------------------------

4)
Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
producto

Se crea un array list con estos números (200, 5500, 900, 7000, 500, 300)
Luego permitir escribir al usuario en consola, cual es el valor mas costoso de una lista. Si ingresa el numero mas alto se muestra en consola. Si elige === 7000 la consola muestra en pantalla “has acertado”. Y Se retorna 7000 con la felicitación.
 De lo contrario (else) se muestra en pantalla “has fallado, vuelve a intentar”, se crea un bucle que lo re elige nuevamente para empezar denuevo. 
Luego se hace el mismo procedimiento pero aplicado al numero pequeño. Pero en donde la respuesta es 200. Se muestra el “has acertado” si elige ese número. De lo contrario se muestra en pantalla “has fallado, vuelve a intentar” aplica el bucle para que empiece de nuevo.
----------------------------------------------------------------------------------------------------

*/
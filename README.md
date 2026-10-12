https://github.com/domesalinas/taller_programacion3/commits/main/


Cada integrante tuvo un papel importante en el desarrollo de este programa

DOMENICA SALINAS

Valida que el asiento esté entre 1 y 30.

Verifica que el asiento no esté ya ocupado en la fila.

Si hay error lanza IllegalArgumentException. Si está todo bien, lo agrega al final con offer().


ISABELLA ALBUJA

Implementa el método buscarPorAsiento(int asiento).

Valida que el asiento esté entre 1 y 30 (lanza IllegalArgumentException).

Recorre la fila (puede usar un for-each) buscando el asiento. Si lo encuentra, devuelve al pasajero; si no, devuelve null. No debe sacar al pasajero de la fila.


MARTIN INOJOSA


Implementa el método posicionPorAsiento(int asiento).

Valida que el asiento esté entre 1 y 30 (lanza IllegalArgumentException).

Recorre la fila llevando un contador numérico (inicia en 1). Si encuentra el asiento, devuelve el contador. Si termina de revisar y no está, devuelve -1.


JORDY


 Implementa el método cancelarPorAsiento(int asiento).

Valida que el asiento esté entre 1 y 30 (lanza IllegalArgumentException).


MARTIN CAAJAS


Si no encuentra al pasajero, lanza NoSuchElementException.

Si lo encuentra, lo elimina usando el método remove(pasajero) de LinkedList (que saca a esa persona y junta a los demás conservando el orden) y devuelve el pasajero eliminado.

Tabla 
1. Doménica Salinas
Usuario de GitHub: domesalinas
Qué desarrolló: Valida rango de asiento (1-30) y no repetición. Lanza IllegalArgumentException o agrega al pasajero con offer().
Enlace a su commit:https://github.com/domesalinas/taller_programacion3/commit/4221ec423c32e197c973cda34baffd7160f3a088 
https://github.com/domesalinas/taller_programacion3/commit/c206c3aa2bcb3dc1f8fb7c97d0b7228cb817d8e4

2. Isabella Albuja
Usuario de GitHub: monserraths-bit
Qué desarrolló: Implementa buscarPorAsiento(int). Valida rango. Recorre la fila buscando asiento y devuelve al pasajero o null sin extraerlo.
Enlace a su commit: https://github.com/domesalinas/taller_programacion3/commit/c9cb97c1c26d785bddb955b0429ad697c19973eb

3. Martín Hinojosa
Usuario de GitHub: martihinojosar
Qué desarrolló: Implementa posicionPorAsiento(int). Valida rango. Recorre la fila con un contador numérico; devuelve el contador o -1.
Enlace a su commit: https://github.com/domesalinas/taller_programacion3/commit/da21985691d89cc902ebd24b74c1a6d0b1a0d582

4. Jordy
Usuario de GitHub: jordy-paz
Qué desarrolló: Implementa la primera parte de cancelarPorAsiento(int). Valida que el asiento esté entre 1 y 30 lanzando IllegalArgumentException.
Enlace a su commit: https://github.com/domesalinas/taller_programacion3/commit/6dbe35dd9d78630df83936b65e816c6fbf939e17

5. Martín Cajas
Usuario de GitHub: martincajas27-ui
Qué desarrolló: Finaliza cancelarPorAsiento(int). Lanza NoSuchElementException si no encuentra; si encuentra, elimina con remove() conservando el orden.
Enlace a su commit: https://github.com/domesalinas/taller_programacion3/commit/265783491c5500a48316285f9c75ac06570cafe5
https://github.com/domesalinas/taller_programacion3/commit/b7d7e1c4af267e402514393597e799111e761c2c


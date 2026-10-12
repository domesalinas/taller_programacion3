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

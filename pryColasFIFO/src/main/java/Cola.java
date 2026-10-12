import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Cola {
    private final Queue<Pasajero> coleccion;

    public Cola() {
        coleccion = new LinkedList<>();
    }

    public void agregar(Pasajero p) {
        //Validamos que el pasajero no sea null o que su nombre no sea invalido(vacios o espacios).
        //Utilizamos el trim como mas seguridad para borrar los espacios del principio y final
        if (p == null|| p.getNombre() == null|| p.getNombre().trim().isEmpty())  {
            throw new IllegalArgumentException("El pasajero o nombre no son validos");
        }
        //Ver que no tengan el mismo numero de asiento
        for (Pasajero existente : coleccion) { //Bucle for each
            if(existente.getNumeroAsiento() == p.getNumeroAsiento()){
                throw new IllegalArgumentException("El numero de asiento ya esta ocupado");
            }
        }
        //Contadores de los  tres tipos de clase
        int contPrimera=0;
        int contEjecutiva=0;
        int contEconomica=0;
        //Ver si esta llena los tipos de clases
        for (Pasajero existente : coleccion) {
            String tipo = existente.getTipoAsiento();
            if (tipo.equals("PRIMERA CLASE")) {
                contPrimera++;
            } else if (tipo.equals("EJECUTIVA")) {
                contEjecutiva++;
            } else if (tipo.equals("ECONOMICA")) {
                contEconomica++;
            }
        }

        // Validar que el nombre solo contenga letras y espacios
        String nombre = p.getNombre();
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);

            // Si el caracter NO es una letra y NO es un espacio, lanza el error
            if (!Character.isLetter(caracter) && caracter != ' ') {
                throw new IllegalArgumentException("El nombre solo puede contener letras y espacios.");
            }
        }
        // Validar límites estrictos
        String nuevoTipo = p.getTipoAsiento();
        if (nuevoTipo.equals("PRIMERA CLASE") && contPrimera >= 6) {
            throw new IllegalArgumentException("¡Primera Clase llena! Máximo 6 asientos.");
        }
        if (nuevoTipo.equals("EJECUTIVA") && contEjecutiva >= 9) {
            throw new IllegalArgumentException("¡Clase Ejecutiva llena! Máximo 9 asientos.");
        }
        if (nuevoTipo.equals("ECONOMICA") && contEconomica >= 15) {
            throw new IllegalArgumentException("¡Clase Económica llena! Máximo 15 asientos.");
        }

        coleccion.offer(p);
    }

    public Pasajero extraer() {
        if (coleccion.isEmpty()) {
            throw new NoSuchElementException("Cola sin elementos");
        }
        return coleccion.poll();
    }

    public Pasajero frente() {
        if (coleccion.isEmpty()) {
            throw new NoSuchElementException("Cola sin elementos");
        }
        return coleccion.peek();
    }

    public int size() {
        return coleccion.size();
    }

    public boolean estaVacia() {
        return coleccion.isEmpty();
    }

    public List<Pasajero> obtenerPendientes() {
        return Collections.unmodifiableList(new ArrayList<>(coleccion));
    }

    public Pasajero buscarPorAsiento(int asiento) {
        // 1. Validar que el asiento esté entre 1 y 30
        if (asiento < 1 || asiento > 30) {
            throw new IllegalArgumentException("El asiento debe estar entre 1 y 30.");
        }

        // 2. Buscar al pasajero iterando sobre la colección (sin sacarlo de la fila)
        for (Pasajero p : coleccion) {
            if (p.getNumeroAsiento() == asiento) {
                return p;
            }
        }

        // 3. Si termina de revisar a todos y no lo encuentra, devuelve null
        return null;
    }

    public int posicionPorAsiento(int asiento) {
        // TODO R2: posiciones desde 1; devolver -1 si no está en la fila.
        throw new UnsupportedOperationException("Pendiente implementar R2: posición");
    }

    public Pasajero cancelarPorAsiento(int asiento) {
        // TODO R3: retirar únicamente al indicado y conservar el orden restante.
        throw new UnsupportedOperationException("Pendiente implementar R3: cancelación");
    }

    @Override
    public String toString() {
        if (coleccion.isEmpty()) {
            return "Cola sin elementos";
        }
        StringBuilder sb = new StringBuilder();
        int posicion = 1;
        for (Pasajero p : coleccion) {
            sb.append(posicion++).append(". ").append(p).append("\n");
        }
        return sb.toString();
    }
}

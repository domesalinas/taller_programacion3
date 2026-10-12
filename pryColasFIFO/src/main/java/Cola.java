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
        // 1. Validar que el pasajero o su nombre no sean nulos o vacíos
        if (p == null || p.getNombre() == null || p.getNombre().trim().isEmpty())  {
            throw new IllegalArgumentException("El pasajero o nombre no son validos");
        }

        // 2. Validar estrictamente el rango del asiento (1 a 30) al inicio
        if (p.getNumeroAsiento() < 1 || p.getNumeroAsiento() > 30) {
            throw new IllegalArgumentException("El asiento debe estar entre 1 y 30.");
        }

        // 3. Validar que no tengan el mismo número de asiento repetido
        for (Pasajero existente : coleccion) {
            if(existente.getNumeroAsiento() == p.getNumeroAsiento()){
                throw new IllegalArgumentException("El numero de asiento ya esta ocupado");
            }
        }

        // 4. Contadores de los tipos de clase
        int contPrimera = 0;
        int contEjecutiva = 0;
        int contEconomica = 0;

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

        // 5. Validar que el nombre solo contenga letras y espacios
        String nombre = p.getNombre();
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            if (!Character.isLetter(caracter) && caracter != ' ') {
                throw new IllegalArgumentException("El nombre solo puede contener letras y espacios.");
            }
        }

        // 6. Validar límites de capacidad por clase
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
        if (asiento < 1 || asiento > 30) {
            throw new IllegalArgumentException("El asiento debe estar entre 1 y 30.");
        }
        for (Pasajero p : coleccion) {
            if (p.getNumeroAsiento() == asiento) {
                return p;
            }
        }
        return null;
    }

    public int posicionPorAsiento(int asiento) {
        // Validación de rango R2
        if (asiento < 1 || asiento > 30) {
            throw new IllegalArgumentException("El asiento debe estar entre 1 y 30.");
        }

        // Recorrido con contador externo respetando orden FIFO
        int contador = 1;
        for (Pasajero p : coleccion) {
            if (p.getNumeroAsiento() == asiento) {
                return contador;
            }
            contador++;
        }
        return -1;
    }

    public Pasajero cancelarPorAsiento(int asiento) {
        // R3:
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
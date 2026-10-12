public class Pasajero {
    private final String nombre;
    private final int numeroAsiento;
    private final String tipoAsiento;
    private final String fecha;
    private final String hora;
    private final double precio;
    private boolean checkin;

    // Constructor completo
    public Pasajero(String nombre, int numeroAsiento, String tipoAsiento, String fecha, String hora) {
        this.nombre = nombre;
        this.numeroAsiento = numeroAsiento;
        this.tipoAsiento = tipoAsiento;
        this.fecha = fecha;
        this.hora = hora;

        double p = 0.0;
        if (tipoAsiento.equals("PRIMERA CLASE")) {
            p = 150.0;
        } else if (tipoAsiento.equals("EJECUTIVA")) {
            p = 100.0;
        } else if (tipoAsiento.equals("ECONOMICA")) {
            p = 60.0;
        }
        this.precio = p;
        this.checkin = false;
    }

    // Constructor de 3 argumentos (vital para las pruebas unitarias)
    public Pasajero(String nombre, int numeroAsiento, String tipoAsiento) {
        this(nombre, numeroAsiento, tipoAsiento,
                java.time.LocalDate.now().toString(),
                java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm")));
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }

    @Override
    public String toString() {
        return nombre + " | Asiento: " + numeroAsiento
                + " | " + tipoAsiento + " | Fecha: " + fecha
                + " | Hora: " + hora + " | Precio: $" + precio
                + " | Check-in: " + checkin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return numeroAsiento == pasajero.numeroAsiento;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(numeroAsiento);
    }
}

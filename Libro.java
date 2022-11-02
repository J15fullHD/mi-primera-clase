public class Libro {
    
    private String titulo;
    private int numPaginas;
    private boolean abierto;
    
    public Libro(String miTitulo, int otroNumPaginas, boolean estadoAbierto) {
        titulo = miTitulo;
        numPaginas = otroNumPaginas;
        abierto = estadoAbierto;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public boolean isAbierto() {
        return abierto;
    }
    
    public void setTitulo(String otroTitulo) {
        titulo = otroTitulo;
    }
    
    public void aniadirPaginas(int sumaPaginas) {
        numPaginas = numPaginas + sumaPaginas;
    }
    
    public void abrirCerrar() {
        if(abierto == true) {
            abierto = false;
        } else {
            abierto = true;
        }
    }
    
    public void imprimirDetalles() {
        String estado;
        if(abierto == true) {
            estado = "abierto";
        } else {
            estado = "cerrado";
        }
        System.out.println("El libro se llama " + titulo + " | Este libro tiene " + numPaginas + " paginas | Es libro esta " + estado);
    }
    
    public String getDetalles() {
        String detalles;
        String estado;
        if(abierto == true) {
            estado = "abierto";
        } else  {
            estado = "cerrado";
        }
        detalles = "El libro se llama " + titulo + " | Este libro tiene " + numPaginas + " paginas | Es libro esta " + estado;
        return detalles;
    }
}
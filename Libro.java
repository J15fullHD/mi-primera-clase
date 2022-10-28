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
        if(abierto == true) {
           System.out.println("El libro se llama " + titulo + " | Este libro tiene " + numPaginas + " paginas | Es libro esta abierto"); 
        } else {
            System.out.println("El libro se llama " + titulo + " | Este libro tiene " + numPaginas + " paginas | Es libro esta cerrado");
        }
    }
    
    public String getDetalles() {
        String detalles;
        detalles = "El libro se llama " + titulo + " | Este libro tiene " + numPaginas + " paginas | El libro esta: " + abierto;
        return detalles;
    }
}
public class Libro {
    
    private String titulo;
    private int numPaginas;
    private boolean abierto;
    
    public Libro() {
        titulo = "Hamlet";
        numPaginas = 800;
        abierto = false;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public boolean getAbierto() {
        return abierto;
    }
    
    public void setTitulo(String otroTitulo) {
        titulo = otroTitulo;
    }
    
    public void aniadirPaginas(int num) {
        numPaginas = numPaginas + num;
    }
    
    public void abrirCerrar() {
        if(abierto == true) {
            abierto = false;
        } else {
            abierto = true;
        }
    }
    
    public void imprimirDetalles() {
        System.out.println("El libro se llama " + titulo);
        System.out.println("Este libro tiene " + numPaginas + " paginas");
        System.out.println("El libro esta abierto: " + abierto);
    }
    
    public void getDetalles() {
        System.out.println("El libro se llama " + titulo + " | Este libro tiene " + numPaginas + " paginas | Es libro esta : " + abierto);
    }
}
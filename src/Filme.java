public class Filme {

    private String titulo;
    private String genero;

    public Filme(String titulo, String genero){
        setTitulo(titulo);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Titulo:"+getTitulo()+"\nGenero:"+getGenero();
    }

}

package dominio;

public class Curso extends Conteudo {
    
    private int cargaHoraria;

    public Curso () {

    }

    @Override
    public String toString() {
        return "Mentoria{" + 
        "titulo='" + getTitulo() + "\'" + 
        ", descricao='" + getDescricao() + "\'" +
        ", cargaHoraria='" + this.cargaHoraria + "\'" + 
        ", XP='" + XP_PADRAO + "\'" +
        "}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    

}

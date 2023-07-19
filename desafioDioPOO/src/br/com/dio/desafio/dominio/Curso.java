package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }
    private String titulo;
    private String descricao;

    private int CargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", CargaHoraria='" + CargaHoraria + '\'' +
                '}';
    }
}

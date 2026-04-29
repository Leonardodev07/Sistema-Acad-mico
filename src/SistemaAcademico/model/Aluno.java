package SistemaAcademico.model;

public class Aluno {
	
	DadosPessoais dados;
	Curso curso;
	NotasEFaltas notas;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(DadosPessoais dados, Curso curso, NotasEFaltas notas) {
		super();
		this.dados = dados;
		this.curso = curso;
		this.notas = notas;
	}

	public DadosPessoais getDados() {
		return dados;
	}

	public void setDados(DadosPessoais dados) {
		this.dados = dados;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public NotasEFaltas getNotas() {
		return notas;
	}

	public void setNotas(NotasEFaltas notas) {
		this.notas = notas;
	}
	
	

}

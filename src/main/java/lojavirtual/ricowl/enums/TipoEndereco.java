package lojavirtual.ricowl.enums;

public enum TipoEndereco {

	
	COBRANCA("Cobrança"),
	ENTREGA("Entrrega");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		
		return this.descricao;
	}
	
}

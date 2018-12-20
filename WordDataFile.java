public class WordDataFile
{
	private int idn_empreendimento;
	private int idn_digs;
	private String dsc_titulo;
	private String investimento_total;
	private String sig_uf;
	private String txt_municipios;
	private String txt_executores;
	private String dsc_orgao;
	private int idn_estagio;
	private int dat_ciclo;
	private int dat_selecao;
	private int dat_conclusao_revisada;
	private String obra_latitude;
	private String obra_longitude;
	private String emblematica;
	private String observacao;

	public WordDataFile() {
	}

	public WordDataFile(final int idn_empreendimento, final int idn_digs, final String dsc_titulo, final String investimento_total,
						final String sig_uf,
						final String txt_municipios, final String txt_executores, final String dsc_orgao, final int idn_estagio,
						final int dat_ciclo,
						final int dat_selecao, final int dat_conclusao_revisada, final String obra_latitude,
						final String obra_longitude,
						final String emblematica, final String observacao) {
		this.idn_empreendimento = idn_empreendimento;
		this.idn_digs = idn_digs;
		this.dsc_titulo = dsc_titulo;
		this.investimento_total = investimento_total;
		this.sig_uf = sig_uf;
		this.txt_municipios = txt_municipios;
		this.txt_executores = txt_executores;
		this.dsc_orgao = dsc_orgao;
		this.idn_estagio = idn_estagio;
		this.dat_ciclo = dat_ciclo;
		this.dat_selecao = dat_selecao;
		this.dat_conclusao_revisada = dat_conclusao_revisada;
		this.obra_latitude = obra_latitude;
		this.obra_longitude = obra_longitude;
		this.emblematica = emblematica;
		this.observacao = observacao;
	}

	public int getIdn_empreendimento() {
		return idn_empreendimento;
	}

	public void setIdn_empreendimento(final int idn_empreendimento) {
		this.idn_empreendimento = idn_empreendimento;
	}

	public int getIdn_digs() {
		return idn_digs;
	}

	public void setIdn_digs(final int idn_digs) {
		this.idn_digs = idn_digs;
	}

	public String getDsc_titulo() {
		return dsc_titulo;
	}

	public void setDsc_titulo(final String dsc_titulo) {
		this.dsc_titulo = dsc_titulo;
	}

	public String getInvestimento_total() {
		return investimento_total;
	}

	public void setInvestimento_total(final String investimento_total) {
		this.investimento_total = investimento_total;
	}

	public String getSig_uf() {
		return sig_uf;
	}

	public void setSig_uf(final String sig_uf) {
		this.sig_uf = sig_uf;
	}

	public String getTxt_municipios() {
		return txt_municipios;
	}

	public void setTxt_municipios(final String txt_municipios) {
		this.txt_municipios = txt_municipios;
	}

	public String getTxt_executores() {
		return txt_executores;
	}

	public void setTxt_executores(final String txt_executores) {
		this.txt_executores = txt_executores;
	}

	public String getDsc_orgao() {
		return dsc_orgao;
	}

	public void setDsc_orgao(final String dsc_orgao) {
		this.dsc_orgao = dsc_orgao;
	}

	public int getIdn_estagio() {
		return idn_estagio;
	}

	public void setIdn_estagio(final int idn_estagio) {
		this.idn_estagio = idn_estagio;
	}

	public int getDat_ciclo() {
		return dat_ciclo;
	}

	public void setDat_ciclo(final int dat_ciclo) {
		this.dat_ciclo = dat_ciclo;
	}

	public int getDat_selecao() {
		return dat_selecao;
	}

	public void setDat_selecao(final int dat_selecao) {
		this.dat_selecao = dat_selecao;
	}

	public int getDat_conclusao_revisada() {
		return dat_conclusao_revisada;
	}

	public void setDat_conclusao_revisada(final int dat_conclusao_revisada) {
		this.dat_conclusao_revisada = dat_conclusao_revisada;
	}

	public String getObra_latitude() {
		return obra_latitude;
	}

	public void setObra_latitude(final String obra_latitude) {
		this.obra_latitude = obra_latitude;
	}

	public String getObra_longitude() {
		return obra_longitude;
	}

	public void setObra_longitude(final String obra_longitude) {
		this.obra_longitude = obra_longitude;
	}

	public String getEmblematica() {
		return emblematica;
	}

	public void setEmblematica(final String emblematica) {
		this.emblematica = emblematica;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(final String observacao) {
		this.observacao = observacao;
	}
}

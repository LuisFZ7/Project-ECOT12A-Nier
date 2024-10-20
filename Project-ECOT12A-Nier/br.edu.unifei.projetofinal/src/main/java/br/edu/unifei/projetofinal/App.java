package br.edu.unifei.projetofinal;

import java.util.GregorianCalendar;

public class App {
	public static void main(String[] args) {
		AndroidResistance ar = new AndroidResistance();
		TipoAttacker a = new TipoAttacker(ar);
		Yorha y = new Yorha();
		TipoBattler b = new TipoBattler(y);
		PrimeiraGuerradasMaquinas w = new PrimeiraGuerradasMaquinas();
		Maquinas m = new Maquinas();
		Alienigenas al = new Alienigenas();
		al.setChegaram(new GregorianCalendar(1999,7,14));
		
		
		System.out.println("Criando Guerra das Maquinas Aliens e Maquinas");
		w.setDuracao(1300);
		m.setAgressiva(true);
		System.out.println("Duracao da guerra =" + w.getDuracao());
		System.out.println("Maquinas sao agressivas =" + m.isAgressiva());
		
		//Separacao
		System.out.println("-------------------------------------------------------");
		System.out.println("Criando Androide Yorha de Battler");
		b.setPersonalidade(2);
		b.setCorOlho("Preto");
		b.setCorCabelo("Branco");
		b.setTemCaixaPreta(true);
		b.setAfiliacao(y);
		b.setTemEmocao(false);
		System.out.println("Tem emocao = " + b.isTemEmocao());
		System.out.println("Afiliado a =" + b.getAfiliacao());
		System.out.println("Cor Olho =" + b.getCorOlho());
		System.out.println("Cor Cabelo =" + b.getCorCabelo());
		System.out.println("Tem caixa preta =" + b.isTemCaixaPreta());
		System.out.println("Objetivo = " + b.getAfiliacao().objetivo());
		System.out.println("Acao = " + b.acao());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Criando Androide Resistance tipo Attacker");
		a.setPersonalidade(5);
		a.setCorOlho("Preto");
		a.setCorCabelo("Vermelho");
		a.setTemCaixaPreta(false);
		b.setTemEmocao(true);
		a.setAfiliacao(ar);
		System.out.println("Tem emocao = " + a.isTemEmocao());
		System.out.println("Personalidade = " + a.getPersonalidade());
		System.out.println("Afiliado a = " + a.getAfiliacao());
		System.out.println("Cor Olho =" + a.getCorOlho());
		System.out.println("Cor Cabelo = " + a.getCorCabelo());
		System.out.println("Tem caixa preta = " + a.isTemCaixaPreta());
		System.out.println("Objetivo: " + a.getAfiliacao().objetivo());
		System.out.println("Acao = " + a.acao());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Criar outro tipo de Androide");//usando tipos();
		Agrupamento atk = new Agrupamento(y);
		atk.setPersonalidade(3);
		atk.setCorOlho("Verde");
		atk.setCorCabelo("Branco");
		atk.missao();
		System.out.println("Afiliado a = " + atk.getAfiliacao());
		System.out.println("Cor Olho = " + atk.getCorOlho());
		System.out.println("Cor Cabelo = " + atk.getCorCabelo());
		System.out.println("Missao: " + atk.missao());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Criar Raca Misteriosa Maso e WCS");
		RacaMisteriosa rc = new RacaMisteriosa();
		TipoMaso tm = new TipoMaso();
		WhiteChlorinationSyndrome wcs = new WhiteChlorinationSyndrome();
		rc.setNome("The Giant");
		rc.setTamanho("Gigante");
		rc.setRaca("Watcher");
		tm.setUsadoPara("Gerou WhiteChlorinationSyndrome");
		wcs.setData(new GregorianCalendar(2046, 8, 1));
		System.out.println("Apelido = " + rc.getNome());
		System.out.println("Raca = " + rc.getRaca());
		System.out.println("Maso foi usado para = " + tm.getUsadoPara());
		System.out.println("Tamanho = " + tm.getUsadoPara());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		//Extincao
		System.out.println("Extincao da Raca Humana");
		ExtincaoRacaHumana erc = new ExtincaoRacaHumana();
		erc.setRelato("Aconteceu gracas a WCS causada pelo Maso obtido do Watcher 'The Giant'");
		erc.setData(new GregorianCalendar(2048, 05, 19));
		System.out.println("Relato: " + erc.getRelato());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Criacao de uma Arma Biologica");
		ArmasBiologicas ab = new ArmasBiologicas(tm);
		ab.setNumero(7);
		System.out.println("Numero = " + ab.getNumero());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		//Projeto Gestalt
		System.out.println("Criacao do Projeto Gestalt");
		ProjectGestalt pg = new ProjectGestalt();
		//pg.setData(null);
		pg.setDescricao("Projeto para realizar a separacao de corpo e alma");
		System.out.println("Numero = " + pg.getDescricao());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Criacao de um Replicant");
		SeparacaoAlmaECorpo saec = new SeparacaoAlmaECorpo();
		saec.setObjetivo("Separar o corpo e alma para que os humanos possam esperar ate a wcs acabar");
		Replicants rp = new Replicants();
		rp.setNome("Nier");
		rp.setAltura(1.83f);
		rp.setCorCabelo("Branco");
		rp.setSexo("Masculino");
		System.out.println("Nome = " + rp.getNome());
		System.out.println("Altura = " + rp.getAltura());
		System.out.println("Cor do Cabelo = " + rp.getCorCabelo());
		System.out.println("Sexo = " + rp.getSexo());
		//Separacao
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Criacao de um tipo de Shade");
		Shades sh = new Shades();
		sh.setTamanho("Pequena");
		sh.setTemArmadura(false);
		sh.setAgressivos(true);
		System.out.println("Tamanho = " + sh.getTamanho());
		System.out.println("Tem armadura = " + sh.isTemArmadura());
		System.out.println("Sao agressivos = " + sh.isAgressivos());
	}
}

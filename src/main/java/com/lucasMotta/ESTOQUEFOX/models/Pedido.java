package com.lucasMotta.ESTOQUEFOX.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String agencia;
    private String gestorSTD;
    private String gerenciadora;
    private String fornecedor;
    private String data;
    private String entrada;
    private String email;

    // APARADOR
    private int aparadorDeEnvelope;

    // ARMÁRIOS
    private int armarioBaixoOficinas;
    private int armarioBaixoSmartRed;
    private int armarioImpressora;
    private int armarioImpressoraWorkCafe;

    // BALCÃO
    private int balcaoCoworking;
    private int balcaoAtendimentoSelectDuo;

    // BANCADA E BANQUETAS
    private int bancadaLounge;
    private int banquetaCoworkingPreta;
    private int banquetaFunPreta;
    private int banquetaPipfeAlberflex;

    // BIOMBO
    private int biomboEspecialistaArgila;
    private int biomboEspecialistaGrandeOficinas;
    private int biomboEspecialistaPequenoOficinas;
    private int biomboEspecialistaSmartRedCinza;
    private int biomboEspecialistaNeodotsBranco;
    private int biomboGnsArgila;
    private int biomboGnsOficinas;
    private int biomboGnsSmartRedCinza;

    // CADEIRAS
    private int cadeiraDeRodas;
    private int cadeiraDialogoCinzaOficinasCavalleti;
    private int cadeiraDialogoCinzaOficinasFlexform;
    private int cadeiraDialogoCinzaSemPadrao;
    private int cadeiraDialogoSmartRed;
    private int cadeiraEstofadoVermelhaSemPadrao;
    private int cadeiraGerentePreta;
    private int cadeiraGerenteSmartRed;
    private int cadeiraGerenteVermelha;
    private int cadeiraGiratoria;
    private int cadeiraPipgaAlberflexCoworking;
    private int cadeiraPretaSemPadrao;
    private int cadeiraValentina;

    // COFRES E CVI'S
    private int cofreBocaDeLobo;
    private int cvi1x1;
    private int cvi2x1;
    private int cvi3x1;

    // DIVISÓRIA
    private int divisoriaCaixaAcrilicoVermelho;

    // ESTANTE
    private int estanteWorkCafePretaAmadeirada;

    // FORRO
    private int forroRipado;

    // FRAGMENTADORA
    private int fragmentadora;

    // FRIGOBAR
    private int frigobar;

    // GAVETEIRO
    private int gaveteiro;

    // GUICHÊ
    private int guicheCaixa;
    private int guicheCaixaPne;

    // LIXEIRA
    private int lixeiraCafe;

    // LOCKER
    private int locker;

    // LONGARINA
    private int longarinaCinza;
    private int longarinaComObesoCinzaSmartRed;
    private int longarinaVermelha;

    // LUMINÁRIA
    private int luminariaDeTrilho;
    private int luminariaPendenteWkcLum11;
    private int luminariaPendenteWkcLum12;

    // LUSTRE
    private int lustreSolitaria;

    // MESA
    private int mesaReuniaoAberta;
    private int mesaBistraoAmadeirada;
    private int mesaCafePreta;
    private int mesaCoworking;
    private int mesaDeCentroCannesPreta;
    private int mesaDeReuniaoGrandeQuadrada;
    private int mesaDeReuniaoQuadradaOficinas;
    private int mesaEspecialistaOficinasDireita;
    private int mesaEspecialistaSmartRedDireita;
    private int mesaEspecialistaSmartRedEsquerda;
    private int mesaGnsOficinasDireita;
    private int mesaGnsSmartRedDireita;
    private int mesaLateralLaquila;
    private int mesaRedondaSaarinen;
    private int mesaRetaguardaArgila;
    private int mesaRetaguardaOficinas;
    private int mesaReuniaoRedonda;
    private int mesaSalaAvancar;
    private int mesaSelect;

    // MICROONDAS
    private int microondas;

    // MOLDURAS
    private int molduraTarifario32;
    private int molduraTarifario40;
    private int molduraTarifario50;
    private int molduraTarifario65;

    // POLTRONAS
    private int poltronaICouroCinzaClaro;
    private int poltronaICouroCinzaEscuro;
    private int poltronaITecidoCinzaEscuro;
    private int poltronaITecidoVermelho;
    private int poltronaLCouroCinzaClaro;
    private int poltronaLCouroCinzaEscuro;
    private int poltronaLTecidoCinzaEscuro;
    private int poltronaLTecidoVermelho;
    private int poltronaMaria;
    private int poltronaPreta;
    private int poltronaSuiteMarromSelect;
    private int poltronaVermelhaSelectNina;

    // PUFFS
    private int puffQuadradoCouroCinzaClaro;
    private int puffQuadradoCouroCinzaEscuro;
    private int puffRedondoBege;
    private int puffRedondoCinzaClaro;
    private int puffRedondoCinzaEscuro;
    private int puffRedondoVermelho;

    // RACKS E QUADROS
    private int quadroMissaoECultura;
    private int rack;

    // SOFÁS
    private int sofaLina;

    // TAPETES
    private int tapeteSelect;

    // TVS
    private int tv26;
    private int tv32;
    private int tv40;
    private int tv43;
    private int tv50;
    private int tv65;
    private int tv75;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAparadorDeEnvelope() {
		return aparadorDeEnvelope;
	}
	public void setAparadorDeEnvelope(int aparadorDeEnvelope) {
		this.aparadorDeEnvelope = aparadorDeEnvelope;
	}
	public int getArmarioBaixoOficinas() {
		return armarioBaixoOficinas;
	}
	public void setArmarioBaixoOficinas(int armarioBaixoOficinas) {
		this.armarioBaixoOficinas = armarioBaixoOficinas;
	}
	public int getArmarioBaixoSmartRed() {
		return armarioBaixoSmartRed;
	}
	public void setArmarioBaixoSmartRed(int armarioBaixoSmartRed) {
		this.armarioBaixoSmartRed = armarioBaixoSmartRed;
	}
	public int getArmarioImpressora() {
		return armarioImpressora;
	}
	public void setArmarioImpressora(int armarioImpressora) {
		this.armarioImpressora = armarioImpressora;
	}
	public int getArmarioImpressoraWorkCafe() {
		return armarioImpressoraWorkCafe;
	}
	public void setArmarioImpressoraWorkCafe(int armarioImpressoraWorkCafe) {
		this.armarioImpressoraWorkCafe = armarioImpressoraWorkCafe;
	}
	public int getBalcaoCoworking() {
		return balcaoCoworking;
	}
	public void setBalcaoCoworking(int balcaoCoworking) {
		this.balcaoCoworking = balcaoCoworking;
	}
	public int getBalcaoAtendimentoSelectDuo() {
		return balcaoAtendimentoSelectDuo;
	}
	public void setBalcaoAtendimentoSelectDuo(int balcaoAtendimentoSelectDuo) {
		this.balcaoAtendimentoSelectDuo = balcaoAtendimentoSelectDuo;
	}
	public int getBancadaLounge() {
		return bancadaLounge;
	}
	public void setBancadaLounge(int bancadaLounge) {
		this.bancadaLounge = bancadaLounge;
	}
	public int getBanquetaCoworkingPreta() {
		return banquetaCoworkingPreta;
	}
	public void setBanquetaCoworkingPreta(int banquetaCoworkingPreta) {
		this.banquetaCoworkingPreta = banquetaCoworkingPreta;
	}
	public int getBanquetaFunPreta() {
		return banquetaFunPreta;
	}
	public void setBanquetaFunPreta(int banquetaFunPreta) {
		this.banquetaFunPreta = banquetaFunPreta;
	}
	public int getBanquetaPipfeAlberflex() {
		return banquetaPipfeAlberflex;
	}
	public void setBanquetaPipfeAlberflex(int banquetaPipfeAlberflex) {
		this.banquetaPipfeAlberflex = banquetaPipfeAlberflex;
	}
	public int getBiomboEspecialistaArgila() {
		return biomboEspecialistaArgila;
	}
	public void setBiomboEspecialistaArgila(int biomboEspecialistaArgila) {
		this.biomboEspecialistaArgila = biomboEspecialistaArgila;
	}
	public int getBiomboEspecialistaGrandeOficinas() {
		return biomboEspecialistaGrandeOficinas;
	}
	public void setBiomboEspecialistaGrandeOficinas(int biomboEspecialistaGrandeOficinas) {
		this.biomboEspecialistaGrandeOficinas = biomboEspecialistaGrandeOficinas;
	}
	public int getBiomboEspecialistaPequenoOficinas() {
		return biomboEspecialistaPequenoOficinas;
	}
	public void setBiomboEspecialistaPequenoOficinas(int biomboEspecialistaPequenoOficinas) {
		this.biomboEspecialistaPequenoOficinas = biomboEspecialistaPequenoOficinas;
	}
	public int getBiomboEspecialistaSmartRedCinza() {
		return biomboEspecialistaSmartRedCinza;
	}
	public void setBiomboEspecialistaSmartRedCinza(int biomboEspecialistaSmartRedCinza) {
		this.biomboEspecialistaSmartRedCinza = biomboEspecialistaSmartRedCinza;
	}
	public int getBiomboEspecialistaNeodotsBranco() {
		return biomboEspecialistaNeodotsBranco;
	}
	public void setBiomboEspecialistaNeodotsBranco(int biomboEspecialistaNeodotsBranco) {
		this.biomboEspecialistaNeodotsBranco = biomboEspecialistaNeodotsBranco;
	}
	public int getBiomboGnsArgila() {
		return biomboGnsArgila;
	}
	public void setBiomboGnsArgila(int biomboGnsArgila) {
		this.biomboGnsArgila = biomboGnsArgila;
	}
	public int getBiomboGnsOficinas() {
		return biomboGnsOficinas;
	}
	public void setBiomboGnsOficinas(int biomboGnsOficinas) {
		this.biomboGnsOficinas = biomboGnsOficinas;
	}
	public int getBiomboGnsSmartRedCinza() {
		return biomboGnsSmartRedCinza;
	}
	public void setBiomboGnsSmartRedCinza(int biomboGnsSmartRedCinza) {
		this.biomboGnsSmartRedCinza = biomboGnsSmartRedCinza;
	}
	public int getCadeiraDeRodas() {
		return cadeiraDeRodas;
	}
	public void setCadeiraDeRodas(int cadeiraDeRodas) {
		this.cadeiraDeRodas = cadeiraDeRodas;
	}
	public int getCadeiraDialogoCinzaOficinasCavalleti() {
		return cadeiraDialogoCinzaOficinasCavalleti;
	}
	public void setCadeiraDialogoCinzaOficinasCavalleti(int cadeiraDialogoCinzaOficinasCavalleti) {
		this.cadeiraDialogoCinzaOficinasCavalleti = cadeiraDialogoCinzaOficinasCavalleti;
	}
	public int getCadeiraDialogoCinzaOficinasFlexform() {
		return cadeiraDialogoCinzaOficinasFlexform;
	}
	public void setCadeiraDialogoCinzaOficinasFlexform(int cadeiraDialogoCinzaOficinasFlexform) {
		this.cadeiraDialogoCinzaOficinasFlexform = cadeiraDialogoCinzaOficinasFlexform;
	}
	public int getCadeiraDialogoCinzaSemPadrao() {
		return cadeiraDialogoCinzaSemPadrao;
	}
	public void setCadeiraDialogoCinzaSemPadrao(int cadeiraDialogoCinzaSemPadrao) {
		this.cadeiraDialogoCinzaSemPadrao = cadeiraDialogoCinzaSemPadrao;
	}
	public int getCadeiraDialogoSmartRed() {
		return cadeiraDialogoSmartRed;
	}
	public void setCadeiraDialogoSmartRed(int cadeiraDialogoSmartRed) {
		this.cadeiraDialogoSmartRed = cadeiraDialogoSmartRed;
	}
	public int getCadeiraEstofadoVermelhaSemPadrao() {
		return cadeiraEstofadoVermelhaSemPadrao;
	}
	public void setCadeiraEstofadoVermelhaSemPadrao(int cadeiraEstofadoVermelhaSemPadrao) {
		this.cadeiraEstofadoVermelhaSemPadrao = cadeiraEstofadoVermelhaSemPadrao;
	}
	public int getCadeiraGerentePreta() {
		return cadeiraGerentePreta;
	}
	public void setCadeiraGerentePreta(int cadeiraGerentePreta) {
		this.cadeiraGerentePreta = cadeiraGerentePreta;
	}
	public int getCadeiraGerenteSmartRed() {
		return cadeiraGerenteSmartRed;
	}
	public void setCadeiraGerenteSmartRed(int cadeiraGerenteSmartRed) {
		this.cadeiraGerenteSmartRed = cadeiraGerenteSmartRed;
	}
	public int getCadeiraGerenteVermelha() {
		return cadeiraGerenteVermelha;
	}
	public void setCadeiraGerenteVermelha(int cadeiraGerenteVermelha) {
		this.cadeiraGerenteVermelha = cadeiraGerenteVermelha;
	}
	public int getCadeiraGiratoria() {
		return cadeiraGiratoria;
	}
	public void setCadeiraGiratoria(int cadeiraGiratoria) {
		this.cadeiraGiratoria = cadeiraGiratoria;
	}
	public int getCadeiraPipgaAlberflexCoworking() {
		return cadeiraPipgaAlberflexCoworking;
	}
	public void setCadeiraPipgaAlberflexCoworking(int cadeiraPipgaAlberflexCoworking) {
		this.cadeiraPipgaAlberflexCoworking = cadeiraPipgaAlberflexCoworking;
	}
	public int getCadeiraPretaSemPadrao() {
		return cadeiraPretaSemPadrao;
	}
	public void setCadeiraPretaSemPadrao(int cadeiraPretaSemPadrao) {
		this.cadeiraPretaSemPadrao = cadeiraPretaSemPadrao;
	}
	public int getCadeiraValentina() {
		return cadeiraValentina;
	}
	public void setCadeiraValentina(int cadeiraValentina) {
		this.cadeiraValentina = cadeiraValentina;
	}
	public int getCofreBocaDeLobo() {
		return cofreBocaDeLobo;
	}
	public void setCofreBocaDeLobo(int cofreBocaDeLobo) {
		this.cofreBocaDeLobo = cofreBocaDeLobo;
	}
	public int getCvi1x1() {
		return cvi1x1;
	}
	public void setCvi1x1(int cvi1x1) {
		this.cvi1x1 = cvi1x1;
	}
	public int getCvi2x1() {
		return cvi2x1;
	}
	public void setCvi2x1(int cvi2x1) {
		this.cvi2x1 = cvi2x1;
	}
	public int getCvi3x1() {
		return cvi3x1;
	}
	public void setCvi3x1(int cvi3x1) {
		this.cvi3x1 = cvi3x1;
	}
	public int getDivisoriaCaixaAcrilicoVermelho() {
		return divisoriaCaixaAcrilicoVermelho;
	}
	public void setDivisoriaCaixaAcrilicoVermelho(int divisoriaCaixaAcrilicoVermelho) {
		this.divisoriaCaixaAcrilicoVermelho = divisoriaCaixaAcrilicoVermelho;
	}
	public int getEstanteWorkCafePretaAmadeirada() {
		return estanteWorkCafePretaAmadeirada;
	}
	public void setEstanteWorkCafePretaAmadeirada(int estanteWorkCafePretaAmadeirada) {
		this.estanteWorkCafePretaAmadeirada = estanteWorkCafePretaAmadeirada;
	}
	public int getForroRipado() {
		return forroRipado;
	}
	public void setForroRipado(int forroRipado) {
		this.forroRipado = forroRipado;
	}
	public int getFragmentadora() {
		return fragmentadora;
	}
	public void setFragmentadora(int fragmentadora) {
		this.fragmentadora = fragmentadora;
	}
	public int getFrigobar() {
		return frigobar;
	}
	public void setFrigobar(int frigobar) {
		this.frigobar = frigobar;
	}
	public int getGaveteiro() {
		return gaveteiro;
	}
	public void setGaveteiro(int gaveteiro) {
		this.gaveteiro = gaveteiro;
	}
	public int getGuicheCaixa() {
		return guicheCaixa;
	}
	public void setGuicheCaixa(int guicheCaixa) {
		this.guicheCaixa = guicheCaixa;
	}
	public int getGuicheCaixaPne() {
		return guicheCaixaPne;
	}
	public void setGuicheCaixaPne(int guicheCaixaPne) {
		this.guicheCaixaPne = guicheCaixaPne;
	}
	public int getLixeiraCafe() {
		return lixeiraCafe;
	}
	public void setLixeiraCafe(int lixeiraCafe) {
		this.lixeiraCafe = lixeiraCafe;
	}
	public int getLocker() {
		return locker;
	}
	public void setLocker(int locker) {
		this.locker = locker;
	}
	public int getLongarinaCinza() {
		return longarinaCinza;
	}
	public void setLongarinaCinza(int longarinaCinza) {
		this.longarinaCinza = longarinaCinza;
	}
	public int getLongarinaComObesoCinzaSmartRed() {
		return longarinaComObesoCinzaSmartRed;
	}
	public void setLongarinaComObesoCinzaSmartRed(int longarinaComObesoCinzaSmartRed) {
		this.longarinaComObesoCinzaSmartRed = longarinaComObesoCinzaSmartRed;
	}
	public int getLongarinaVermelha() {
		return longarinaVermelha;
	}
	public void setLongarinaVermelha(int longarinaVermelha) {
		this.longarinaVermelha = longarinaVermelha;
	}
	public int getLuminariaDeTrilho() {
		return luminariaDeTrilho;
	}
	public void setLuminariaDeTrilho(int luminariaDeTrilho) {
		this.luminariaDeTrilho = luminariaDeTrilho;
	}
	public int getLuminariaPendenteWkcLum11() {
		return luminariaPendenteWkcLum11;
	}
	public void setLuminariaPendenteWkcLum11(int luminariaPendenteWkcLum11) {
		this.luminariaPendenteWkcLum11 = luminariaPendenteWkcLum11;
	}
	public int getLuminariaPendenteWkcLum12() {
		return luminariaPendenteWkcLum12;
	}
	public void setLuminariaPendenteWkcLum12(int luminariaPendenteWkcLum12) {
		this.luminariaPendenteWkcLum12 = luminariaPendenteWkcLum12;
	}
	public int getLustreSolitaria() {
		return lustreSolitaria;
	}
	public void setLustreSolitaria(int lustreSolitaria) {
		this.lustreSolitaria = lustreSolitaria;
	}
	public int getMesaReuniaoAberta() {
		return mesaReuniaoAberta;
	}
	public void setMesaReuniaoAberta(int mesaReuniaoAberta) {
		this.mesaReuniaoAberta = mesaReuniaoAberta;
	}
	public int getMesaBistraoAmadeirada() {
		return mesaBistraoAmadeirada;
	}
	public void setMesaBistraoAmadeirada(int mesaBistraoAmadeirada) {
		this.mesaBistraoAmadeirada = mesaBistraoAmadeirada;
	}
	public int getMesaCafePreta() {
		return mesaCafePreta;
	}
	public void setMesaCafePreta(int mesaCafePreta) {
		this.mesaCafePreta = mesaCafePreta;
	}
	public int getMesaCoworking() {
		return mesaCoworking;
	}
	public void setMesaCoworking(int mesaCoworking) {
		this.mesaCoworking = mesaCoworking;
	}
	public int getMesaDeCentroCannesPreta() {
		return mesaDeCentroCannesPreta;
	}
	public void setMesaDeCentroCannesPreta(int mesaDeCentroCannesPreta) {
		this.mesaDeCentroCannesPreta = mesaDeCentroCannesPreta;
	}
	public int getMesaDeReuniaoGrandeQuadrada() {
		return mesaDeReuniaoGrandeQuadrada;
	}
	public void setMesaDeReuniaoGrandeQuadrada(int mesaDeReuniaoGrandeQuadrada) {
		this.mesaDeReuniaoGrandeQuadrada = mesaDeReuniaoGrandeQuadrada;
	}
	public int getMesaDeReuniaoQuadradaOficinas() {
		return mesaDeReuniaoQuadradaOficinas;
	}
	public void setMesaDeReuniaoQuadradaOficinas(int mesaDeReuniaoQuadradaOficinas) {
		this.mesaDeReuniaoQuadradaOficinas = mesaDeReuniaoQuadradaOficinas;
	}
	public int getMesaEspecialistaOficinasDireita() {
		return mesaEspecialistaOficinasDireita;
	}
	public void setMesaEspecialistaOficinasDireita(int mesaEspecialistaOficinasDireita) {
		this.mesaEspecialistaOficinasDireita = mesaEspecialistaOficinasDireita;
	}
	public int getMesaEspecialistaSmartRedDireita() {
		return mesaEspecialistaSmartRedDireita;
	}
	public void setMesaEspecialistaSmartRedDireita(int mesaEspecialistaSmartRedDireita) {
		this.mesaEspecialistaSmartRedDireita = mesaEspecialistaSmartRedDireita;
	}
	public int getMesaEspecialistaSmartRedEsquerda() {
		return mesaEspecialistaSmartRedEsquerda;
	}
	public void setMesaEspecialistaSmartRedEsquerda(int mesaEspecialistaSmartRedEsquerda) {
		this.mesaEspecialistaSmartRedEsquerda = mesaEspecialistaSmartRedEsquerda;
	}
	public int getMesaGnsOficinasDireita() {
		return mesaGnsOficinasDireita;
	}
	public void setMesaGnsOficinasDireita(int mesaGnsOficinasDireita) {
		this.mesaGnsOficinasDireita = mesaGnsOficinasDireita;
	}
	public int getMesaGnsSmartRedDireita() {
		return mesaGnsSmartRedDireita;
	}
	public void setMesaGnsSmartRedDireita(int mesaGnsSmartRedDireita) {
		this.mesaGnsSmartRedDireita = mesaGnsSmartRedDireita;
	}
	public int getMesaLateralLaquila() {
		return mesaLateralLaquila;
	}
	public void setMesaLateralLaquila(int mesaLateralLaquila) {
		this.mesaLateralLaquila = mesaLateralLaquila;
	}
	public int getMesaRedondaSaarinen() {
		return mesaRedondaSaarinen;
	}
	public void setMesaRedondaSaarinen(int mesaRedondaSaarinen) {
		this.mesaRedondaSaarinen = mesaRedondaSaarinen;
	}
	public int getMesaRetaguardaArgila() {
		return mesaRetaguardaArgila;
	}
	public void setMesaRetaguardaArgila(int mesaRetaguardaArgila) {
		this.mesaRetaguardaArgila = mesaRetaguardaArgila;
	}
	public int getMesaRetaguardaOficinas() {
		return mesaRetaguardaOficinas;
	}
	public void setMesaRetaguardaOficinas(int mesaRetaguardaOficinas) {
		this.mesaRetaguardaOficinas = mesaRetaguardaOficinas;
	}
	public int getMesaReuniaoRedonda() {
		return mesaReuniaoRedonda;
	}
	public void setMesaReuniaoRedonda(int mesaReuniaoRedonda) {
		this.mesaReuniaoRedonda = mesaReuniaoRedonda;
	}
	public int getMesaSalaAvancar() {
		return mesaSalaAvancar;
	}
	public void setMesaSalaAvancar(int mesaSalaAvancar) {
		this.mesaSalaAvancar = mesaSalaAvancar;
	}
	public int getMesaSelect() {
		return mesaSelect;
	}
	public void setMesaSelect(int mesaSelect) {
		this.mesaSelect = mesaSelect;
	}
	public int getMicroondas() {
		return microondas;
	}
	public void setMicroondas(int microondas) {
		this.microondas = microondas;
	}
	public int getMolduraTarifario32() {
		return molduraTarifario32;
	}
	public void setMolduraTarifario32(int molduraTarifario32) {
		this.molduraTarifario32 = molduraTarifario32;
	}
	public int getMolduraTarifario40() {
		return molduraTarifario40;
	}
	public void setMolduraTarifario40(int molduraTarifario40) {
		this.molduraTarifario40 = molduraTarifario40;
	}
	public int getMolduraTarifario50() {
		return molduraTarifario50;
	}
	public void setMolduraTarifario50(int molduraTarifario50) {
		this.molduraTarifario50 = molduraTarifario50;
	}
	public int getMolduraTarifario65() {
		return molduraTarifario65;
	}
	public void setMolduraTarifario65(int molduraTarifario65) {
		this.molduraTarifario65 = molduraTarifario65;
	}
	public int getPoltronaICouroCinzaClaro() {
		return poltronaICouroCinzaClaro;
	}
	public void setPoltronaICouroCinzaClaro(int poltronaICouroCinzaClaro) {
		this.poltronaICouroCinzaClaro = poltronaICouroCinzaClaro;
	}
	public int getPoltronaICouroCinzaEscuro() {
		return poltronaICouroCinzaEscuro;
	}
	public void setPoltronaICouroCinzaEscuro(int poltronaICouroCinzaEscuro) {
		this.poltronaICouroCinzaEscuro = poltronaICouroCinzaEscuro;
	}
	public int getPoltronaITecidoCinzaEscuro() {
		return poltronaITecidoCinzaEscuro;
	}
	public void setPoltronaITecidoCinzaEscuro(int poltronaITecidoCinzaEscuro) {
		this.poltronaITecidoCinzaEscuro = poltronaITecidoCinzaEscuro;
	}
	public int getPoltronaITecidoVermelho() {
		return poltronaITecidoVermelho;
	}
	public void setPoltronaITecidoVermelho(int poltronaITecidoVermelho) {
		this.poltronaITecidoVermelho = poltronaITecidoVermelho;
	}
	public int getPoltronaLCouroCinzaClaro() {
		return poltronaLCouroCinzaClaro;
	}
	public void setPoltronaLCouroCinzaClaro(int poltronaLCouroCinzaClaro) {
		this.poltronaLCouroCinzaClaro = poltronaLCouroCinzaClaro;
	}
	public int getPoltronaLCouroCinzaEscuro() {
		return poltronaLCouroCinzaEscuro;
	}
	public void setPoltronaLCouroCinzaEscuro(int poltronaLCouroCinzaEscuro) {
		this.poltronaLCouroCinzaEscuro = poltronaLCouroCinzaEscuro;
	}
	public int getPoltronaLTecidoCinzaEscuro() {
		return poltronaLTecidoCinzaEscuro;
	}
	public void setPoltronaLTecidoCinzaEscuro(int poltronaLTecidoCinzaEscuro) {
		this.poltronaLTecidoCinzaEscuro = poltronaLTecidoCinzaEscuro;
	}
	public int getPoltronaLTecidoVermelho() {
		return poltronaLTecidoVermelho;
	}
	public void setPoltronaLTecidoVermelho(int poltronaLTecidoVermelho) {
		this.poltronaLTecidoVermelho = poltronaLTecidoVermelho;
	}
	public int getPoltronaMaria() {
		return poltronaMaria;
	}
	public void setPoltronaMaria(int poltronaMaria) {
		this.poltronaMaria = poltronaMaria;
	}
	public int getPoltronaPreta() {
		return poltronaPreta;
	}
	public void setPoltronaPreta(int poltronaPreta) {
		this.poltronaPreta = poltronaPreta;
	}
	public int getPoltronaSuiteMarromSelect() {
		return poltronaSuiteMarromSelect;
	}
	public void setPoltronaSuiteMarromSelect(int poltronaSuiteMarromSelect) {
		this.poltronaSuiteMarromSelect = poltronaSuiteMarromSelect;
	}
	public int getPoltronaVermelhaSelectNina() {
		return poltronaVermelhaSelectNina;
	}
	public void setPoltronaVermelhaSelectNina(int poltronaVermelhaSelectNina) {
		this.poltronaVermelhaSelectNina = poltronaVermelhaSelectNina;
	}
	public int getPuffQuadradoCouroCinzaClaro() {
		return puffQuadradoCouroCinzaClaro;
	}
	public void setPuffQuadradoCouroCinzaClaro(int puffQuadradoCouroCinzaClaro) {
		this.puffQuadradoCouroCinzaClaro = puffQuadradoCouroCinzaClaro;
	}
	public int getPuffQuadradoCouroCinzaEscuro() {
		return puffQuadradoCouroCinzaEscuro;
	}
	public void setPuffQuadradoCouroCinzaEscuro(int puffQuadradoCouroCinzaEscuro) {
		this.puffQuadradoCouroCinzaEscuro = puffQuadradoCouroCinzaEscuro;
	}
	public int getPuffRedondoBege() {
		return puffRedondoBege;
	}
	public void setPuffRedondoBege(int puffRedondoBege) {
		this.puffRedondoBege = puffRedondoBege;
	}
	public int getPuffRedondoCinzaClaro() {
		return puffRedondoCinzaClaro;
	}
	public void setPuffRedondoCinzaClaro(int puffRedondoCinzaClaro) {
		this.puffRedondoCinzaClaro = puffRedondoCinzaClaro;
	}
	public int getPuffRedondoCinzaEscuro() {
		return puffRedondoCinzaEscuro;
	}
	public void setPuffRedondoCinzaEscuro(int puffRedondoCinzaEscuro) {
		this.puffRedondoCinzaEscuro = puffRedondoCinzaEscuro;
	}
	public int getPuffRedondoVermelho() {
		return puffRedondoVermelho;
	}
	public void setPuffRedondoVermelho(int puffRedondoVermelho) {
		this.puffRedondoVermelho = puffRedondoVermelho;
	}
	public int getQuadroMissaoECultura() {
		return quadroMissaoECultura;
	}
	public void setQuadroMissaoECultura(int quadroMissaoECultura) {
		this.quadroMissaoECultura = quadroMissaoECultura;
	}
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}
	public int getSofaLina() {
		return sofaLina;
	}
	public void setSofaLina(int sofaLina) {
		this.sofaLina = sofaLina;
	}
	public int getTapeteSelect() {
		return tapeteSelect;
	}
	public void setTapeteSelect(int tapeteSelect) {
		this.tapeteSelect = tapeteSelect;
	}
	public int getTv26() {
		return tv26;
	}
	public void setTv26(int tv26) {
		this.tv26 = tv26;
	}
	public int getTv32() {
		return tv32;
	}
	public void setTv32(int tv32) {
		this.tv32 = tv32;
	}
	public int getTv40() {
		return tv40;
	}
	public void setTv40(int tv40) {
		this.tv40 = tv40;
	}
	public int getTv43() {
		return tv43;
	}
	public void setTv43(int tv43) {
		this.tv43 = tv43;
	}
	public int getTv50() {
		return tv50;
	}
	public void setTv50(int tv50) {
		this.tv50 = tv50;
	}
	public int getTv65() {
		return tv65;
	}
	public void setTv65(int tv65) {
		this.tv65 = tv65;
	}
	public int getTv75() {
		return tv75;
	}
	public void setTv75(int tv75) {
		this.tv75 = tv75;
	}
	
	
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getGestorSTD() {
		return gestorSTD;
	}
	public void setGestorSTD(String gestorSTD) {
		this.gestorSTD = gestorSTD;
	}
	public String getGerenciadora() {
		return gerenciadora;
	}
	public void setGerenciadora(String gerenciadora) {
		this.gerenciadora = gerenciadora;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aparadorDeEnvelope, armarioBaixoOficinas, armarioBaixoSmartRed, armarioImpressora,
				armarioImpressoraWorkCafe, balcaoAtendimentoSelectDuo, balcaoCoworking, bancadaLounge,
				banquetaCoworkingPreta, banquetaFunPreta, banquetaPipfeAlberflex, biomboEspecialistaArgila,
				biomboEspecialistaGrandeOficinas, biomboEspecialistaNeodotsBranco, biomboEspecialistaPequenoOficinas,
				biomboEspecialistaSmartRedCinza, biomboGnsArgila, biomboGnsOficinas, biomboGnsSmartRedCinza,
				cadeiraDeRodas, cadeiraDialogoCinzaOficinasCavalleti, cadeiraDialogoCinzaOficinasFlexform,
				cadeiraDialogoCinzaSemPadrao, cadeiraDialogoSmartRed, cadeiraEstofadoVermelhaSemPadrao,
				cadeiraGerentePreta, cadeiraGerenteSmartRed, cadeiraGerenteVermelha, cadeiraGiratoria,
				cadeiraPipgaAlberflexCoworking, cadeiraPretaSemPadrao, cadeiraValentina, cofreBocaDeLobo, cvi1x1,
				cvi2x1, cvi3x1, divisoriaCaixaAcrilicoVermelho, estanteWorkCafePretaAmadeirada, forroRipado,
				fragmentadora, frigobar, gaveteiro, guicheCaixa, guicheCaixaPne, id, lixeiraCafe, locker,
				longarinaCinza, longarinaComObesoCinzaSmartRed, longarinaVermelha, luminariaDeTrilho,
				luminariaPendenteWkcLum11, luminariaPendenteWkcLum12, lustreSolitaria, mesaBistraoAmadeirada,
				mesaCafePreta, mesaCoworking, mesaDeCentroCannesPreta, mesaDeReuniaoGrandeQuadrada,
				mesaDeReuniaoQuadradaOficinas, mesaEspecialistaOficinasDireita, mesaEspecialistaSmartRedDireita,
				mesaEspecialistaSmartRedEsquerda, mesaGnsOficinasDireita, mesaGnsSmartRedDireita, mesaLateralLaquila,
				mesaRedondaSaarinen, mesaRetaguardaArgila, mesaRetaguardaOficinas, mesaReuniaoAberta,
				mesaReuniaoRedonda, mesaSalaAvancar, mesaSelect, microondas, molduraTarifario32, molduraTarifario40,
				molduraTarifario50, molduraTarifario65, poltronaICouroCinzaClaro, poltronaICouroCinzaEscuro,
				poltronaITecidoCinzaEscuro, poltronaITecidoVermelho, poltronaLCouroCinzaClaro,
				poltronaLCouroCinzaEscuro, poltronaLTecidoCinzaEscuro, poltronaLTecidoVermelho, poltronaMaria,
				poltronaPreta, poltronaSuiteMarromSelect, poltronaVermelhaSelectNina, puffQuadradoCouroCinzaClaro,
				puffQuadradoCouroCinzaEscuro, puffRedondoBege, puffRedondoCinzaClaro, puffRedondoCinzaEscuro,
				puffRedondoVermelho, quadroMissaoECultura, rack, sofaLina, tapeteSelect, tv26, tv32, tv40, tv43, tv50,
				tv65, tv75);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return aparadorDeEnvelope == other.aparadorDeEnvelope && armarioBaixoOficinas == other.armarioBaixoOficinas
				&& armarioBaixoSmartRed == other.armarioBaixoSmartRed && armarioImpressora == other.armarioImpressora
				&& armarioImpressoraWorkCafe == other.armarioImpressoraWorkCafe
				&& balcaoAtendimentoSelectDuo == other.balcaoAtendimentoSelectDuo
				&& balcaoCoworking == other.balcaoCoworking && bancadaLounge == other.bancadaLounge
				&& banquetaCoworkingPreta == other.banquetaCoworkingPreta && banquetaFunPreta == other.banquetaFunPreta
				&& banquetaPipfeAlberflex == other.banquetaPipfeAlberflex
				&& biomboEspecialistaArgila == other.biomboEspecialistaArgila
				&& biomboEspecialistaGrandeOficinas == other.biomboEspecialistaGrandeOficinas
				&& biomboEspecialistaNeodotsBranco == other.biomboEspecialistaNeodotsBranco
				&& biomboEspecialistaPequenoOficinas == other.biomboEspecialistaPequenoOficinas
				&& biomboEspecialistaSmartRedCinza == other.biomboEspecialistaSmartRedCinza
				&& biomboGnsArgila == other.biomboGnsArgila && biomboGnsOficinas == other.biomboGnsOficinas
				&& biomboGnsSmartRedCinza == other.biomboGnsSmartRedCinza && cadeiraDeRodas == other.cadeiraDeRodas
				&& cadeiraDialogoCinzaOficinasCavalleti == other.cadeiraDialogoCinzaOficinasCavalleti
				&& cadeiraDialogoCinzaOficinasFlexform == other.cadeiraDialogoCinzaOficinasFlexform
				&& cadeiraDialogoCinzaSemPadrao == other.cadeiraDialogoCinzaSemPadrao
				&& cadeiraDialogoSmartRed == other.cadeiraDialogoSmartRed
				&& cadeiraEstofadoVermelhaSemPadrao == other.cadeiraEstofadoVermelhaSemPadrao
				&& cadeiraGerentePreta == other.cadeiraGerentePreta
				&& cadeiraGerenteSmartRed == other.cadeiraGerenteSmartRed
				&& cadeiraGerenteVermelha == other.cadeiraGerenteVermelha && cadeiraGiratoria == other.cadeiraGiratoria
				&& cadeiraPipgaAlberflexCoworking == other.cadeiraPipgaAlberflexCoworking
				&& cadeiraPretaSemPadrao == other.cadeiraPretaSemPadrao && cadeiraValentina == other.cadeiraValentina
				&& cofreBocaDeLobo == other.cofreBocaDeLobo && cvi1x1 == other.cvi1x1 && cvi2x1 == other.cvi2x1
				&& cvi3x1 == other.cvi3x1 && divisoriaCaixaAcrilicoVermelho == other.divisoriaCaixaAcrilicoVermelho
				&& estanteWorkCafePretaAmadeirada == other.estanteWorkCafePretaAmadeirada
				&& forroRipado == other.forroRipado && fragmentadora == other.fragmentadora
				&& frigobar == other.frigobar && gaveteiro == other.gaveteiro && guicheCaixa == other.guicheCaixa
				&& guicheCaixaPne == other.guicheCaixaPne && id == other.id && lixeiraCafe == other.lixeiraCafe
				&& locker == other.locker && longarinaCinza == other.longarinaCinza
				&& longarinaComObesoCinzaSmartRed == other.longarinaComObesoCinzaSmartRed
				&& longarinaVermelha == other.longarinaVermelha && luminariaDeTrilho == other.luminariaDeTrilho
				&& luminariaPendenteWkcLum11 == other.luminariaPendenteWkcLum11
				&& luminariaPendenteWkcLum12 == other.luminariaPendenteWkcLum12
				&& lustreSolitaria == other.lustreSolitaria && mesaBistraoAmadeirada == other.mesaBistraoAmadeirada
				&& mesaCafePreta == other.mesaCafePreta && mesaCoworking == other.mesaCoworking
				&& mesaDeCentroCannesPreta == other.mesaDeCentroCannesPreta
				&& mesaDeReuniaoGrandeQuadrada == other.mesaDeReuniaoGrandeQuadrada
				&& mesaDeReuniaoQuadradaOficinas == other.mesaDeReuniaoQuadradaOficinas
				&& mesaEspecialistaOficinasDireita == other.mesaEspecialistaOficinasDireita
				&& mesaEspecialistaSmartRedDireita == other.mesaEspecialistaSmartRedDireita
				&& mesaEspecialistaSmartRedEsquerda == other.mesaEspecialistaSmartRedEsquerda
				&& mesaGnsOficinasDireita == other.mesaGnsOficinasDireita
				&& mesaGnsSmartRedDireita == other.mesaGnsSmartRedDireita
				&& mesaLateralLaquila == other.mesaLateralLaquila && mesaRedondaSaarinen == other.mesaRedondaSaarinen
				&& mesaRetaguardaArgila == other.mesaRetaguardaArgila
				&& mesaRetaguardaOficinas == other.mesaRetaguardaOficinas
				&& mesaReuniaoAberta == other.mesaReuniaoAberta && mesaReuniaoRedonda == other.mesaReuniaoRedonda
				&& mesaSalaAvancar == other.mesaSalaAvancar && mesaSelect == other.mesaSelect
				&& microondas == other.microondas && molduraTarifario32 == other.molduraTarifario32
				&& molduraTarifario40 == other.molduraTarifario40 && molduraTarifario50 == other.molduraTarifario50
				&& molduraTarifario65 == other.molduraTarifario65
				&& poltronaICouroCinzaClaro == other.poltronaICouroCinzaClaro
				&& poltronaICouroCinzaEscuro == other.poltronaICouroCinzaEscuro
				&& poltronaITecidoCinzaEscuro == other.poltronaITecidoCinzaEscuro
				&& poltronaITecidoVermelho == other.poltronaITecidoVermelho
				&& poltronaLCouroCinzaClaro == other.poltronaLCouroCinzaClaro
				&& poltronaLCouroCinzaEscuro == other.poltronaLCouroCinzaEscuro
				&& poltronaLTecidoCinzaEscuro == other.poltronaLTecidoCinzaEscuro
				&& poltronaLTecidoVermelho == other.poltronaLTecidoVermelho && poltronaMaria == other.poltronaMaria
				&& poltronaPreta == other.poltronaPreta && poltronaSuiteMarromSelect == other.poltronaSuiteMarromSelect
				&& poltronaVermelhaSelectNina == other.poltronaVermelhaSelectNina
				&& puffQuadradoCouroCinzaClaro == other.puffQuadradoCouroCinzaClaro
				&& puffQuadradoCouroCinzaEscuro == other.puffQuadradoCouroCinzaEscuro
				&& puffRedondoBege == other.puffRedondoBege && puffRedondoCinzaClaro == other.puffRedondoCinzaClaro
				&& puffRedondoCinzaEscuro == other.puffRedondoCinzaEscuro
				&& puffRedondoVermelho == other.puffRedondoVermelho
				&& quadroMissaoECultura == other.quadroMissaoECultura && rack == other.rack
				&& sofaLina == other.sofaLina && tapeteSelect == other.tapeteSelect && tv26 == other.tv26
				&& tv32 == other.tv32 && tv40 == other.tv40 && tv43 == other.tv43 && tv50 == other.tv50
				&& tv65 == other.tv65 && tv75 == other.tv75;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("Agencia: ").append(agencia).append("<br>");
		sb.append("Gestor Santander: ").append(gestorSTD).append("<br>");
		sb.append("Gestor Responsável: ").append(gerenciadora).append("<br>");
		sb.append("Fornecedora que acessará o estoque: ").append(fornecedor).append("<br>");
		sb.append("Data prevista de acesso ao Estoque: ").append(data).append("<br>");
		sb.append("Entrada ou Saída: ");
		if (entrada.equalsIgnoreCase("entrada")) {
			sb.append("entrada").append("<br>");
		} else {
			sb.append("saida").append("<br>");
		}
		sb.append("Email: ").append(email).append("<br>");
	
		// Verifica e adiciona cada variável formatada
		if (aparadorDeEnvelope != 0) sb.append(formatarNome("aparadorDeEnvelope")).append(": ").append(aparadorDeEnvelope).append("<br>");
		if (armarioBaixoOficinas != 0) sb.append(formatarNome("armarioBaixoOficinas")).append(": ").append(armarioBaixoOficinas).append("<br>");
		if (armarioBaixoSmartRed != 0) sb.append(formatarNome("armarioBaixoSmartRed")).append(": ").append(armarioBaixoSmartRed).append("<br>");
		if (armarioImpressora != 0) sb.append(formatarNome("armarioImpressora")).append(": ").append(armarioImpressora).append("<br>");
		if (armarioImpressoraWorkCafe != 0) sb.append(formatarNome("armarioImpressoraWorkCafe")).append(": ").append(armarioImpressoraWorkCafe).append("<br>");
	
		if (balcaoCoworking != 0) sb.append(formatarNome("balcaoCoworking")).append(": ").append(balcaoCoworking).append("<br>");
		if (balcaoAtendimentoSelectDuo != 0) sb.append(formatarNome("balcaoAtendimentoSelectDuo")).append(": ").append(balcaoAtendimentoSelectDuo).append("<br>");
	
		if (bancadaLounge != 0) sb.append(formatarNome("bancadaLounge")).append(": ").append(bancadaLounge).append("<br>");
		if (banquetaCoworkingPreta != 0) sb.append(formatarNome("banquetaCoworkingPreta")).append(": ").append(banquetaCoworkingPreta).append("<br>");
		if (banquetaFunPreta != 0) sb.append(formatarNome("banquetaFunPreta")).append(": ").append(banquetaFunPreta).append("<br>");
		if (banquetaPipfeAlberflex != 0) sb.append(formatarNome("banquetaPipfeAlberflex")).append(": ").append(banquetaPipfeAlberflex).append("<br>");
	
		if (biomboEspecialistaArgila != 0) sb.append(formatarNome("biomboEspecialistaArgila")).append(": ").append(biomboEspecialistaArgila).append("<br>");
		if (biomboEspecialistaGrandeOficinas != 0) sb.append(formatarNome("biomboEspecialistaGrandeOficinas")).append(": ").append(biomboEspecialistaGrandeOficinas).append("<br>");
		if (biomboEspecialistaPequenoOficinas != 0) sb.append(formatarNome("biomboEspecialistaPequenoOficinas")).append(": ").append(biomboEspecialistaPequenoOficinas).append("<br>");
		if (biomboEspecialistaSmartRedCinza != 0) sb.append(formatarNome("biomboEspecialistaSmartRedCinza")).append(": ").append(biomboEspecialistaSmartRedCinza).append("<br>");
		if (biomboEspecialistaNeodotsBranco != 0) sb.append(formatarNome("biomboEspecialistaNeodotsBranco")).append(": ").append(biomboEspecialistaNeodotsBranco).append("<br>");
		if (biomboGnsArgila != 0) sb.append(formatarNome("biomboGnsArgila")).append(": ").append(biomboGnsArgila).append("<br>");
		if (biomboGnsOficinas != 0) sb.append(formatarNome("biomboGnsOficinas")).append(": ").append(biomboGnsOficinas).append("<br>");
		if (biomboGnsSmartRedCinza != 0) sb.append(formatarNome("biomboGnsSmartRedCinza")).append(": ").append(biomboGnsSmartRedCinza).append("<br>");
	
		if (cadeiraDeRodas != 0) sb.append(formatarNome("cadeiraDeRodas")).append(": ").append(cadeiraDeRodas).append("<br>");
		if (cadeiraDialogoCinzaOficinasCavalleti != 0) sb.append(formatarNome("cadeiraDialogoCinzaOficinasCavalleti")).append(": ").append(cadeiraDialogoCinzaOficinasCavalleti).append("<br>");
		if (cadeiraDialogoCinzaOficinasFlexform != 0) sb.append(formatarNome("cadeiraDialogoCinzaOficinasFlexform")).append(": ").append(cadeiraDialogoCinzaOficinasFlexform).append("<br>");
		if (cadeiraDialogoCinzaSemPadrao != 0) sb.append(formatarNome("cadeiraDialogoCinzaSemPadrao")).append(": ").append(cadeiraDialogoCinzaSemPadrao).append("<br>");
		if (cadeiraDialogoSmartRed != 0) sb.append(formatarNome("cadeiraDialogoSmartRed")).append(": ").append(cadeiraDialogoSmartRed).append("<br>");
		if (cadeiraEstofadoVermelhaSemPadrao != 0) sb.append(formatarNome("cadeiraEstofadoVermelhaSemPadrao")).append(": ").append(cadeiraEstofadoVermelhaSemPadrao).append("<br>");
		if (cadeiraGerentePreta != 0) sb.append(formatarNome("cadeiraGerentePreta")).append(": ").append(cadeiraGerentePreta).append("<br>");
		if (cadeiraGerenteSmartRed != 0) sb.append(formatarNome("cadeiraGerenteSmartRed")).append(": ").append(cadeiraGerenteSmartRed).append("<br>");
		if (cadeiraGerenteVermelha != 0) sb.append(formatarNome("cadeiraGerenteVermelha")).append(": ").append(cadeiraGerenteVermelha).append("<br>");
		if (cadeiraGiratoria != 0) sb.append(formatarNome("cadeiraGiratoria")).append(": ").append(cadeiraGiratoria).append("<br>");
		if (cadeiraPipgaAlberflexCoworking != 0) sb.append(formatarNome("cadeiraPipgaAlberflexCoworking")).append(": ").append(cadeiraPipgaAlberflexCoworking).append("<br>");
		if (cadeiraPretaSemPadrao != 0) sb.append(formatarNome("cadeiraPretaSemPadrao")).append(": ").append(cadeiraPretaSemPadrao).append("<br>");
		if (cadeiraValentina != 0) sb.append(formatarNome("cadeiraValentina")).append(": ").append(cadeiraValentina).append("<br>");
	
		if (cofreBocaDeLobo != 0) sb.append(formatarNome("cofreBocaDeLobo")).append(": ").append(cofreBocaDeLobo).append("<br>");
		if (cvi1x1 != 0) sb.append(formatarNome("cvi1x1")).append(": ").append(cvi1x1).append("<br>");
		if (cvi2x1 != 0) sb.append(formatarNome("cvi2x1")).append(": ").append(cvi2x1).append("<br>");
		if (cvi3x1 != 0) sb.append(formatarNome("cvi3x1")).append(": ").append(cvi3x1).append("<br>");
	
		if (divisoriaCaixaAcrilicoVermelho != 0) sb.append(formatarNome("divisoriaCaixaAcrilicoVermelho")).append(": ").append(divisoriaCaixaAcrilicoVermelho).append("<br>");
	
		if (estanteWorkCafePretaAmadeirada != 0) sb.append(formatarNome("estanteWorkCafePretaAmadeirada")).append(": ").append(estanteWorkCafePretaAmadeirada).append("<br>");
	
		if (forroRipado != 0) sb.append(formatarNome("forroRipado")).append(": ").append(forroRipado).append("<br>");
	
		if (fragmentadora != 0) sb.append(formatarNome("fragmentadora")).append(": ").append(fragmentadora).append("<br>");
	
		if (frigobar != 0) sb.append(formatarNome("frigobar")).append(": ").append(frigobar).append("<br>");
	
		if (gaveteiro != 0) sb.append(formatarNome("gaveteiro")).append(": ").append(gaveteiro).append("<br>");
	
		if (guicheCaixa != 0) sb.append(formatarNome("guicheCaixa")).append(": ").append(guicheCaixa).append("<br>");
		if (guicheCaixaPne != 0) sb.append(formatarNome("guicheCaixaPne")).append(": ").append(guicheCaixaPne).append("<br>");
	
		if (lixeiraCafe != 0) sb.append(formatarNome("lixeiraCafe")).append(": ").append(lixeiraCafe).append("<br>");
	
		if (locker != 0) sb.append(formatarNome("locker")).append(": ").append(locker).append("<br>");
	
		if (longarinaCinza != 0) sb.append(formatarNome("longarinaCinza")).append(": ").append(longarinaCinza).append("<br>");
		if (longarinaComObesoCinzaSmartRed != 0) sb.append(formatarNome("longarinaComObesoCinzaSmartRed")).append(": ").append(longarinaComObesoCinzaSmartRed).append("<br>");
		if (longarinaVermelha != 0) sb.append(formatarNome("longarinaVermelha")).append(": ").append(longarinaVermelha).append("<br>");
	
		if (luminariaDeTrilho != 0) sb.append(formatarNome("luminariaDeTrilho")).append(": ").append(luminariaDeTrilho).append("<br>");
		if (luminariaPendenteWkcLum11 != 0) sb.append(formatarNome("luminariaPendenteWkcLum11")).append(": ").append(luminariaPendenteWkcLum11).append("<br>");
		if (luminariaPendenteWkcLum12 != 0) sb.append(formatarNome("luminariaPendenteWkcLum12")).append(": ").append(luminariaPendenteWkcLum12).append("<br>");
	
		if (lustreSolitaria != 0) sb.append(formatarNome("lustreSolitaria")).append(": ").append(lustreSolitaria).append("<br>");
	
		if (mesaReuniaoAberta != 0) sb.append(formatarNome("mesaReuniaoAberta")).append(": ").append(mesaReuniaoAberta).append("<br>");
		if (mesaBistraoAmadeirada != 0) sb.append(formatarNome("mesaBistraoAmadeirada")).append(": ").append(mesaBistraoAmadeirada).append("<br>");
		if (mesaCafePreta != 0) sb.append(formatarNome("mesaCafePreta")).append(": ").append(mesaCafePreta).append("<br>");
		if (mesaCoworking != 0) sb.append(formatarNome("mesaCoworking")).append(": ").append(mesaCoworking).append("<br>");
		if (mesaDeCentroCannesPreta != 0) sb.append(formatarNome("mesaDeCentroCannesPreta")).append(": ").append(mesaDeCentroCannesPreta).append("<br>");
		if (mesaDeReuniaoGrandeQuadrada != 0) sb.append(formatarNome("mesaDeReuniaoGrandeQuadrada")).append(": ").append(mesaDeReuniaoGrandeQuadrada).append("<br>");
		if (mesaDeReuniaoQuadradaOficinas != 0) sb.append(formatarNome("mesaDeReuniaoQuadradaOficinas")).append(": ").append(mesaDeReuniaoQuadradaOficinas).append("<br>");
		if (mesaEspecialistaOficinasDireita != 0) sb.append(formatarNome("mesaEspecialistaOficinasDireita")).append(": ").append(mesaEspecialistaOficinasDireita).append("<br>");
		if (mesaEspecialistaSmartRedDireita != 0) sb.append(formatarNome("mesaEspecialistaSmartRedDireita")).append(": ").append(mesaEspecialistaSmartRedDireita).append("<br>");
		if (mesaEspecialistaSmartRedEsquerda != 0) sb.append(formatarNome("mesaEspecialistaSmartRedEsquerda")).append(": ").append(mesaEspecialistaSmartRedEsquerda).append("<br>");
		if (mesaGnsOficinasDireita != 0) sb.append(formatarNome("mesaGnsOficinasDireita")).append(": ").append(mesaGnsOficinasDireita).append("<br>");
		if (mesaGnsSmartRedDireita != 0) sb.append(formatarNome("mesaGnsSmartRedDireita")).append(": ").append(mesaGnsSmartRedDireita).append("<br>");
		if (mesaLateralLaquila != 0) sb.append(formatarNome("mesaLateralLaquila")).append(": ").append(mesaLateralLaquila).append("<br>");
		if (mesaRedondaSaarinen != 0) sb.append(formatarNome("mesaRedondaSaarinen")).append(": ").append(mesaRedondaSaarinen).append("<br>");
		if (mesaRetaguardaArgila != 0) sb.append(formatarNome("mesaRetaguardaArgila")).append(": ").append(mesaRetaguardaArgila).append("<br>");
		if (mesaRetaguardaOficinas != 0) sb.append(formatarNome("mesaRetaguardaOficinas")).append(": ").append(mesaRetaguardaOficinas).append("<br>");
		if (mesaReuniaoRedonda != 0) sb.append(formatarNome("mesaReuniaoRedonda")).append(": ").append(mesaReuniaoRedonda).append("<br>");
		if (mesaSalaAvancar != 0) sb.append(formatarNome("mesaSalaAvancar")).append(": ").append(mesaSalaAvancar).append("<br>");
		if (mesaSelect != 0) sb.append(formatarNome("mesaSelect")).append(": ").append(mesaSelect).append("<br>");
	
		if (microondas != 0) sb.append(formatarNome("microondas")).append(": ").append(microondas).append("<br>");
	
		if (molduraTarifario32 != 0) sb.append(formatarNome("molduraTarifario32")).append(": ").append(molduraTarifario32).append("<br>");
		if (molduraTarifario40 != 0) sb.append(formatarNome("molduraTarifario40")).append(": ").append(molduraTarifario40).append("<br>");
		if (molduraTarifario50 != 0) sb.append(formatarNome("molduraTarifario50")).append(": ").append(molduraTarifario50).append("<br>");
		if (molduraTarifario65 != 0) sb.append(formatarNome("molduraTarifario65")).append(": ").append(molduraTarifario65).append("<br>");
	
		if (poltronaICouroCinzaClaro != 0) sb.append(formatarNome("poltronaICouroCinzaClaro")).append(": ").append(poltronaICouroCinzaClaro).append("<br>");
		if (poltronaICouroCinzaEscuro != 0) sb.append(formatarNome("poltronaICouroCinzaEscuro")).append(": ").append(poltronaICouroCinzaEscuro).append("<br>");
	    if (poltronaITecidoVermelho != 0) sb.append("poltronaITecidoVermelho: ").append(poltronaITecidoVermelho).append("<br>");
	    if (poltronaLCouroCinzaClaro != 0) sb.append("poltronaLCouroCinzaClaro: ").append(poltronaLCouroCinzaClaro).append("<br>");
	    if (poltronaLCouroCinzaEscuro != 0) sb.append("poltronaLCouroCinzaEscuro: ").append(poltronaLCouroCinzaEscuro).append("<br>");
	    if (poltronaLTecidoCinzaEscuro != 0) sb.append("poltronaLTecidoCinzaEscuro: ").append(poltronaLTecidoCinzaEscuro).append("<br>");
	    if (poltronaLTecidoVermelho != 0) sb.append("poltronaLTecidoVermelho: ").append(poltronaLTecidoVermelho).append("<br>");
	    if (poltronaMaria != 0) sb.append(formatarNome("poltronaMaria: ")).append(poltronaMaria).append("<br>");
	    if (poltronaPreta != 0) sb.append(formatarNome("poltronaPreta: ")).append(poltronaPreta).append("<br>");
	    if (poltronaSuiteMarromSelect != 0) sb.append(formatarNome("poltronaSuiteMarromSelect: ")).append(poltronaSuiteMarromSelect).append("<br>");
	    if (poltronaVermelhaSelectNina != 0) sb.append(formatarNome("poltronaVermelhaSelectNina: ")).append(poltronaVermelhaSelectNina).append("<br>");

	    if (puffQuadradoCouroCinzaClaro != 0) sb.append(formatarNome("puffQuadradoCouroCinzaClaro: ")).append(puffQuadradoCouroCinzaClaro).append("<br>");
	    if (puffQuadradoCouroCinzaEscuro != 0) sb.append(formatarNome("puffQuadradoCouroCinzaEscuro: ")).append(puffQuadradoCouroCinzaEscuro).append("<br>");
	    if (puffRedondoBege != 0) sb.append(formatarNome("puffRedondoBege: ")).append(puffRedondoBege).append("<br>");
	    if (puffRedondoCinzaClaro != 0) sb.append(formatarNome("puffRedondoCinzaClaro: ")).append(puffRedondoCinzaClaro).append("<br>");
	    if (puffRedondoCinzaEscuro != 0) sb.append(formatarNome("puffRedondoCinzaEscuro: ")).append(puffRedondoCinzaEscuro).append("<br>");
	    if (puffRedondoVermelho != 0) sb.append(formatarNome("puffRedondoVermelho: ")).append(puffRedondoVermelho).append("<br>");

	    if (quadroMissaoECultura != 0) sb.append(formatarNome("quadroMissaoECultura: ")).append(quadroMissaoECultura).append("<br>");
	    if (rack != 0) sb.append(formatarNome("rack: ")).append(rack).append("<br>");

	    if (sofaLina != 0) sb.append(formatarNome("sofaLina: ")).append(sofaLina).append("<br>");

	    if (tapeteSelect != 0) sb.append(formatarNome("tapeteSelect: ")).append(tapeteSelect).append("<br>");

	    if (tv26 != 0) sb.append(formatarNome("tv26: ")).append(tv26).append("<br>");
	    if (tv32 != 0) sb.append(formatarNome("tv32: ")).append(tv32).append("<br>");
	    if (tv40 != 0) sb.append(formatarNome("tv40: ")).append(tv40).append("<br>");
	    if (tv43 != 0) sb.append(formatarNome("tv43: ")).append(tv43).append("<br>");
	    if (tv50 != 0) sb.append(formatarNome("tv50: ")).append(tv50).append("<br>");
	    if (tv65 != 0) sb.append(formatarNome("tv65: ")).append(tv65).append("<br>");
	    if (tv75 != 0) sb.append(formatarNome("tv75: ")).append(tv75).append("<br>");

	    return sb.toString();
	}
    
    private String formatarNome(String nome) {
		// Substitui letras maiúsculas por espaço + letra maiúscula
		String formatado = nome.replaceAll("([A-Z])", " $1");
		// Converte a primeira letra de cada palavra para maiúscula
		formatado = formatado.substring(0, 1).toUpperCase() + formatado.substring(1);
		return formatado.trim(); // Remove espaços extras no início/fim
	}
    
    
    

}

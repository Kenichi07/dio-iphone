public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

  @Override
  public void tocar() {
    System.out.println("Tocando!");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando!");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println(musica + "selecionada!");
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para o número: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo!");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando Correio de Voz.");
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo Página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando Nova Aba!");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando Página!");
  }
  
}
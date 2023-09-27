class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba do navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página da web...");
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando os comportamentos
        meuIPhone.tocar();
        meuIPhone.ligar("123-456-789");
        meuIPhone.exibirPagina("https://www.example.com");
    }

}
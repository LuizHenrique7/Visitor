public class UsuarioVisitor implements Visitor {

    public String exibir(Usuario usuario){ return usuario.aceitar(this);}

    @Override
    public String exibirComputador(Computador computador) {
        return "Computador{" +
                "marca=" + computador.getMarca() +
                ", modelo='" + computador.getModelo() + '\'' +
                ", loja=" + computador.getNomeLoja() +
                '}';
    }

    @Override
    public String exibirNotebook(Notebook notebook) {
        return "Notebook{" +
                "marca=" + notebook.getMarca() +
                ", modelo='" + notebook.getModelo() + '\'' +
                ", loja=" + notebook.getNomeLoja() +
                '}';
    }

    @Override
    public String exibirCelular(Celular celular) {
        return "Celular{" +
                "marca=" + celular.getMarca() +
                ", modelo='" + celular.getModelo() + '\'' +
                ", loja=" + celular.getNomeLoja() +
                '}';
    }
}

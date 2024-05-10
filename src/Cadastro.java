import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Abstrata.Funcionario;

public class Cadastro {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar (Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static Funcionario buscar(int matricula) {

        for (Funcionario temp : listaFuncionarios) {

            if (temp.getMatricula() == matricula) {

                return temp;
            }
        }

        return null;

    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }
    
    public static boolean remover(int matricula) {
        Iterator<Funcionario> iterator = listaFuncionarios.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();
            if (funcionario.getMatricula() == matricula) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public static void limparLista() {
        listaFuncionarios.clear();
    }

}
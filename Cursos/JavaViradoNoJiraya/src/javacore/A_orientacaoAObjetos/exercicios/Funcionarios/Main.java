package javacore.A_orientacaoAObjetos.exercicios.Funcionarios;

import javacore.A_orientacaoAObjetos.exercicios.Funcionarios.Domain.Funcionario;
import javacore.A_orientacaoAObjetos.exercicios.Funcionarios.Domain.EmpresaRelatorio;


public class Main
{
    public static void main(String[] args){
        EmpresaRelatorio relatorio = new EmpresaRelatorio();
        Funcionario funcionario_001 = new Funcionario();

        funcionario_001.setName("Edson Gloinner");
        funcionario_001.setAge((short)32);
        funcionario_001.setSalary(new double[]{500, 200, 300});
        relatorio.imprimirDadosDoFuncionario(funcionario_001);

    }
}

package com.raphael.pi.senac.service;

import com.raphael.pi.senac.models.Aluno;
import com.raphael.pi.senac.models.Fornecedor;
import com.raphael.pi.senac.models.PessoaFisica;
import com.raphael.pi.senac.models.Professor;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuService {

    Scanner scanner = new Scanner(System.in);
    TxtService service = new TxtService();

    public void inicio() throws IOException {
        boolean system = true;

        while(system) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Cadastrar um professor");
            System.out.println("2 - Cadastrar um aluno");
            System.out.println("3 - Cadastrar um fornecedor");
            System.out.println("4 - Listar professores");
            System.out.println("5 - Listar alunos");
            System.out.println("0 - Sair");

            Integer opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    system = false;
                    break;
                case 1:
                    cadastrarPessoaFisica(Professor.class);
                    break;
                case 2:
                    cadastrarPessoaFisica(Aluno.class);
                    break;
                case 3:
                    cadastrarPessoaJuridica(Fornecedor.class);
                    break;
                case 4:
                    listarProfessores();
                    break;
                case 5:
                    listarAlunos();
                    break;
            }
        }
    }

    private void cadastrarPessoaJuridica(Class<Fornecedor> fornecedorClass) throws IOException {
        System.out.println("Digite o cnpj: ");
        scanner.nextLine();
        String cnpj = scanner.nextLine();

        System.out.println("Digite a razão social: ");
        String razaoSocial = scanner.nextLine();

        System.out.println("Digite a inscrição estadual: ");
        String inscricaoEstadual = scanner.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email: ");
        String email = scanner.nextLine();

        System.out.println("Digite o id: ");
        String id = scanner.nextLine();

        System.out.println("Digite o segmento: ");
        String segmento = scanner.nextLine();

        System.out.println("Digite a forma de pagamento: ");
        String formaDePagamento = scanner.nextLine();

        System.out.println("Digite a data da primeira compra: ");
        String dataPrimeiraCompra = scanner.nextLine();

        System.out.println("Digite a data da última compra: ");
        String dataUltimaCompra = scanner.nextLine();

        Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.setCnpj(cnpj);
        novoFornecedor.setRazaoSocial(razaoSocial);
        novoFornecedor.setInscricaoEstadual(inscricaoEstadual);
        novoFornecedor.setEndereco(endereco);
        novoFornecedor.setTelefone(telefone);
        novoFornecedor.setEmail(email);
        novoFornecedor.setIdFornecedor(Integer.valueOf(id));
        novoFornecedor.setFormaDePagamento(formaDePagamento);
        novoFornecedor.setDataPrimeiraCompra(dataPrimeiraCompra);
        novoFornecedor.setDataUltimaCompra(dataUltimaCompra);

        service.salvarClasseEmTxt(novoFornecedor);
    }

    private void listarProfessores() {
        service.listarPessoaFisica(Professor.class);
    }

    private void listarAlunos() {
        service.listarPessoaFisica(Aluno.class);
    }

    private void cadastrarPessoaFisica(Class clazz) throws IOException {
        System.out.println("Digite o cpf: ");
        scanner.nextLine();
        String cpf = scanner.nextLine();

        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite a data de nascimento(dd/mm/aaaa): ");
        String dataDeNascimento = scanner.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email: ");
        String email = scanner.nextLine();

        System.out.println("Digite o id: ");
        String id = scanner.nextLine();

        if (clazz.equals(Aluno.class)) {
            System.out.println("Digite o ano: ");
            String ano = scanner.nextLine();

            System.out.println("Digite o periodo (manhã, tarde ou noite): ");
            String periodo = scanner.nextLine();

            Aluno novoAluno = new Aluno();
            novoAluno.setCpf(cpf);
            novoAluno.setNomeCompleto(nomeCompleto);
            novoAluno.setDataDeNascimento(dataDeNascimento);
            novoAluno.setEndereco(endereco);
            novoAluno.setTelefone(telefone);
            novoAluno.setEmail(email);
            novoAluno.setIdAluno(Integer.parseInt(id));
            novoAluno.setAno(Integer.parseInt(ano));
            novoAluno.setPeriodo(periodo);
            novoAluno.setDataDeInscricao(LocalDate.now());

            service.salvarClasseEmTxt(novoAluno);

        } else if (clazz.equals(Professor.class)) {
            System.out.println("Digite a habilitação (matemática, português, etc.): ");
            String habilitacao = scanner.nextLine();

            System.out.println("Digite o salario ");
            Double salario = scanner.nextDouble();

            Professor novoProfessor = new Professor();
            novoProfessor.setCpf(cpf);
            novoProfessor.setNomeCompleto(nomeCompleto);
            novoProfessor.setDataDeNascimento(dataDeNascimento);
            novoProfessor.setEndereco(endereco);
            novoProfessor.setTelefone(telefone);
            novoProfessor.setEmail(email);
            novoProfessor.setIdProfessor(Integer.parseInt(id));
            novoProfessor.setHabilitacao(habilitacao);
            novoProfessor.setSalario(salario);
            novoProfessor.setDataDeContratacao(LocalDate.now());

            service.salvarClasseEmTxt(novoProfessor);
        }

    }

}

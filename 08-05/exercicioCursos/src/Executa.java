/*
3. Crie um método Main que cadastre uma quantidade indeterminada de objetos da classe CURSO(id, descricao, turno), faça a validação
de cada entrada de dados da seguinte forma: 
O id deve ser maior que zero, a descrição de conter pelo menos 10 caracteres, o turno só pode ser uma das opções: MATUTINO, 
VESPERTINO OU NOTURNO. Adicione todos em uma ArrayList e ao final mostre a quantidade de cursos por turno. Assuma que a classe 
CURSO já possui os sets, gets e contrutores, qualquer outro método que você queira utilizar deverá ser criado por você. 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Executa {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        boolean idValido = false;
        boolean descValida = false;
        boolean turnoValido = false;
        int resp = 0;

        //Criação do ArrayList para armazenar todos os Cursos
        ArrayList<Curso> cursos = new ArrayList<>();

        do { 
            //Estrutura de repetição para ID
            int id = 0;
            do {
                System.out.println("Digite o ID do Curso: ");
                id = entrada.nextInt();

                if (validaID(id)) {
                idValido = true;
                } else {
                System.out.println("Você digitou um ID inválido, tente novamente...");
                }
            } while (idValido == false);

            //Estrutura de repetição para DESCRIÇÃO
            String descricao = " ";
            do { 
                System.out.println("Digite a descrição do Curso: ");
                descricao = entrada.next();

                if(validaDescricao(descricao)) {
                    descValida = true;
                } else {
                    System.out.println("Você precisa adicionar uma descrição com mais de 10 caracteres, tente novamente...");
                }
            } while (descValida == false);

            //Estrutura de repetição para Turno do Curso
            String turno = "";
            do { 
                System.out.println("O Curso é: MATUTINO, VESPERTINO OU NOTURNO ? ");
                turno = entrada.next();

                if(validaTurno(turno)) {
                    turnoValido = true;
                } else {
                    System.out.println("Você digitou o turno de modo incorreto, tente novamente...");
                }
            } while (turnoValido == false);

            Curso curso = new Curso();
            curso.setId(id);
            curso.setDescricao(descricao);
            curso.setTurno(turno);
            cursos.add(curso);

            //Estrutura de Repetição para Repetir Processo
            System.out.println("Deseja cadastrar outro Curso? [1 - Sim | 2 - Não]");
            resp = entrada.nextInt();

        } while (resp == 1);

        for (Curso curso2 : cursos) {
            System.out.println(curso2.getId());
            System.out.println(curso2.getDescricao());
            System.out.println(curso2.getTurno());
            
        }

        entrada.close();
    } // fim do MAIN

        //validação do ID
        public static boolean validaID(int id) {
            return id >= 0;
        }

        //Validação da Descrição
        public static boolean validaDescricao(String descricao) {
            if(descricao.length() > 10 ) {
                return true;
            } else {
                return false;
            }
        }

        //Validação do Turno
        public static boolean validaTurno(String turno) {
            return turno.equalsIgnoreCase("MATUTINO") || turno.equalsIgnoreCase("VESPERTINO") || turno.equalsIgnoreCase("NOTURNO");
        }
    
} //fim da CLASSE


class Curso {
    private int id = 0;
    private String descricao;
    private String turno;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}

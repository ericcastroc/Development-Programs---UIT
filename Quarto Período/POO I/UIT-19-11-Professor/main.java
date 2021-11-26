/*Criar a classe testaProfessor que contem uma coleção de professores. Insira professores de todos os tipos e percorra esta coleção mostrando 
o nome e salário de cada um deles. */

public class main {
    public static void main(String[] args){
    Professor professorDedicado = new ProfessorDedicado("82457", "Marcelo", 'M', "16/05/1965", "02/07/1976");
    Professor professorHorista = new ProfessorHorista("84768", "Flavia", 'F', "15/09/1952", "15/01/2006", 6);
    Professor professorVisitante = new ProfessorVisitante("78965", "Carlos", 'M',"16/02/2000", "14/18/2019", 10, "UIT");


    
    System.out.println(professorDedicado.toString());
    System.out.println(professorDedicado.aposentar());

    System.out.println(professorHorista.toString());
    System.out.println(professorHorista.aposentar());

    System.out.println(professorVisitante.toString());
    System.out.println(professorVisitante.aposentar());


    }
}

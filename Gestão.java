import java.util.ArrayList;
import java.util.Scanner;

public class Gestão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList adm= new ArrayList();
		
		 administrativo AD= new administrativo();
		 
		 alunos A = new alunos();
		 cursos C= new cursos(null, null, null);
		 disciplinas D=new disciplinas(null, null, CS);
		 escola E=new escola();
		 funcionário Func= new funcionário();
		 professor PR=new professor();
		 setor Se= new setor();
		 turmas T=new turmas(); 
		
		
		System.out.println("Nome do funcionário");
	    AD.setNome(sc.nextLine());
		System.out.println("Matricula");
		AD.setMatricula(sc.nextLine());
		System.out.println("Endereço");
		AD.setEndereço(sc.nextLine());
		System.out.println("Telefone");
		AD.setEndereço(sc.nextLine());
		System.out.println("Data de admissão");
		AD.setDataDeAdm(sc.nextLine());
		System.out.println("Salário");
		AD.setSalário(sc.nextFloat());
		System.out.println("Setor");
		AD.setSetor(sc.next());
		
		adm.add(AD);
		

		System.out.println("Nome do aluno");
		System.out.println("Matricula");
		System.out.println("Endereço");
		System.out.println("Telefone");
		System.out.println("Disciplina");
		System.out.println("Turma");

		System.out.println("Nome do funcionário");
		System.out.println("Matricula");
		System.out.println("Endereço");
		System.out.println("Telefone");
		System.out.println("Data de admissão");
		System.out.println("Salário");
		System.out.println("Setor");
		
		
		

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Gest�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList adm= new ArrayList();
		
		 administrativo AD= new administrativo();
		 
		 alunos A = new alunos();
		 cursos C= new cursos(null, null, null);
		 disciplinas D=new disciplinas(null, null, CS);
		 escola E=new escola();
		 funcion�rio Func= new funcion�rio();
		 professor PR=new professor();
		 setor Se= new setor();
		 turmas T=new turmas(); 
		
		
		System.out.println("Nome do funcion�rio");
	    AD.setNome(sc.nextLine());
		System.out.println("Matricula");
		AD.setMatricula(sc.nextLine());
		System.out.println("Endere�o");
		AD.setEndere�o(sc.nextLine());
		System.out.println("Telefone");
		AD.setEndere�o(sc.nextLine());
		System.out.println("Data de admiss�o");
		AD.setDataDeAdm(sc.nextLine());
		System.out.println("Sal�rio");
		AD.setSal�rio(sc.nextFloat());
		System.out.println("Setor");
		AD.setSetor(sc.next());
		
		adm.add(AD);
		

		System.out.println("Nome do aluno");
		System.out.println("Matricula");
		System.out.println("Endere�o");
		System.out.println("Telefone");
		System.out.println("Disciplina");
		System.out.println("Turma");

		System.out.println("Nome do funcion�rio");
		System.out.println("Matricula");
		System.out.println("Endere�o");
		System.out.println("Telefone");
		System.out.println("Data de admiss�o");
		System.out.println("Sal�rio");
		System.out.println("Setor");
		
		
		

	}

}

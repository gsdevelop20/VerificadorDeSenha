
import java.util.Locale;
import java.util.Scanner;

public class verificaçãoDeSenha {
									/*verificação de senha*/
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Crie uma senha.");
		int criarSenha = sc.nextInt();

		System.out.println("Digite a Senha.");
		int senha = sc.nextInt();
		int tentativas = 0;

		while (senha != criarSenha && tentativas < 3) {

			System.out.println("Senha Invalida");
			System.out.println("Digite Novamente");
			tentativas++;
			senha = sc.nextInt();
		}

		if (tentativas < 3 || senha == criarSenha) {
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Excesso de tentativas");
			System.exit(0);
		}
		
		System.out.println("Você entrou");
		sc.close();
	}

}

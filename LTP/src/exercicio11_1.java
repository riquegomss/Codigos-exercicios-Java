import java.util.*;
import java.io.*;
public class exercicio11_1 {
	public static class Clientes{
		public char ativo;
		public int codCliente;
		public String nomeCliente;
		public float vlrCompra;
		public int anoPrimeiraCompra;
		public char emDia;
	}
	public static void main(String[] args) {
		Clientes clientes = new Clientes();
		RandomAccessFile arquivo;
		Scanner leia = new Scanner(System.in);
		int codChave;
		boolean encontrou;
		boolean teste = true;
		char confirmacao;

		do {
			do {
				System.out.println(" ***** INCLUSAO DE CLIENTES ****** ");
				System.out.println("Digite o codigo do cliente (0 para encerrar)");
				codChave = leia.nextInt();
				leia.nextLine();
				if(codChave == 0) {
					break;
				}
				if(codChave % 1 != 0 || codChave < 0) {
					System.out.println("Erro! O codigo deve ser um numero inteiro e nao pode ser menor que 0.");
					teste = false;
				}
				encontrou = false;
				try {
					arquivo = new RandomAccessFile("CLIENTES.DAT","rw");
					while(true) {
						clientes.ativo = arquivo.readChar();
						clientes.codCliente = arquivo.readInt();
						clientes.nomeCliente = arquivo.readUTF();
						clientes.vlrCompra = arquivo.readFloat();
						clientes.anoPrimeiraCompra = arquivo.readInt();
						clientes.emDia = arquivo.readChar();
						if(codChave == clientes.codCliente && clientes.ativo =='S' ) {
							System.out.println("Matricula ja cadastrada, digite outro valor\n");
							encontrou = true;
							break;
						}
					}
					arquivo.close();
				}catch(EOFException e) {
					encontrou = false;
				}catch(IOException e) {
					System.out.println("Erro na abertura do arquivo - programa sera finalizado");
					System.exit(0);
				}
			}while(encontrou && teste);
			if(codChave == 0) {
				System.out.println("\n PROGRAMA ENCERRADO!");
				break;
			}
			clientes.ativo = 'S';
			clientes.codCliente = codChave;
			do {
				System.out.println("Digite o nome do cliente: ");
				clientes.nomeCliente = leia.nextLine();
				if(clientes.nomeCliente.length() < 10) {
					System.out.println("Nome invalido! O nome deve ter no minimo 10 caracteres.");
				}
			}while(clientes.nomeCliente.length() < 10);
			
			do {
				System.out.println("Digite o valor da compra do cliente: ");
				clientes.vlrCompra = leia.nextFloat();
				if(clientes.vlrCompra < 0) {
					System.out.println("Valor invalido. O valor deve ser maior que 0!");
				}
			}while(clientes.vlrCompra < 0);
			
			do {
				System.out.println("Digite o ano da primeira compra do cliente: ");
				clientes.anoPrimeiraCompra = leia.nextInt();
				if(clientes.anoPrimeiraCompra > 2013) {
					System.out.println("Ano invalido! O ano deve ser menor ou igual a 2013.");
				}
			}while(clientes.anoPrimeiraCompra > 2013);
			System.out.println("O cliente est� em dia como o pagamento? ");
			clientes.emDia = leia.next().charAt(0);
			do {
				System.out.println("\nConfirma a gravacao dos dados (S/N)? ");
				confirmacao = leia.next().charAt(0);
				if(confirmacao == 'S');
				try {
					arquivo = new RandomAccessFile("CLIENTES.DAT", "rw");
					arquivo.seek(arquivo.length());
					arquivo.writeChar(clientes.ativo);
					arquivo.writeInt(clientes.codCliente);
					arquivo.writeUTF(clientes.nomeCliente);
					arquivo.writeFloat(clientes.vlrCompra);
					arquivo.writeInt(clientes.anoPrimeiraCompra);
					arquivo.writeChar(clientes.emDia);
					arquivo.close();
					System.out.println("Dados gravados com sucesso! \n");
				}catch(IOException e) {
					System.out.println("Erro na gravacao do registro - programa sera finalizado.");
					System.exit(0);
				}
			}while(confirmacao != 'S' && confirmacao != 'N');
			leia.nextLine();
		}while(codChave != 0);
		leia.close();
	}

}
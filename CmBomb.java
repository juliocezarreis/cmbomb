import java.util.*;
import javax.swing.JOptionPane;

/*@new_jcr
* github.com/JulioProgrammer1
*/
public class CmBomb {

	static String fim = "";
	static String player1 = "";
	static String player2 = "";
	static double porcent1 = 0;
	static double porcent2 = 0;
	static int vida1 = 2;
	static int vida2 = 2;
	static int vida = 2;
	static int jogada = 0;
	static double porcent = 0;
	static int jogada1 = 0;
	static int jogada2 = 0;
	static int vitoria1 = 0;
	static int vitoria2 = 0;
	static boolean jogar = true;
	static boolean[] campo = new boolean[13];
	static Scanner input = new Scanner(System.in);

	/*Função para passar p/ próxima etapa*/
        static void ok() {
                System.out.println("Digite \"ok\" e tecle enter:");
                String okay = input.next();
        }
	static void grafico1() {
		System.out.println("+---------------+");
		System.out.println("|     CMBOMB    |");
		System.out.println("|_______________|");
		System.out.println("| 1 | 2 | 3 | 4 |");
		System.out.println(" _______________");
		System.out.println("| 5 | 6 | 7 | 8 |");
		System.out.println(" _______________");
		System.out.println("| 9 | 10| 11| 12|");
		System.out.println("+---------------+");
		ok();
	}
	static void p1() {
		System.out.println("Escolha 6 posições do grafico, voce estarah plantando uma bomba em cada uma.");
	}
	static void p2() {
		System.out.println(
				"Escolha posições para se movimentar no campo, se conseguir 6 movimentos, você sai na frente!\nCuidado com as bombas!:)");
		ok();
	}
	static void p3() {
		System.out.println("Agora você vai implantar, Já sabe como é.");
		ok();
	}
	static void p4() {
		System.out.println("Agora tente se movimentar no campo, Já sabe como é.");
		ok();
	}
	/*Implantação de bombas*/
	static void implantacao1() {
		int posicao;
		for (int i = 0; i < 6; i++) {
			String implante1 = JOptionPane.showInputDialog(null, "Digite um numero:");
			if (implante1.length() >= 2) {
				String s1 = "" + implante1.charAt(0);
				String s2 = "" + implante1.charAt(1);
				String s3 = s1 + s2;
				posicao = Integer.parseInt(s3);
			} else {
				String s1 = "" + implante1.charAt(0);
				posicao = Integer.parseInt(s1);
			}
			if (posicao < 1 || posicao > 12) {
				JOptionPane.showMessageDialog(null, "Posicao invalida!");
				i--;
				continue;
			}
			if (campo[posicao] == true) {
				JOptionPane.showMessageDialog(null, "Vc ja implantou ai! :)");
				i--;
				continue;
			} else {
				campo[posicao] = true;
			}
			if (i == 5) {
				JOptionPane.showMessageDialog(null, "Implante feito com sucesso!");
			}
		}
	}
	/*Tentativa de sobrevivência*/
	static void tentativa1() {
		boolean continua = true;
		int posicaot1;
		for (int i = 0; i < 6; i++) {
			String escolha1 = JOptionPane.showInputDialog(null,
					"❤️ = " + vida2 + ", " + porcent2 + "%\nDigite um numero:");
			jogada2++;
			if (escolha1.length() >= 2) {
				String n1 = "" + escolha1.charAt(0);
				String n2 = "" + escolha1.charAt(1);
				String n3 = n1 + n2;
				posicaot1 = Integer.parseInt(n3);
			} else {
				String n4 = "" + escolha1.charAt(0);
				posicaot1 = Integer.parseInt(n4);
			}
			if (posicaot1 < 1 || posicaot1 > 12) {
				JOptionPane.showMessageDialog(null, "Posicao invalida!");
				i--;
				jogada2--;
				continue;
			}
			porcent2 = (100 * jogada2) / 6;
			if (continua) {
				if (campo[posicaot1] == true && jogada2 != 6) {
					JOptionPane.showMessageDialog(null, "BOMBA!");
					vida2--;
				} else if (jogada2 != 6 && vida2 != 0) {
					JOptionPane.showMessageDialog(null, "Ok!");
				}
				if (vida2 == 0 && jogada2 != 6) {
					JOptionPane.showMessageDialog(null, "Voce saiu perdendo!");
					vitoria1++;
					break;
				} else if (jogada2 == 6) {
					JOptionPane.showMessageDialog(null, "6 jogadas\nVoce saiu vencendo!\n" + porcent2 + "%");
					vitoria2++;
					break;
				}
			}
		}
		for (int i = 0; i < campo.length; i++) {
			campo[i] = false;
		}
	}
	static void implantacao2() {
		int posicao2;
		for (int i = 0; i < 6; i++) {
			String implante2 = JOptionPane.showInputDialog(null, "Digite um numero:");
			if (implante2.length() >= 2) {
				String a1 = "" + implante2.charAt(0);
				String a2 = "" + implante2.charAt(1);
				String a3 = a1 + a2;
				posicao2 = Integer.parseInt(a3);
			} else {
				String a1 = "" + implante2.charAt(0);
				posicao2 = Integer.parseInt(a1);
			}
			if (posicao2 < 1 || posicao2 > 12) {
				JOptionPane.showMessageDialog(null, "Posicao invalida!");
				i--;
				continue;
			}
			if (campo[posicao2] == true) {
				JOptionPane.showMessageDialog(null, "Vc ja implantou ai! :)");
				i--;
				continue;
			} else {
				campo[posicao2] = true;
			}
			if (i == 5) {
				JOptionPane.showMessageDialog(null, "Implante feito com sucesso!");
			}
		}
	}
	static void tentativa2() {
		boolean continua2 = true;
		int posicaot2;
		for (int i = 0; i < 6; i++) {
			String escolha2 = JOptionPane.showInputDialog(null,
					"❤️ = " + vida1 + ", " + porcent1 + "%\nDigite um numero:");
			jogada1++;
			if (escolha2.length() >= 2) {
				String m1 = "" + escolha2.charAt(0);
				String m2 = "" + escolha2.charAt(1);
				String m3 = m1 + m2;
				posicaot2 = Integer.parseInt(m3);
			} else {
				String m4 = "" + escolha2.charAt(0);
				posicaot2 = Integer.parseInt(m4);
			}
			if (posicaot2 < 1 || posicaot2 > 12) {
				JOptionPane.showMessageDialog(null, "Posicao invalida!");
				i--;
				jogada1--;
				continue;
			}
			porcent1 = (100 * jogada1) / 6;
			if (continua2) {
				if (campo[posicaot2] == true && jogada1 != 6) {
					JOptionPane.showMessageDialog(null, "BOMBA!");
					vida1--;
				} else if (jogada1 != 6 && vida1 != 0) {
					JOptionPane.showMessageDialog(null, "Ok!");
				}
				if (vida1 == 0 && jogada1 != 6) {
					JOptionPane.showMessageDialog(null, "Nao conseguio 6 movimentos! :(");
					vitoria2++;
					break;
				} else if (jogada1 == 6) {
					JOptionPane.showMessageDialog(null, "6 jogadas\nVoce saiu vencendo!\n" + porcent1 + "%");
					vitoria1++;
					break;
				}
			}
		}
		for (int i = 0; i < campo.length; i++) {
			campo[i] = false;
		}
	}
	/*Caso o jogue saia empatado, tem uma função desempate*/
	static void empate() {
		JOptionPane.showMessageDialog(null, "Empate!\nVamos fazer uma rodada desempate :)");
		String f1 = JOptionPane.showInputDialog(null, player1 + "\nDigite um numero de 1 a 10:");
		String f2 = JOptionPane.showInputDialog(null, player2 + "\nDigite um numero de 1 a 10:");

		int dedos = 0;
		boolean par = false;

		if (f1.length() >= 2) {
			String d1 = "" + f1.charAt(0);
			String d2 = "" + f1.charAt(1);
			String d3 = d1 + d2;
			dedos += Integer.parseInt(d3);
		} else {
			String d4 = "" + f1.charAt(0);
			dedos += Integer.parseInt(d4);
		}
		if (f2.length() >= 2) {
			String p1 = "" + f2.charAt(0);
			String p2 = "" + f2.charAt(1);
			String p3 = p1 + p2;
			dedos += Integer.parseInt(p3);
		} else {
			String p4 = "" + f2.charAt(0);
			dedos += Integer.parseInt(p4);
		}

		if (dedos % 2 == 0) {
			System.out.println(player1 + ", voce implanta e " + player2 + " tenta se movimentar.");
			ok();
			par = true;
		} else {
			System.out.println(player2 + ", voce implanta e " + player1 + " tenta se movimentar.");
			ok();
		}
		for (int i = 0; i < campo.length; i++) {
			campo[i] = false;
		}
		int posicao3;
		for (int i = 0; i < 6; i++) {
			String implante3 = JOptionPane.showInputDialog(null, "Digite um numero:");
			if (implante3.length() >= 2) {
				String x1 = "" + implante3.charAt(0);
				String x2 = "" + implante3.charAt(1);
				String x3 = x1 + x2;
				posicao3 = Integer.parseInt(x3);
			} else {
				String x1 = "" + implante3.charAt(0);
				posicao3 = Integer.parseInt(x1);
			}
			if (posicao3 < 1 || posicao3 > 12) {
				JOptionPane.showMessageDialog(null, "Posicao invalida!");
				i--;
				continue;
			}
			if (campo[posicao3] == true) {
				JOptionPane.showMessageDialog(null, "Vc ja implantou ai! :)");
				i--;
				continue;
			} else {
				campo[posicao3] = true;
			}
			if (i == 5) {
				JOptionPane.showMessageDialog(null, "Implante feito com sucesso!");
			}
		}
		if (par) {
			System.out.println(player2 + ", tente se movimentar no grafico :) !");
			ok();
		} else {
			System.out.println(player1 + ", tente se movimentar no grafico :) !");
			ok();
		}

		boolean continua3 = true;
		int posicaot3;

		for (int i = 0; i < 6; i++) {
			String escolha3 = JOptionPane.showInputDialog(null,
					"❤️ = " + vida + ", " + porcent + "%\nDigite um numero:");
			jogada++;
			if (escolha3.length() >= 2) {
				String z1 = "" + escolha3.charAt(0);
				String z2 = "" + escolha3.charAt(1);
				String z3 = z1 + z2;
				posicaot3 = Integer.parseInt(z3);
			} else {
				String z4 = "" + escolha3.charAt(0);
				posicaot3 = Integer.parseInt(z4);
			}
			if (posicaot3 < 1 || posicaot3 > 12) {
				JOptionPane.showMessageDialog(null, "Posicao invalida!");
				i--;
				jogada--;
				continue;
			}
			porcent = (100 * jogada) / 6;
			if (continua3) {
				if (campo[posicaot3] == true && jogada != 6) {
					JOptionPane.showMessageDialog(null, "BOMBA!");
					vida--;
				} else if (jogada != 6 && vida != 0) {
					JOptionPane.showMessageDialog(null, "Ok!");
				}
				if (vida == 0 && jogada != 6) {
					JOptionPane.showMessageDialog(null, "Nao conseguio 6 movimentos! :(");
					if (par) {
						fim = JOptionPane.showInputDialog(null,
								player1 + " eh o vencedor!!!\nJogar novamente?\n1 - sim\n0 - nao");
						if (fim.equals("0")) {
							JOptionPane.showMessageDialog(null, "Fim de jogo!");
							jogar = false;
						}
					} else {
						fim = JOptionPane.showInputDialog(null,
								player2 + " eh o vencedor!!!\nJogar novamente?\n1 - sim\n0 - nao");
						if (fim.equals("0")) {
							JOptionPane.showMessageDialog(null, "Fim de jogo!");
							jogar = false;
						}
					}
					break;
				} else if (jogada == 6) {
					JOptionPane.showMessageDialog(null, "6 jogadas\nVoce saiu vencendo!\n" + porcent + "%");
					if (par) {
						fim = JOptionPane.showInputDialog(null,
								player2 + " eh o vencedor!!!\nJogar novamente?\n1 - sim\n0 - nao");
						if (fim.equals("0")) {
							JOptionPane.showMessageDialog(null, "Fim de jogo!");
							jogar = false;
						}
					} else {
						fim = JOptionPane.showInputDialog(null,
								player1 + " eh o vencedor!!!\nJogar novamente?\n1 - sim\n0 - nao");
						if (fim.equals("0")) {
							JOptionPane.showMessageDialog(null, "Fim de jogo!");
							jogar = false;
						}
					}
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		do {
			player1 = JOptionPane.showInputDialog(null, "Player1:");
			player2 = JOptionPane.showInputDialog(null, "Player2:");

			System.out.println(player1);

			p1();
			grafico1();
			implantacao1();

			System.out.println("\n" + player2);

			p2();
			tentativa1();

			System.out.println("\n" + player2);

			p3();
			implantacao2();

			System.out.println("\n" + player1);

			p4();
			tentativa2();

			if (vitoria1 == vitoria2) {
				empate();
			} else if (vitoria1 > vitoria2) {
				fim = JOptionPane.showInputDialog(null,
						player1 + " eh o vencedor!\nJogar novamente?\n1 - sim\n0 - nao");
				if (fim.equals("0")) {
					JOptionPane.showMessageDialog(null, "Fim de jogo!");
					jogar = false;
				}
			} else {
				fim = JOptionPane.showInputDialog(null,
						player2 + " eh o vencedor!\nJogar novamente?\n1 - sim\n0 - nao");
				if (fim.equals("0")) {
					JOptionPane.showMessageDialog(null, "Fim de jogo!");
					jogar = false;
				}
			}
			if (jogar) {
				fim = "";
				player1 = "";
				player2 = "";
				porcent1 = 0;
				porcent2 = 0;
				vida1 = 2;
				vida2 = 2;
				jogada1 = 0;
				jogada2 = 0;
				vitoria1 = 0;
				vitoria2 = 0;
				jogar = true;
				for (int i = 0; i < campo.length; i++) {
					campo[i] = false;
				}
			}
		} while (jogar);
	}
}

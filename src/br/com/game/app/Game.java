package br.com.game.app;

import javax.swing.JFrame;

public class Game extends JFrame {
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			/**
		 	* metodo principal - start a aplicaçao
		 	* @param args
		 	*/
	public static void main (String args[]) {
		new Game();
	
		
}
		/**
		 * Construtor
		 */	
	protected Game() {
			/*chama o metodo componentes*/
			componentes();
		}
	
			/**
			 * configura janela
			 */
	public void componentes() {
			/*titulo da janela*/
			setTitle("ChampsDaGalaxia");
			/*permite encerrar a aplicaçao*/
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			/*define o tamanho da janela*/
			setSize(600, 600);
			/*janela no centro da tela*/
			setLocationRelativeTo(null);
			/*bloqueia redimencionar a janela*/
			setResizable(false);
			/*define a janela visivel*/
			setVisible(true);
		}
	}
	


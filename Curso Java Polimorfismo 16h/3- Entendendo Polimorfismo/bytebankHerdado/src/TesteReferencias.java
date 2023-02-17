
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Marcos");
		g.setSalario(5000.00);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
		
		Designer d = new Designer();
		d.setSalario(2500.00);
	
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}

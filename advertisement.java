package SoftWareEngineering_Final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class advertisement extends JScrollPane {
	static JPanel TOP = new JPanel();;
	private JLabel A, B, C, D, E, F, G, H, I, J, K, L, M;
	private JTextArea Ata;
	private JTextField b, c, d, e, f, g, h, i, j, k, l, m;
	private JScrollPane a;

	advertisement() {
		super(TOP);
		TOP.setLayout(null);
		a = new JScrollPane();

		JLabel title = new JLabel("�x�~��Z");
		TOP.add(title);

		title.setBounds(317, 8, 320, 13);
		A = new JLabel("�u�@���e : ");
		Ata = new JTextArea(10, 15);
		Ata.setTabSize(4);
		Ata.setLineWrap(true);
		Ata.setWrapStyleWord(true);
		a = new JScrollPane(Ata);
		TOP.add(A);
		TOP.add(a);
		A.setBounds(170, 40, 220, 50);
		a.setBounds(240, 48, 250, 108);

		B = new JLabel("¾�����O : ");
		b = new JTextField();
		TOP.add(B);
		TOP.add(b);
		B.setBounds(170, 120, 220, 130);
		b.setBounds(240, 175, 250, 25);

		C = new JLabel("�u�@�ݹJ : ");
		c = new JTextField();
		C.setBounds(170, 140, 220, 150);
		c.setBounds(240, 205, 250, 25);
		TOP.add(C);
		TOP.add(c);

		D = new JLabel("�u�@�ʽ� : ");
		d = new JTextField();
		D.setBounds(170, 160, 220, 170);
		d.setBounds(240, 235, 250, 25);
		TOP.add(D);
		TOP.add(d);

		E = new JLabel("�W�Z�a�I : ");
		e = new JTextField();
		E.setBounds(170, 180, 220, 190);
		e.setBounds(240, 265, 250, 25);
		TOP.add(E);
		TOP.add(e);

		F = new JLabel("�޲z�d�� : ");
		f = new JTextField();
		F.setBounds(170, 200, 220, 210);
		f.setBounds(240, 295, 250, 25);
		TOP.add(F);
		TOP.add(f);

		G = new JLabel("�W�Z�ɬq : ");
		g = new JTextField();
		G.setBounds(170, 220, 220, 230);
		g.setBounds(240, 325, 250, 25);
		TOP.add(G);
		TOP.add(g);

		H = new JLabel("�𰲨�� : ");
		h = new JTextField();
		H.setBounds(170, 240, 220, 250);
		h.setBounds(240, 355, 250, 25);
		TOP.add(H);
		TOP.add(h);

		I = new JLabel("�ݨD�H�� : ");
		i = new JTextField();
		I.setBounds(170, 260, 220, 270);
		i.setBounds(240, 385, 250, 25);
		TOP.add(I);
		TOP.add(i);

		J = new JLabel("�������� : ");
		j = new JTextField();
		J.setBounds(170, 280, 220, 290);
		j.setBounds(240, 415, 250, 25);
		TOP.add(J);
		TOP.add(j);

		K = new JLabel("�u�@�g�� : ");
		k = new JTextField();
		K.setBounds(170, 300, 220, 310);
		k.setBounds(240, 445, 250, 25);
		TOP.add(K);
		TOP.add(k);

		L = new JLabel("�Ǿ��n�D : ");
		l = new JTextField();
		L.setBounds(170, 320, 220, 330);
		l.setBounds(240, 475, 250, 25);
		TOP.add(L);
		TOP.add(l);

		M = new JLabel("�u�@�ޯ� : ");
		m = new JTextField();
		M.setBounds(170, 340, 220, 350);
		m.setBounds(240, 505, 250, 25);
		TOP.add(M);
		TOP.add(m);
	}
}

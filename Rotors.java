import java.util.*;

public class Rotors
{
	public int rotor1(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}
		
		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}


		HashMap<Integer, Integer> rotor1 = new HashMap<Integer, Integer>();
	    rotor1.put(a, e);
	    rotor1.put(b, k);
	    rotor1.put(c, m);
		rotor1.put(d, f);
		rotor1.put(e, l);
		rotor1.put(f, g);
		rotor1.put(g, d);
		rotor1.put(h, q);
		rotor1.put(i, v);
		rotor1.put(j, z);
		rotor1.put(k, n);
		rotor1.put(l, t);
		rotor1.put(m, o);
		rotor1.put(n, w);
		rotor1.put(o, y);
		rotor1.put(p, h);
		rotor1.put(q, x);
		rotor1.put(r, u);
		rotor1.put(s, s);
		rotor1.put(t, p);
		rotor1.put(u, a);
		rotor1.put(v, i);
		rotor1.put(w, b);
		rotor1.put(x, r);
		rotor1.put(y, c);
		rotor1.put(z, j);

		return rotor1.get(value);
	}

	public int rotor1Inverse(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}
		
		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}

		HashMap<Integer, Integer> rotor1Inverse = new HashMap<Integer, Integer>();
	    rotor1Inverse.put(a, u);
	    rotor1Inverse.put(b, w);
	    rotor1Inverse.put(c, y);
		rotor1Inverse.put(d, g);
		rotor1Inverse.put(e, a);
		rotor1Inverse.put(f, d);
		rotor1Inverse.put(g, f);
		rotor1Inverse.put(h, p);
		rotor1Inverse.put(i, v);
		rotor1Inverse.put(j, z);
		rotor1Inverse.put(k, b);
		rotor1Inverse.put(l, e);
		rotor1Inverse.put(m, c);
		rotor1Inverse.put(n, k);
		rotor1Inverse.put(o, m);
		rotor1Inverse.put(p, t);
		rotor1Inverse.put(q, h);
		rotor1Inverse.put(r, x);
		rotor1Inverse.put(s, s);
		rotor1Inverse.put(t, l);
		rotor1Inverse.put(u, r);
		rotor1Inverse.put(v, i);
		rotor1Inverse.put(w, n);
		rotor1Inverse.put(x, q);
		rotor1Inverse.put(y, o);
		rotor1Inverse.put(z, j);

		return rotor1Inverse.get(value);
	}

	public int rotor2(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}

		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}

		HashMap<Integer, Integer> rotor2 = new HashMap<Integer, Integer>();
		rotor2.put(a, a);
	    rotor2.put(b, j);
	    rotor2.put(c, d);
		rotor2.put(d, k);
		rotor2.put(e, s);
		rotor2.put(f, i);
		rotor2.put(g, r);
		rotor2.put(h, u);
		rotor2.put(i, x);
		rotor2.put(j, b);
		rotor2.put(k, l);
		rotor2.put(l, h);
		rotor2.put(m, w);
		rotor2.put(n, t);
		rotor2.put(o, m);
		rotor2.put(p, c);
		rotor2.put(q, q);
		rotor2.put(r, g);
		rotor2.put(s, z);
		rotor2.put(t, n);
		rotor2.put(u, p);
		rotor2.put(v, y);
		rotor2.put(w, f);
		rotor2.put(x, v);
		rotor2.put(y, o);
		rotor2.put(z, e);

		return rotor2.get(value);
	}

	public int rotor2Inverse(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}
		
		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}


		HashMap<Integer, Integer> rotor2Inverse = new HashMap<Integer, Integer>();
	    rotor2Inverse.put(a, a);
	    rotor2Inverse.put(b, j);
	    rotor2Inverse.put(c, p);
		rotor2Inverse.put(d, c);
		rotor2Inverse.put(e, z);
		rotor2Inverse.put(f, w);
		rotor2Inverse.put(g, r);
		rotor2Inverse.put(h, l);
		rotor2Inverse.put(i, f);
		rotor2Inverse.put(j, b);
		rotor2Inverse.put(k, d);
		rotor2Inverse.put(l, k);
		rotor2Inverse.put(m, o);
		rotor2Inverse.put(n, t);
		rotor2Inverse.put(o, y);
		rotor2Inverse.put(p, u);
		rotor2Inverse.put(q, q);
		rotor2Inverse.put(r, g);
		rotor2Inverse.put(s, e);
		rotor2Inverse.put(t, n);
		rotor2Inverse.put(u, h);
		rotor2Inverse.put(v, x);
		rotor2Inverse.put(w, m);
		rotor2Inverse.put(x, i);
		rotor2Inverse.put(y, v);
		rotor2Inverse.put(z, s);

		return rotor2Inverse.get(value);
	}

	public int rotor3(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}

		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}

		HashMap<Integer, Integer> rotor3 = new HashMap<Integer, Integer>();
	    rotor3.put(a, b);
	    rotor3.put(b, d);
	    rotor3.put(c, f);
		rotor3.put(d, h);
		rotor3.put(e, j);
		rotor3.put(f, l);
		rotor3.put(g, c);
		rotor3.put(h, p);
		rotor3.put(i, r);
		rotor3.put(j, t);
		rotor3.put(k, x);
		rotor3.put(l, v);
		rotor3.put(m, z);
		rotor3.put(n, n);
		rotor3.put(o, y);
		rotor3.put(p, e);
		rotor3.put(q, i);
		rotor3.put(r, w);
		rotor3.put(s, g);
		rotor3.put(t, a);
		rotor3.put(u, k);
		rotor3.put(v, m);
		rotor3.put(w, u);
		rotor3.put(x, s);
		rotor3.put(y, q);
		rotor3.put(z, o);

		return rotor3.get(value);
	}

	public int rotor3Inverse(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}
		
		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}


		HashMap<Integer, Integer> rotor3Inverse = new HashMap<Integer, Integer>();
	    rotor3Inverse.put(a, t);
	    rotor3Inverse.put(b, a);
	    rotor3Inverse.put(c, g);
		rotor3Inverse.put(d, b);
		rotor3Inverse.put(e, p);
		rotor3Inverse.put(f, c);
		rotor3Inverse.put(g, s);
		rotor3Inverse.put(h, d);
		rotor3Inverse.put(i, q);
		rotor3Inverse.put(j, e);
		rotor3Inverse.put(k, u);
		rotor3Inverse.put(l, f);
		rotor3Inverse.put(m, v);
		rotor3Inverse.put(n, n);
		rotor3Inverse.put(o, z);
		rotor3Inverse.put(p, h);
		rotor3Inverse.put(q, x);
		rotor3Inverse.put(r, i);
		rotor3Inverse.put(s, x);
		rotor3Inverse.put(t, j);
		rotor3Inverse.put(u, w);
		rotor3Inverse.put(v, l);
		rotor3Inverse.put(w, r);
		rotor3Inverse.put(x, k);
		rotor3Inverse.put(y, o);
		rotor3Inverse.put(z, m);

		return rotor3Inverse.get(value);
	}

	public int rotor4(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}

		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}

		HashMap<Integer, Integer> rotor4 = new HashMap<Integer, Integer>();
	    rotor4.put(a, e);
	    rotor4.put(b, s);
	    rotor4.put(c, o);
		rotor4.put(d, v);
		rotor4.put(e, p);
		rotor4.put(f, z);
		rotor4.put(g, j);
		rotor4.put(h, a);
		rotor4.put(i, y);
		rotor4.put(j, q);
		rotor4.put(k, u);
		rotor4.put(l, i);
		rotor4.put(m, r);
		rotor4.put(n, h);
		rotor4.put(o, x);
		rotor4.put(p, l);
		rotor4.put(q, n);
		rotor4.put(r, f);
		rotor4.put(s, t);
		rotor4.put(t, g);
		rotor4.put(u, k);
		rotor4.put(v, d);
		rotor4.put(w, c);
		rotor4.put(x, m);
		rotor4.put(y, w);
		rotor4.put(z, b);

		return rotor4.get(value);
	}

	public int rotor4Inverse(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}
		
		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}


		HashMap<Integer, Integer> rotor4Inverse = new HashMap<Integer, Integer>();
	    rotor4Inverse.put(a, h);
	    rotor4Inverse.put(b, z);
	    rotor4Inverse.put(c, w);
		rotor4Inverse.put(d, v);
		rotor4Inverse.put(e, a);
		rotor4Inverse.put(f, r);
		rotor4Inverse.put(g, t);
		rotor4Inverse.put(h, n);
		rotor4Inverse.put(i, l);
		rotor4Inverse.put(j, g);
		rotor4Inverse.put(k, u);
		rotor4Inverse.put(l, p);
		rotor4Inverse.put(m, x);
		rotor4Inverse.put(n, q);
		rotor4Inverse.put(o, c);
		rotor4Inverse.put(p, e);
		rotor4Inverse.put(q, j);
		rotor4Inverse.put(r, m);
		rotor4Inverse.put(s, b);
		rotor4Inverse.put(t, s);
		rotor4Inverse.put(u, k);
		rotor4Inverse.put(v, d);
		rotor4Inverse.put(w, y);
		rotor4Inverse.put(x, o);
		rotor4Inverse.put(y, i);
		rotor4Inverse.put(z, f);

		return rotor4Inverse.get(value);
	}

	public int rotor5(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}

		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}

		HashMap<Integer, Integer> rotor5 = new HashMap<Integer, Integer>();
	    rotor5.put(a, v);
	    rotor5.put(b, z);
	    rotor5.put(c, b);
		rotor5.put(d, r);
		rotor5.put(e, g);
		rotor5.put(f, i);
		rotor5.put(g, t);
		rotor5.put(h, y);
		rotor5.put(i, u);
		rotor5.put(j, p);
		rotor5.put(k, s);
		rotor5.put(l, d);
		rotor5.put(m, n);
		rotor5.put(n, h);
		rotor5.put(o, l);
		rotor5.put(p, x);
		rotor5.put(q, a);
		rotor5.put(r, w);
		rotor5.put(s, m);
		rotor5.put(t, j);
		rotor5.put(u, q);
		rotor5.put(v, o);
		rotor5.put(w, f);
		rotor5.put(x, e);
		rotor5.put(y, c);
		rotor5.put(z, k);

		return rotor5.get(value);

	}

	public int rotor5Inverse(int value, int preset)
	{
		int a=1-(preset-1);
		if(preset>(27))
		{
			a = (-1)*(preset%27 - (27));
		}
		if(preset%27 == 0)
		{
			a=1;
		}
		if(1-(preset-1)<1)
		{
			a = 27-preset + 1;
		}
		
		int b=2-(preset-1);
		if(preset>(2+26))
		{
			b = (-1)*(preset%27 - (28));
		}
		if(preset%27 == 0)
		{
			b=2;
		}
		if(2-(preset-1)<1)
		{
			b = 27-preset + 2;
		}
		int c=3-(preset-1);
		if(preset>(3+26))
		{
			c = (-1)*(preset%27 - (3+26));
		}
		if(preset%27 == 0)
		{
			c=3;
		}
		if(3-(preset-1)<1)
		{
			c = 27-preset + 3;
		}
		int d=4-(preset-1);
		if(preset>(4+26))
		{
			d = (-1)*(preset%27 - (4+26));
		}
		if(preset%27 == 0)
		{
			d=4;
		}
		if(4-(preset-1)<1)
		{
			d = 27-preset + 4;
		}
		int e=5-(preset-1);
		if(preset>(5+26))
		{
			e = (-1)*(preset%27 - (5+26));
		}
		if(preset%27 == 0)
		{
			e=5;
		}
		if(5-(preset-1)<1)
		{
			e = 27-preset + 5;
		}
		int f=6-(preset-1);
		if(preset>(6+26))
		{
			f = (-1)*(preset%27 - (6+26));
		}
		if(preset%27 == 0)
		{
			f=6;
		}
		if(6-(preset-1)<1)
		{
			f = 27-preset + 6;
		}
		int g=7-(preset-1);
		if(preset>(7+26))
		{
			g = (-1)*(preset%27 - (7+26));
		}
		if(preset%27 == 0)
		{
			g=7;
		}
		if(7-(preset-1)<1)
		{
			g = 27-preset + 7;
		}
		int h=8-(preset-1);
		if(preset>(8+26))
		{
			h = (-1)*(preset%27 - (8+26));
		}
		if(preset%27 == 0)
		{
			h=8;
		}
		if(8-(preset-1)<1)
		{
			h = 27-preset + 8;
		}
		int i=9-(preset-1);
		if(preset>(9+26))
		{
			i = (-1)*(preset%27 - (9+26));
		}
		if(preset%27 == 0)
		{
			i=9;
		}
		if(9-(preset-1)<1)
		{
			i = 27-preset + 9;
		}
		int j=10-(preset-1);
		if(preset>(10+26))
		{
			j = (-1)*(preset%27 - (10+26));
		}
		if(preset%27 == 0)
		{
			j=10;
		}
		if(10-(preset-1)<1)
		{
			j = 27-preset + 10;
		}
		int k=11-(preset-1);
		if(preset>(11+26))
		{
			k = (-1)*(preset%27 - (11+26));
		}
		if(preset%27 == 0)
		{
			k=11;
		}
		if(11-(preset-1)<1)
		{
			k = 27-preset + 11;
		}
		int l=12-(preset-1);
		if(preset>(12+26))
		{
			l = (-1)*(preset%27 - (12+26));
		}
		if(preset%27 == 0)
		{
			l=12;
		}
		if(12-(preset-1)<1)
		{
			l = 27-preset + 12;
		}
		int m=13-(preset-1);
		if(preset>(13+26))
		{
			m = (-1)*(preset%27 - (13+26));
		}
		if(preset%27 == 0)
		{
			m=13;
		}
		if(13-(preset-1)<1)
		{
			m = 27-preset + 13;
		}
		int n=14-(preset-1);
		if(preset>(14+26))
		{
			n = (-1)*(preset%27 - (14+26));
		}
		if(preset%27 == 0)
		{
			n=14;
		}
		if(14-(preset-1)<1)
		{
			n = 27-preset + 14;
		}
		int o=15-(preset-1);
		if(preset>(15+26))
		{
			o = (-1)*(preset%27 - (15+26));
		}
		if(preset%27 == 0)
		{
			o=15;
		}
		if(15-(preset-1)<1)
		{
			o = 27-preset + 15;
		}
		int p=16-(preset-1);
		if(preset>(16+26))
		{
			p = (-1)*(preset%27 - (16+26));
		}
		if(preset%27 == 0)
		{
			p=16;
		}
		if(16-(preset-1)<1)
		{
			p = 27-preset + 16;
		}
		int q=17-(preset-1);
		if(preset>(17+26))
		{
			q = (-1)*(preset%27 - (17+26));
		}
		if(preset%27 == 0)
		{
			q=17;
		}
		if(17-(preset-1)<1)
		{
			q = 27-preset + 17;
		}
		int r=18-(preset-1);
		if(preset>(18+26))
		{
			r = (-1)*(preset%27 - (18+26));
		}
		if(preset%27 == 0)
		{
			r=18;
		}
		if(18-(preset-1)<1)
		{
			r = 27-preset + 18;
		}
		int s=19-(preset-1);
		if(preset>(19+26))
		{
			s = (-1)*(preset%27 - (19+26));
		}
		if(preset%27 == 0)
		{
			s=19;
		}
		if(19-(preset-1)<1)
		{
			s = 27-preset + 19;
		}
		int t=20-(preset-1);
		if(preset>(20+26))
		{
			t = (-1)*(preset%27 - (20+26));
		}
		if(preset%27 == 0)
		{
			t=20;
		}
		if(20-(preset-1)<1)
		{
			t = 27-preset + 20;
		}

		int u=21-(preset-1);

		if(preset>(21+26))
		{
			u = (-1)*(preset%27 - (21+26));
		}
		if(preset%27 == 0)
		{
			u=21;
		}
		if(21-(preset-1)<1)
		{
			u = 27-preset + 21;
		}

		int v=22-(preset-1);

		if(preset>(22+26))
		{
			v = (-1)*(preset%27 - (22+26));
		}
		if(preset%27 == 0)
		{
			v=22;
		}
		if(22-(preset-1)<1)
		{
			v = 27-preset + 22;
		}

		int w=23-(preset-1);

		if(preset>(23+26))
		{
			w = (-1)*(preset%27 - (23+26));
		}
		if(preset%27 == 0)
		{
			w=23;
		}
		if(23-(preset-1)<1)
		{
			w = 27-preset + 23;
		}

		int x=24-(preset-1);

		if(preset>(24+26))
		{
			x = (-1)*(preset%27 - (24+26));
		}
		if(preset%27 == 0)
		{
			x=24;
		}
		if(24-(preset-1)<1)
		{
			x = 27-preset + 24;
		}

		int y=25-(preset-1);

		if(preset>(25+26))
		{
			y = (-1)*(preset%27 - (25+26));
		}
		if(preset%27 == 0)
		{
			y=25;
		}
		if(25-(preset-1)<1)
		{
			y = 27-preset + 25;
		}

		int z=26-(preset-1);
		
		if(preset>(26+26))
		{
			z = (-1)*(preset%27 - (26+27));
		}
		if(preset%27 == 0)
		{
			z=26;
		}
		if(26-(preset-1)<1)
		{
			z = 27-preset + 26;
		}


		HashMap<Integer, Integer> rotor5Inverse = new HashMap<Integer, Integer>();
	    rotor5Inverse.put(a, q);
	    rotor5Inverse.put(b, c);
	    rotor5Inverse.put(c, y);
		rotor5Inverse.put(d, l);
		rotor5Inverse.put(e, x);
		rotor5Inverse.put(f, w);
		rotor5Inverse.put(g, e);
		rotor5Inverse.put(h, n);
		rotor5Inverse.put(i, f);
		rotor5Inverse.put(j, t);
		rotor5Inverse.put(k, z);
		rotor5Inverse.put(l, o);
		rotor5Inverse.put(m, s);
		rotor5Inverse.put(n, m);
		rotor5Inverse.put(o, v);
		rotor5Inverse.put(p, j);
		rotor5Inverse.put(q, u);
		rotor5Inverse.put(r, d);
		rotor5Inverse.put(s, k);
		rotor5Inverse.put(t, g);
		rotor5Inverse.put(u, i);
		rotor5Inverse.put(v, a);
		rotor5Inverse.put(w, r);
		rotor5Inverse.put(x, p);
		rotor5Inverse.put(y, h);
		rotor5Inverse.put(z, b);

		return rotor5Inverse.get(value);
	}

	public int reflectorUKWC(char value)
	{
		 HashMap<Character, Integer> reflectorUKWC = new HashMap<Character, Integer>();
	    reflectorUKWC.put('A', 6);
	    reflectorUKWC.put('B', 22);
	    reflectorUKWC.put('C', 16);
		reflectorUKWC.put('D', 10);
		reflectorUKWC.put('E', 9);
		reflectorUKWC.put('F', 1);
		reflectorUKWC.put('G', 15);
		reflectorUKWC.put('H', 25);
		reflectorUKWC.put('I', 5);
		reflectorUKWC.put('J', 4);
		reflectorUKWC.put('K', 18);
		reflectorUKWC.put('L', 26);
		reflectorUKWC.put('M', 24);
		reflectorUKWC.put('N', 23);
		reflectorUKWC.put('O', 7);
		reflectorUKWC.put('P', 3);
		reflectorUKWC.put('Q', 20);
		reflectorUKWC.put('R', 11);
		reflectorUKWC.put('S', 21);
		reflectorUKWC.put('T', 17);
		reflectorUKWC.put('U', 19);
		reflectorUKWC.put('V', 2);
		reflectorUKWC.put('W', 14);
		reflectorUKWC.put('X', 13);
		reflectorUKWC.put('Y', 8);
		reflectorUKWC.put('Z', 12);

		return reflectorUKWC.get(value);

	}

	public static int alphabet(char letter)
	{
		 HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();
	    alphabet.put('A', 1);
	    alphabet.put('B', 2);
	    alphabet.put('C', 3);
		alphabet.put('D', 4);
		alphabet.put('E', 5);
		alphabet.put('F', 6);
		alphabet.put('G', 7);
		alphabet.put('H', 8);
		alphabet.put('I', 9);
		alphabet.put('J', 10);
		alphabet.put('K', 11);
		alphabet.put('L', 12);
		alphabet.put('M', 13);
		alphabet.put('N', 14);
		alphabet.put('O', 15);
		alphabet.put('P', 16);
		alphabet.put('Q', 17);
		alphabet.put('R', 18);
		alphabet.put('S', 19);
		alphabet.put('T', 20);
		alphabet.put('U', 21);
		alphabet.put('V', 22);
		alphabet.put('W', 23);
		alphabet.put('X', 24);
		alphabet.put('Y', 25);
		alphabet.put('Z', 26);

		return alphabet.get(letter);
	}

	public static char alphabetInv(int value)
	{
		HashMap<Integer, Character> alphabetInv = new HashMap<Integer, Character>();
	    alphabetInv.put(1, 'A');
	    alphabetInv.put(2, 'B');
	    alphabetInv.put(3, 'C');
		alphabetInv.put(4, 'D');
		alphabetInv.put(5, 'E');
		alphabetInv.put(6, 'F');
		alphabetInv.put(7, 'G');
		alphabetInv.put(8, 'H');
		alphabetInv.put(9, 'I');
		alphabetInv.put(10, 'J');  
		alphabetInv.put(11, 'K');
		alphabetInv.put(12, 'L');
		alphabetInv.put(13, 'M');
		alphabetInv.put(14, 'N');
		alphabetInv.put(15, 'O');
		alphabetInv.put(16, 'P');
		alphabetInv.put(17, 'Q');
		alphabetInv.put(18, 'R');
		alphabetInv.put(19, 'S');
		alphabetInv.put(20, 'T');
		alphabetInv.put(21, 'U');
		alphabetInv.put(22, 'V');
		alphabetInv.put(23, 'W');
		alphabetInv.put(24, 'X');
		alphabetInv.put(25, 'Y');
		alphabetInv.put(26, 'Z');

		return alphabetInv.get(value);
	}
}
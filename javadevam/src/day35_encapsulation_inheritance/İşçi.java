package day35_encapsulation_inheritance;

public class ���i extends Muhasebe{
	protected String stat�;
	protected String mesle�i;
	protected String sendika;
public ���i(){
	System.out.println("i��i parametresiz constructor �al��t�");
}
	public static void main(String[] args) {
		
		���i i��i1=new ���i();
		i��i1.mesle�i="kaynak��";
		i��i1.saat�creti=20;
		i��i1.isim="emine";
		i��i1.maa�=i��i1.maa�Hesaplama();
System.out.println(i��i1.isim + " in maa�� : " +i��i1.maa�);

	}

}

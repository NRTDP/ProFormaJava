package com.proForma;

public class ProFormaMainEntry {

	public static void main(String[] args) {
		ProFormaParser parser = new ProFormaParser();
		
		// Best practice 1
		ProFormaTerm term = parser.parseString("[Acetyl]-S[Phospho|+79.966331]GRGK[Acetyl|UNIMOD:1|+42.010565]QGGKARAKAKTRSSRAGLQFPVGRVHRLLRKGNYAERVGAGAPVYLAAVLEYLTAEILELAGNAARDNKKTRIIPRHLQLAIRNDEELNKLLGKVTIAQGGVLPNIQAVLLPKKT[UNIMOD:21]ESHHKAKGK");
		System.out.println(term.sequence);
		// Should output "SGRGKQGGKARAKAKTRSSRAGLQFPVGRVHRLLRKGNYAERVGAGAPVYLAAVLEYLTAEILELAGNAARDNKKTRIIPRHLQLAIRNDEELNKLLGKVTIAQGGVLPNIQAVLLPKKTESHHKAKGK"

		// Best practice 2
		term = parser.parseString("MTLFQLREHWFVYKDDEKLTAFRNK[p-adenosine|R:N6-(phospho-5'-adenosine)-L-lysine| RESID:AA0227| MOD:00232| N6AMPLys]SMLFQRELRPNEEVTWK");
		System.out.println(term.sequence);
		// Should output "MTLFQLREHWFVYKDDEKLTAFRNKSMLFQRELRPNEEVTWK"
		
		// Best practice 3
		term = parser.parseString("MTLFQLDEKLTA[-37.995001|info:unknown modification]FRNKSMLFQRELRPNEEVTWK");
		System.out.println(term.sequence);
		// Should output "MTLFQLDEKLTAFRNKSMLFQRELRPNEEVTWK"
	}
}

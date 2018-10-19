package me.sumithpuri.github.pattaya.state;

/*
 * @author Sumith Puri
 */
public class ShoppingClientApp {

	public static void main(String args[]) {
		
		demonstrate();
	}

	public static void demonstrate() {
		
		PerItemWorkflow shopping = new PerItemWorkflow();
		shopping.purchase("Sony Cam X100");
		System.out.println();
		shopping.dispatch();
		shopping.assemble();
		shopping.complete();
		
		shopping = new PerItemWorkflow();
		System.out.println();
		shopping.purchase("Freeview G951");
		shopping.authorise();
		shopping.assemble();
		shopping.dispatch();
		shopping.complete();
		
		shopping = new PerItemWorkflow();
		System.out.println();
		shopping.purchase("PlugPlay Cord");
		shopping.authorise();
		shopping.dispatch();
		shopping.complete();
		
		shopping = new PerItemWorkflow();
		System.out.println();
		shopping.purchase("AgeOfEmpires CD");
		shopping.purchase("AgeOfEmpires CD");
		shopping.authorise();
		shopping.authorise();
		shopping.dispatch();
		shopping.complete();
	}
}

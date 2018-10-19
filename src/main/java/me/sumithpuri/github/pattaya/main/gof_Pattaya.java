package me.sumithpuri.github.pattaya.main;

import me.sumithpuri.github.pattaya.adapter.SamsungStorageTestApp;
import me.sumithpuri.github.pattaya.facade.AccountsCentralApp;
import me.sumithpuri.github.pattaya.iterator.ProductMenuTester;
import me.sumithpuri.github.pattaya.state.ShoppingClientApp;
import me.sumithpuri.github.pattaya.template.SoftwareConsultancyApp;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2008/12/design-patterns-series-ii.html
 * Blog Short URL		https://goo.gl/XCc2gx
 * Package Prefix 		me.sumithpuri.github.pattaya
 * Project Codename		pattaya
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/* 
 * You may run this main class to run all the Demo Code of the [Pattaya] Project. It demonstrates five of most important
 * Gang of Four (GoF) Design Patterns using Core Java.
 */
public class gof_Pattaya {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Pattaya");
		System.out.println("Project Description   GoF Design Patterns Companion Code Samples (02/02)");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/XCc2gx");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[01. Adapter Design Pattern (GoF)]");
		adapter();
		System.out.println("------------------------------------------------------------");
		System.out.println("[02. Facade Design Pattern (GoF)]");
		facade();
		System.out.println("------------------------------------------------------------");
		System.out.println("[03. Iterator Design Pattern (GoF)]");
		iterator();
		System.out.println("------------------------------------------------------------");
		System.out.println("[04. Template Design Pattern (GoF)]");
		template();
		System.out.println("------------------------------------------------------------");
		System.out.println("[05. State Design Pattern (GoF)]");
		state();
		System.out.println("------------------------------------------------------------");
		System.out.println("[Note: Refer Provided Code, Run One-By-One to Understand Thoroughly!]");
		System.out.println();
	}
	
	
	private static void adapter() {
		
		SamsungStorageTestApp samsungStorageApp = new SamsungStorageTestApp();
		samsungStorageApp.demonstrate();
	}

	private static void facade() {
		
		AccountsCentralApp accountsCentral = new AccountsCentralApp();
		accountsCentral.demonstrate();
	}
	
	private static void iterator() {
		
		ProductMenuTester productMenuTester = new ProductMenuTester();
		productMenuTester.demonstrate();
	}
	
	private static void template() {
		
		SoftwareConsultancyApp softwareConsultancy = new SoftwareConsultancyApp();
		softwareConsultancy.demonstrate();
	}

	private static void state() {
		
		ShoppingClientApp shoppingClient = new ShoppingClientApp();
		shoppingClient.demonstrate();
	}
}

package me.sumithpuri.github.pattaya.state;

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
public class DispatchState implements State {

	PerItemWorkflow shopping;
	
	public DispatchState(PerItemWorkflow shopping) {
		this.shopping = shopping;
	}
	
	@Override
	public void assemble() {
		System.out.println(" -> Already Assembled ");
		
	}

	@Override
	public void authorise() {
		System.out.println(" -> Already Authorised ");
		
	}

	@Override
	public void dispatch() {
		System.out.println(" -> Already Dispatched ");
		
	}

	@Override
	public void purchase() {
		System.out.println(" -> Already Purchased ");
		
	}
	
	public void complete() {
		System.out.println(" -> Back to Selection ");
		shopping.setSelectionState(shopping.getSelectionState());
	}

	
}
